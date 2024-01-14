package Visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textNumero;
	private JButton button_11;
	
	public void addNumeroPainel(String num) {
		String valortxt = this.textNumero.getText();
		this.textNumero.setText(valortxt + num);
	}
	
	public void configuraNumeroPainel(String Numero) {
		this.textNumero.setText(Numero);
	}
	
	public String getNumeroPainel2() {
		return this.textNumero.getText();
	}
	
	public void limpaPainel() {
		this.textNumero.setText("");
	}
	
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

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setTitle("Calculadora ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelTopo = new JPanel();
		contentPane.add(panelTopo, BorderLayout.NORTH);
		panelTopo.setLayout(new BorderLayout(0, 0));
		
		textNumero = new JTextField();
		textNumero.setForeground(SystemColor.desktop);
		textNumero.setBackground(Color.WHITE);
		textNumero.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panelTopo.add(textNumero);
		textNumero.setColumns(10);
		textNumero.disable();
		
		JPanel panelTeclado = new JPanel();
		contentPane.add(panelTeclado, BorderLayout.CENTER);
		panelTeclado.setLayout(new MigLayout("", "[grow,fill][grow,fill][grow,fill][grow,fill]", "[grow,fill][grow,fill][grow,fill][grow,fill]"));
		
		JButton button = new JButton("9");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setForeground(new Color(0, 0, 0));
		button.setBackground(new Color(255, 153, 153));
		gerenciaEventos tratarEvento = new gerenciaEventos(this);
		button.addActionListener(tratarEvento);
		panelTeclado.add(button, "cell 0 0");
		
		JButton button_1 = new JButton("8");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_1.setBackground(new Color(255, 153, 153));
		button_1.addActionListener(tratarEvento);
		panelTeclado.add(button_1, "cell 1 0");
		
		JButton button_2 = new JButton("7");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_2.setBackground(new Color(255, 153, 153));
		button_2.addActionListener(tratarEvento);
		panelTeclado.add(button_2, "cell 2 0");
		
		JButton button_10 = new JButton("+");
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_10.addActionListener(tratarEvento);
		panelTeclado.add(button_10, "cell 3 0");
		
		JButton button_3 = new JButton("6");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_3.setBackground(new Color(255, 153, 153));
		button_3.addActionListener(tratarEvento);
		panelTeclado.add(button_3, "cell 0 1");
		
		JButton button_4 = new JButton("5");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_4.setBackground(new Color(255, 153, 153));
		button_4.addActionListener(tratarEvento);
		panelTeclado.add(button_4, "cell 1 1");
		
		JButton button_5 = new JButton("4");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_5.setBackground(new Color(255, 153, 153));
		button_5.addActionListener(tratarEvento);
		panelTeclado.add(button_5, "cell 2 1");
		
		button_11 = new JButton("-");
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_11.addActionListener(tratarEvento);
		panelTeclado.add(button_11, "cell 3 1");
		
		JButton button_7 = new JButton("3");
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_7.setBackground(new Color(255, 153, 153));
		button_7.addActionListener(tratarEvento);
		panelTeclado.add(button_7, "cell 0 2");
		
		JButton button_8 = new JButton("2");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_8.setBackground(new Color(255, 153, 153));
		button_8.addActionListener(tratarEvento);
		panelTeclado.add(button_8, "cell 1 2");
		
		JButton button_9 = new JButton("1");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_9.setBackground(new Color(255, 153, 153));
		button_9.addActionListener(tratarEvento);
		panelTeclado.add(button_9, "cell 2 2");
		
		JButton button_13 = new JButton("*");
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_13.addActionListener(tratarEvento);
		panelTeclado.add(button_13, "cell 3 2");
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnC.setBackground(new Color(255, 153, 153));
		btnC.addActionListener(tratarEvento);
		panelTeclado.add(btnC, "cell 0 3");
		
		JButton button_6 = new JButton("0");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_6.setBackground(new Color(255, 153, 153));
		button_6.addActionListener(tratarEvento);
		panelTeclado.add(button_6, "cell 1 3");
		
		JButton button_14 = new JButton("=");
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_14.setBackground(new Color(255, 153, 153));
		button_14.addActionListener(tratarEvento);
		panelTeclado.add(button_14, "cell 2 3");
		
		JButton button_12 = new JButton("/");
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_12.addActionListener(tratarEvento);
		panelTeclado.add(button_12, "cell 3 3");
	}

}
