package com.aronalvarenga;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {
	Main() {

		JFrame frame = new JFrame("Button Example");
		JTextField textfield = new JTextField();
		JTextArea textarea = new JTextArea();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Quiz Game - Coleta Seletiva");
		frame.setSize(650, 650);
		frame.getContentPane().setBackground(new Color(29, 229, 114));
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(
				Toolkit.getDefaultToolkit().getImage(getClass().getResource("/isolated-green-recycle-symbol.png")));

		JButton game = new JButton("Começar");
		game.setBounds(240, 245, 160, 50);

		JButton comoJogar = new JButton("Instruções");
		comoJogar.setBounds(240, 300, 160, 50);

		JButton sair = new JButton("Sair");
		sair.setBounds(240, 355, 160, 50);

		textfield.setBounds(0, 0, 650, 50);
		textfield.setBackground(new Color(25, 88, 25));
		textfield.setForeground(new Color(255, 255, 255));
		textfield.setFont(new Font("Courier", Font.BOLD, 30));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);

		frame.add(textfield);

		textarea.setBounds(0, 50, 650, 50);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(25, 187, 25));
		textarea.setForeground(new Color(255, 255, 255));
		textarea.setFont(new Font("Courier", Font.BOLD, 25));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);

		frame.add(textarea);

		textfield.setText("Quiz Game - Coleta Seletiva");
		textarea.setText("     Aron Alvarenga - Java Developer");

		frame.add(game);
		frame.add(sair);
		frame.add(comoJogar);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		game.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Game initGame = new Game();
				frame.setVisible(false);

			}
		});

		comoJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HowToPlay howTo = new HowToPlay();
				frame.setVisible(false);
			}
		});

		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		new Main();
	}
}
