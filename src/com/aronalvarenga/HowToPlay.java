package com.aronalvarenga;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HowToPlay {

	JFrame frame = new JFrame();
	JTextField titulo = new JTextField();
	JTextField subtitulo = new JTextField();

	ImageIcon lixeira0 = new ImageIcon(new ImageIcon(this.getClass().getResource("/sprite_lixeira0.png")).getImage()
			.getScaledInstance(120, 120, Image.SCALE_DEFAULT));
	ImageIcon lixeira1 = new ImageIcon(new ImageIcon(this.getClass().getResource("/sprite_lixeira1.png")).getImage()
			.getScaledInstance(120, 120, Image.SCALE_DEFAULT));
	ImageIcon lixeira2 = new ImageIcon(new ImageIcon(this.getClass().getResource("/sprite_lixeira2.png")).getImage()
			.getScaledInstance(120, 120, Image.SCALE_DEFAULT));
	ImageIcon lixeira3 = new ImageIcon(new ImageIcon(this.getClass().getResource("/sprite_lixeira3.png")).getImage()
			.getScaledInstance(120, 120, Image.SCALE_DEFAULT));

	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();

	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();

	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();

	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();

	public HowToPlay() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Quiz Game - Coleta Seletiva");
		frame.setSize(650, 650);
		frame.getContentPane().setBackground(new Color(29, 229, 114));
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(
				Toolkit.getDefaultToolkit().getImage(getClass().getResource("/isolated-green-recycle-symbol.png")));

		titulo.setBounds(0, 0, 650, 50);
		titulo.setBackground(new Color(25, 88, 25));
		titulo.setForeground(new Color(255, 255, 255));
		titulo.setFont(new Font("Courier", Font.BOLD, 30));
		titulo.setBorder(BorderFactory.createBevelBorder(1));
		titulo.setHorizontalAlignment(JTextField.CENTER);
		titulo.setEditable(false);

		subtitulo.setBounds(0, 50, 650, 50);
		subtitulo.setBackground(new Color(25, 187, 25));
		subtitulo.setForeground(new Color(255, 255, 255));
		subtitulo.setFont(new Font("Courier", Font.BOLD, 25));
		subtitulo.setBorder(BorderFactory.createBevelBorder(1));
		subtitulo.setHorizontalAlignment(JTextField.CENTER);
		subtitulo.setEditable(false);

		titulo.setText("Como Jogar");
		subtitulo.setText("Clique em...");

		buttonA.setBounds(5, 110, 100, 100);
		buttonA.setFont(new Font("Courier", Font.BOLD, 35));
		buttonA.setFocusable(false);
		buttonA.setIcon(lixeira0);

		buttonB.setBounds(5, 220, 100, 100);
		buttonB.setFont(new Font("Courier", Font.BOLD, 35));
		buttonB.setFocusable(false);
		buttonB.setIcon(lixeira1);

		buttonC.setBounds(5, 330, 100, 100);
		buttonC.setFont(new Font("MV Boli", Font.BOLD, 35));
		buttonC.setFocusable(false);
		buttonC.setIcon(lixeira2);

		buttonD.setBounds(5, 440, 100, 100);
		buttonD.setFont(new Font("MV Boli", Font.BOLD, 35));
		buttonD.setFocusable(false);
		buttonD.setIcon(lixeira3);

		answer_labelA.setBounds(125, 100, 500, 100);
		answer_labelA.setBackground(new Color(50, 50, 50));
		answer_labelA.setForeground(new Color(0, 0, 0));
		answer_labelA.setFont(new Font("Courier", Font.BOLD, 20));
		answer_labelA.setText("Caso o objeto seja feito de metal");

		answer_labelB.setBounds(125, 200, 500, 100);
		answer_labelB.setBackground(new Color(50, 50, 50));
		answer_labelB.setForeground(new Color(0, 0, 0));
		answer_labelB.setFont(new Font("Courier", Font.BOLD, 20));
		answer_labelB.setText("Caso o objeto seja feito de vidro");

		answer_labelC.setBounds(125, 300, 500, 100);
		answer_labelC.setBackground(new Color(50, 50, 50));
		answer_labelC.setForeground(new Color(0, 0, 0));
		answer_labelC.setFont(new Font("Courier", Font.BOLD, 20));
		answer_labelC.setText("Caso o objeto seja feito de plástico");

		answer_labelD.setBounds(125, 400, 500, 100);
		answer_labelD.setBackground(new Color(50, 50, 50));
		answer_labelD.setForeground(new Color(0, 0, 0));
		answer_labelD.setFont(new Font("Courier", Font.BOLD, 20));
		answer_labelD.setText("Caso o objeto seja feito de papel");

		frame.add(time_label);
		frame.add(seconds_left);
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(subtitulo);
		frame.add(titulo);
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		frame.setVisible(true);

		JButton game = new JButton("Jogar");
		game.setBounds(200, 530, 160, 50);

		JButton voltar = new JButton("Voltar");
		voltar.setBounds(380, 530, 160, 50);

		frame.add(game);
		frame.add(voltar);

		game.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Game jogo = new Game();
				frame.setVisible(false);

			}
		});

		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main menu = new Main();
				frame.setVisible(false);
			}
		});
	}

}
