import java.util.ArrayList;
import java.util.List;

public class Calculos {
	
	public String calculadora(String expressao) {
        String resultado;
        List<Double> listaNumeros = new ArrayList<Double>();
        List<Character> listaOperadores = new ArrayList<Character>();
        
        listaNumeros = obterNumeros(expressao);
        listaOperadores = obterOperadores(expressao);
        resultado = calcularValor(listaNumeros, listaOperadores);
        return resultado;
    }

    private String calcularValor(List<Double> listaNumeros, List<Character> listaOperadores) {
        if (listaNumeros.isEmpty()) return "0";
        double total = listaNumeros.get(0);
        for (int i = 0; i < listaOperadores.size(); i++) {
            char operador = listaOperadores.get(i);

            if (operador == '%') {
                continue;
            } 

            double proximoNumero = listaNumeros.get(i + 1);

            if (i + 1 < listaOperadores.size() && listaOperadores.get(i + 1) == '%') {
                if (operador == '*' || operador == '/') {
                    proximoNumero = proximoNumero / 100.0;
                } else if (operador == '+' || operador == '-') {
                    proximoNumero = total * (proximoNumero / 100.0);
                }
                i++;
            }

            total = executarOperacao(total, operador, proximoNumero);
        }
        return "" + total;
    }

    private double executarOperacao(double numero1, char operador, double numero2) {
        switch (operador) {
            case '+': return numero1 + numero2;
            case '-': return numero1 - numero2;
            case '*': return numero1 * numero2;
            case '/': return numero1 / numero2;
            default: return numero2;
        }
    }

    private List<Double> obterNumeros(String expressao) {
        List<Double> listaNumeros = new ArrayList<Double>();
        StringBuilder numeroEmString = new StringBuilder();
        boolean negativo = false;

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (c == '(' && i + 1 < expressao.length() && expressao.charAt(i + 1) == '-') {
                negativo = true;
                i++;
                continue;
            }
            if (c == ')') {
                if (numeroEmString.length() > 0) {
                    try {
                        Double numero = Double.valueOf(numeroEmString.toString().replace(',', '.'));
                        if (negativo) numero = -numero;
                        listaNumeros.add(numero);
                    } catch (NumberFormatException e) {
                        // ignora números inválidos
                    }
                    numeroEmString.setLength(0);
                    negativo = false;
                }
                continue;
            }
            if (isOperador(c)) {
                if (numeroEmString.length() > 0) {
                    try {
                        Double numero = Double.valueOf(numeroEmString.toString().replace(',', '.'));
                        if (negativo) numero = -numero;
                        listaNumeros.add(numero);
                    } catch (NumberFormatException e) {
                        // ignora números inválidos
                    }
                    numeroEmString.setLength(0);
                    negativo = false;
                }
            } else if (Character.isDigit(c) || c == ',') {
                numeroEmString.append(c);
            }
        }

        if (numeroEmString.length() > 0) {
            try {
                Double numero = Double.valueOf(numeroEmString.toString().replace(',', '.'));
                if (negativo) numero = -numero;
                listaNumeros.add(numero);
            } catch (NumberFormatException e) {
                // ignora números inválidos
            }
        }

        return listaNumeros;
    }

    private List<Character> obterOperadores(String expressao) {
        List<Character> listaOperadores = new ArrayList<Character>();
        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);
            if (isOperador(c)) {
                if (c == '-' && i > 0 && expressao.charAt(i - 1) == '(') {
                    continue;
                }
                listaOperadores.add(c);
            }
        }
        return listaOperadores;
    }

    private boolean isOperador(char caracter) {
        return caracter == '-' || caracter == '+' || caracter == '/' || caracter == '*' || caracter == '%';
    }
}
