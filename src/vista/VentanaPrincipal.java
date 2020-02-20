package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import calculator.Main;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.CardLayout;

public class VentanaPrincipal {

	private JFrame frmCalculadoraProposicional;
	private JTextField txtExpresion;
	private Main m = new Main(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frmCalculadoraProposicional.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraProposicional = new JFrame();
		frmCalculadoraProposicional.setTitle("Calculadora proposicional");
		frmCalculadoraProposicional.setBounds(100, 100, 446, 167);
		frmCalculadoraProposicional.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jpPantalla = new JPanel();
		frmCalculadoraProposicional.getContentPane().add(jpPantalla, BorderLayout.NORTH);
		jpPantalla.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtExpresion = new JTextField();
		jpPantalla.add(txtExpresion);
		txtExpresion.setColumns(10);
		
		JPanel jpTeclado = new JPanel();
		frmCalculadoraProposicional.getContentPane().add(jpTeclado, BorderLayout.CENTER);
		jpTeclado.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNegacion = new JButton("Negacion");
		btnNegacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String e = txtExpresion.getText();
				e = e + "-";
				txtExpresion.setText(e);
			}
		});
		jpTeclado.add(btnNegacion);
		
		JButton btnConjuncion = new JButton("Conjuncion");
		btnConjuncion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ex = txtExpresion.getText();
				ex = ex + "y";
				txtExpresion.setText(ex);
			}
		});
		jpTeclado.add(btnConjuncion);
		
		JLabel label = new JLabel("");
		jpTeclado.add(label);
		
		JButton btnDisyuncion = new JButton("Disyuncion");
		btnDisyuncion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String e1 = txtExpresion.getText();
				e1 = e1 + "o";
				txtExpresion.setText(e1);
			}
		});
		jpTeclado.add(btnDisyuncion);
		
		JLabel label_1 = new JLabel("");
		jpTeclado.add(label_1);
		
		JLabel label_2 = new JLabel("");
		jpTeclado.add(label_2);
		
		JButton btnImplicacion = new JButton("Implicacion");
		btnImplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String e1 = txtExpresion.getText();
				e1 = e1 + "i";
				txtExpresion.setText(e1);
			}
		});
		jpTeclado.add(btnImplicacion);
		
		JLabel label_3 = new JLabel("");
		jpTeclado.add(label_3);
		
		JButton btnDobleImpl = new JButton("Doble Impl");
		btnDobleImpl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String e = txtExpresion.getText();
				e = e + "d";
				txtExpresion.setText(e);
			}
		});
		jpTeclado.add(btnDobleImpl);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				m.iniciar();
				txtExpresion.setText("");
			}
		});
		
		JLabel label_4 = new JLabel("");
		jpTeclado.add(label_4);
		
		JButton btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String e = txtExpresion.getText();
				e = e + "p";
				txtExpresion.setText(e);
			}
		});
		
		JButton btnParAbi = new JButton("(");
		btnParAbi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String e = txtExpresion.getText();
				e = e + "(";
				txtExpresion.setText(e);
			}
		});
		jpTeclado.add(btnParAbi);
		
		JButton btnParCerr = new JButton(")");
		btnParCerr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String e = txtExpresion.getText();
				e = e + ")";
				txtExpresion.setText(e);
			}
		});
		jpTeclado.add(btnParCerr);
		jpTeclado.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String e = txtExpresion.getText();
				e = e + "q";
				txtExpresion.setText(e);
			}
		});
		jpTeclado.add(btnQ);
		
		JLabel label_5 = new JLabel("");
		jpTeclado.add(label_5);
		
		JButton btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String e = txtExpresion.getText();
				e = e + "r";
				txtExpresion.setText(e);
			}
		});
		jpTeclado.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String e = txtExpresion.getText();
				e = e + "s";
				txtExpresion.setText(e);
			}
		});
		jpTeclado.add(btnS);
		
		JLabel label_6 = new JLabel("");
		jpTeclado.add(label_6);
		jpTeclado.add(btnCalcular);
		
		JLabel label_7 = new JLabel("");
		jpTeclado.add(label_7);
	}

	public JTextField getTxtExpresion() {
		return txtExpresion;
	}

	public void setTxtExpresion(JTextField txtExpresion) {
		this.txtExpresion = txtExpresion;
	}

}
