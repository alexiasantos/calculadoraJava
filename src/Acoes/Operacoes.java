package Acoes;

public class Operacoes {
	public static final String OPERACAO_SUBTRACAO = "-";
	public static final String OPERACAO_DIVISAO = "/";
	public static final String OPERACAO_SOMA = "+";
	public static final String OPERACAO_MULTIPLICACAO = "*";
	private float num1;
	private float num2;
	private int posicao;
	private String Operacao;
	
	public Operacoes() {
		posicao = 1;
	}
	
	public float Calcular() {
		if (Operacao.equalsIgnoreCase("-")) {
			this.num1=this.num1-this.num2;
			this.posicao=2;
			return this.num1;
		}else if (Operacao.equalsIgnoreCase("+")) {
			this.num1= this.num1+this.num2;
			this.posicao= 2;
			return this.num1;
		}else if (Operacao.equalsIgnoreCase("/")) {
			this.num1=this.num1/this.num2;
			this.posicao=2;
			return this.num1;
		}else if (Operacao.equalsIgnoreCase("*")) {
			this.num1=this.num1*this.num2;
			this.posicao=2;
			return this.num1;
		}else {
			return 0;
		}
		
	}
	
	public void addNum(float num) {
		if(posicao==1) {
			this.num1=num;
			posicao=2;
		}else {
			this.num2=num;
			posicao=1;
		}
		
	}
	public void resetaPosicao() {
		this.posicao = 1;
	}
	public void setOperacao(String operacao) {
		Operacao = operacao;
	}
}
