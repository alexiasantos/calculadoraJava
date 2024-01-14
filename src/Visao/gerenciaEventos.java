package Visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Acoes.Operacoes;

import javax.swing.JButton;

public class gerenciaEventos implements ActionListener {
	private Calculadora calculadoraVisao;
	
	private Operacoes  OperacoesVisao;
	public gerenciaEventos(Calculadora calc) {
		this.calculadoraVisao = calc;
		OperacoesVisao  = new Operacoes();

	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bt = (JButton) e.getSource();
		String btnText = bt.getText();
		String txtNumeros = "0123456789";
		if(btnText.equalsIgnoreCase("-")) {
			tratarSubtracao();
		}
		else if(btnText.equals("/")) {
		tratarDivisao();
		}
		else if(btnText.equals("+")) {
			tratarSoma();
		}
		else if (btnText.equals("*")) {
			tratarMultiplicacao();
		}
		else if (btnText.equals("=")) {
			tratarIgual();
		}
		else if (btnText.equals("C")) {
			limparNumero();
		}
		else if(txtNumeros.contains(btnText)) 
			this.calculadoraVisao.addNumeroPainel(bt.getText());
		}

	

	private void tratarIgual() {
		String numeroPainel2 = calculadoraVisao.getNumeroPainel2();
		float valor = Float.parseFloat(numeroPainel2);
		OperacoesVisao.addNum(valor);
		float resultado = OperacoesVisao.Calcular();
		calculadoraVisao.configuraNumeroPainel(String.valueOf(resultado));
		OperacoesVisao.resetaPosicao();
		
	}

	private void tratarSubtracao() {
		float valor = Float.parseFloat(calculadoraVisao.getNumeroPainel2());
		OperacoesVisao.addNum(valor);
		OperacoesVisao.setOperacao(Operacoes.OPERACAO_SUBTRACAO);
		calculadoraVisao.limpaPainel();
		
		}
	private void tratarDivisao() {
		
		float valor = Float.parseFloat(calculadoraVisao.getNumeroPainel2());
		OperacoesVisao.addNum(valor);
		OperacoesVisao.setOperacao(Operacoes.OPERACAO_DIVISAO);
		calculadoraVisao.limpaPainel();
	}
	
	private void tratarSoma() {
		float valor = Float.parseFloat(calculadoraVisao.getNumeroPainel2());
		OperacoesVisao.addNum(valor);
		OperacoesVisao.setOperacao(Operacoes.OPERACAO_SOMA);
		calculadoraVisao.limpaPainel();
		}
	
	private void tratarMultiplicacao() {
		float valor = Float.parseFloat(calculadoraVisao.getNumeroPainel2());
		OperacoesVisao.addNum(valor);
		OperacoesVisao.setOperacao(Operacoes.OPERACAO_MULTIPLICACAO);
		calculadoraVisao.limpaPainel();
		
	}
	private void limparNumero() {
		calculadoraVisao.limpaPainel();
	}
	
	}
		
