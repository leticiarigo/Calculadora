package br.edu.ifcvideira.Calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	DecimalFormat df = new DecimalFormat ("0.00");
	private JPanel contentPane;
	private JTextField txVl1;
	private JTextField txVl2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private DecimalFormat DecimalFormat(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalculadora = new JLabel("Calculadora");
		lblCalculadora.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 80));
		lblCalculadora.setBounds(20, 11, 414, 108);
		contentPane.add(lblCalculadora);
		
		JLabel vl1 = new JLabel("Valor 1:");
		vl1.setBounds(30, 130, 46, 14);
		contentPane.add(vl1);
		
		JLabel vl2 = new JLabel("Valor 2:");
		vl2.setBounds(30, 163, 46, 14);
		contentPane.add(vl2);
		
		txVl1 = new JTextField();
		txVl1.setBounds(78, 127, 107, 20);
		contentPane.add(txVl1);
		txVl1.setColumns(10);
		
		txVl2 = new JTextField();
		txVl2.setBounds(78, 160, 107, 20);
		contentPane.add(txVl2);
		txVl2.setColumns(10);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String vl1 = txVl1.getText();
				String vl2 = txVl2.getText();
				
				double vl1d = Double.parseDouble(vl1);
				double vl2d = Double.parseDouble(vl2);
				
				double total = vl1d + vl2d;
				
				JOptionPane.showMessageDialog(null, "O resultado da soma é: "+df.format(total));
			}
		});
		btnSoma.setBounds(218, 126, 89, 23);
		contentPane.add(btnSoma);
		
		JButton btnSubtrao = new JButton("-");
		btnSubtrao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String vl1 = txVl1.getText();
				String vl2 = txVl2.getText();
				
				double vl1d = Double.parseDouble(vl1);
				double vl2d = Double.parseDouble(vl2);
				
				double total = vl1d - vl2d;
				
				JOptionPane.showMessageDialog(null, "O resultado da subtração é: "+df.format(total));
			}
		});
		btnSubtrao.setBounds(317, 126, 89, 23);
		contentPane.add(btnSubtrao);
		
		JButton btnMultiplicao = new JButton("X");
		btnMultiplicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String vl1 = txVl1.getText();
				String vl2 = txVl2.getText();
				
				double vl1d = Double.parseDouble(vl1);
				double vl2d = Double.parseDouble(vl2);
				
				double total = vl1d * vl2d;
				
				JOptionPane.showMessageDialog(null, "O resultado da subtração é: "+df.format(total));
			}
		});
		btnMultiplicao.setBounds(218, 159, 89, 23);
		contentPane.add(btnMultiplicao);
		
		JButton btnDivisão = new JButton("/");
		btnDivisão.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String vl1 = txVl1.getText();
				String vl2 = txVl2.getText();
				
				double vl1d = Double.parseDouble(vl1);
				double vl2d = Double.parseDouble(vl2);
				
				double total = vl1d / vl2d;
				
				JOptionPane.showMessageDialog(null, "O resultado da subtração é: "+df.format(total));
			}
		});
		btnDivisão.setBounds(317, 159, 89, 23);
		contentPane.add(btnDivisão);
	}
}
