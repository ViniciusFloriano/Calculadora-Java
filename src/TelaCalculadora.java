public class TelaCalculadora extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	public TelaCalculadora() {
		initComponents();
	}

	private void initComponents() {
		this.setTitle("Calculadora Simples");
		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		visorCalculador = new javax.swing.JTextPane();
		botaoCE = new javax.swing.JButton();
		botao7 = new javax.swing.JButton();
		botao8 = new javax.swing.JButton();
		botao9 = new javax.swing.JButton();
		botao5 = new javax.swing.JButton();
		botao6 = new javax.swing.JButton();
		botao4 = new javax.swing.JButton();
		botao1 = new javax.swing.JButton();
		botao2 = new javax.swing.JButton();
		botao3 = new javax.swing.JButton();
		botao0 = new javax.swing.JButton();
		botaoVirgula = new javax.swing.JButton();
		botaoMaisMenos = new javax.swing.JButton();
		botaoVezes = new javax.swing.JButton();
		botaoDiv = new javax.swing.JButton();
		botaoMenos = new javax.swing.JButton();
		botaoMais = new javax.swing.JButton();
		botaoIgual = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jScrollPane1.setViewportView(visorCalculador);

		botaoCE.setText("CE");
		botaoCE.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botaoCEMouseClicked(evt);
			}
		});

		botao7.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botao7.setText("7");
		botao7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botao7MouseClicked(evt);
			}
		});

		botao8.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botao8.setText("8");
		botao8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botao8MouseClicked(evt);
			}
		});

		botao9.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botao9.setText("9");
		botao9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botao9MouseClicked(evt);
			}
		});

		botao4.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botao4.setText("4");
		botao4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botao4MouseClicked(evt);
			}
		});

		botao5.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botao5.setText("5");
		botao5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botao5MouseClicked(evt);
			}
		});

		botao6.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botao6.setText("6");
		botao6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botao6MouseClicked(evt);
			}
		});

		botao1.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botao1.setText("1");
		botao1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botao1MouseClicked(evt);
			}
		});

		botao2.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botao2.setText("2");
		botao2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botao2MouseClicked(evt);
			}
		});

		botao3.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botao3.setText("3");
		botao3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botao3MouseClicked(evt);
			}
		});

		botao0.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botao0.setText("0");
		botao0.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botao0MouseClicked(evt);
			}
		});

		botaoVirgula.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botaoVirgula.setText(",");
		botaoVirgula.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botaoVirgulaMouseClicked(evt);
			}
		});

		botaoMaisMenos.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botaoMaisMenos.setText("+/-");
		botaoMaisMenos.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botaoMaisMenosMouseClicked(evt);
			}
		});

		botaoVezes.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botaoVezes.setText("*");
		botaoVezes.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botaoVezesMouseClicked(evt);
			}
		});

		botaoDiv.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botaoDiv.setText("/");
		botaoDiv.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botaoDivMouseClicked(evt);
			}
		});

		botaoMenos.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botaoMenos.setText("-");
		botaoMenos.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botaoMenosMouseClicked(evt);
			}
		});

		botaoMais.setFont(new java.awt.Font("Ubuntu", 0, 24));
		botaoMais.setText("+");
		botaoMais.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botaoMaisMouseClicked(evt);
			}
		});

		botaoIgual.setText("=");
		botaoIgual.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				botaoIgualMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, true)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, true)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, Short.MAX_VALUE)
							.addGap(0, 0, 0))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, true)
								.addComponent(botaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 130, Short.MAX_VALUE)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
									.addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
									.addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
									.addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
									.addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
									.addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
									.addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE))
								.addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 130, Short.MAX_VALUE))
							.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, true)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
									.addComponent(botaoMaisMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
									.addComponent(botaoVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
									.addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
									.addComponent(botaoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
									.addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
									.addComponent(botaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
									.addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
									.addComponent(botaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
									.addComponent(botaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
									.addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)))
						)
					)
				)
		);

		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, true)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGap(30, 30, 30)
					.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
					.addGap(24, 24, 24)
					.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, true)
						.addComponent(botaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(botaoMaisMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(botaoVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, true)
						.addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(botaoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, true)
						.addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(botaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, true)
						.addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(botaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, true)
						.addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(botaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
		);

		jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]
				{botao7, botao8, botao9});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(31, Short.MAX_VALUE))
				);

		pack();
	}

	private void botaoCEMouseClicked(java.awt.event.MouseEvent evt) {
		visorCalculador.setText("");
	}

	private void botaoVezesMouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		visorCalculador.setText(valor + "*");
	}

	private void botao7MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		visorCalculador.setText(valor + "7");
	}

	private void botao8MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		visorCalculador.setText(valor + "8");
	}

	private void botao9MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		visorCalculador.setText(valor + "9");
	}

	private void botaoDivMouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		visorCalculador.setText(valor + "/");
	}

	private void botao4MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		visorCalculador.setText(valor + "4");
	}

	private void botao5MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		visorCalculador.setText(valor + "5");
	}

	private void botao6MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		visorCalculador.setText(valor + "6");
	}

	private void botaoMenosMouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		visorCalculador.setText(valor + "-");
	}

	private void botao1MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		visorCalculador.setText(valor + "1");
	}

	private void botao2MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		visorCalculador.setText(valor + "2");
	}

	private void botao3MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		visorCalculador.setText(valor + "3");
	}

	private void botaoMaisMouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		visorCalculador.setText(valor + "+");
	}

	private void botao0MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		visorCalculador.setText(valor + "0");
	}

	private void botaoVirgulaMouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		if (!valor.contains(",")) {
			visorCalculador.setText(valor + ",");
		}
		if (valor.isEmpty()) {
			visorCalculador.setText("0,");
		}
	}

	private void botaoMaisMenosMouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		if (valor.startsWith("-")) {
			visorCalculador.setText(valor.substring(1));
		} else {
			visorCalculador.setText("-" + valor);
		}
	}

	private void botaoIgualMouseClicked(java.awt.event.MouseEvent evt) {
		String valor = visorCalculador.getText();
		System.out.println(">>>"+valor);
		Calculos calculos = new Calculos();
		String resultado = calculos.calculadora(valor);

		visorCalculador.setText(resultado);
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info :
            javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        }
		
		// Criação e exibição da tela
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
	}

	// declaração de variáveis - não modificar
	private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
	private javax.swing.JButton botaoVirgula;
	private javax.swing.JButton botaoMaisMenos;
    private javax.swing.JButton botaoCE;
    private javax.swing.JButton botaoDiv;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoMais;
    private javax.swing.JButton botaoMenos;
    private javax.swing.JButton botaoVezes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane visorCalculador;
	// Fim da declaração de variáveis
}