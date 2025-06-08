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
        int max = Math.min(listaOperadores.size(), listaNumeros.size() - 1);
        for (int i = 0; i < max; i++) {
            char operador = listaOperadores.get(i);
            double proximoNumero = listaNumeros.get(i + 1);
            total = executarOperacao(total, operador, proximoNumero);
        }
        return "" + total;
    }

    private double executarOperacao(double numero1, char operador, double numero2) {
        double resultado = 0.0;

        if (operador == '+') {
            resultado = numero1 + numero2;
        } else if (operador == '-') {
            resultado = numero1 - numero2;
        } else if (operador == '/') {
            resultado = numero1 / numero2;
        } else if (operador == '*') {
            resultado = numero1 * numero2;
        }

        return resultado;
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
        boolean isOperador = false;

        if (caracter == '-' || caracter == '+' || caracter == '/' || caracter == '*') {
            isOperador = true;
        }

        return isOperador;
    }
}
