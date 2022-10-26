import java.util.Scanner;

public class Calculadora {
	
	// v1 + v2
	
	Scanner scan = new Scanner(System.in);
	public void init() {
		String resposta;		
		do {	
			System.out.println("Informe o cálculo desejado (n1 op n2): ");
		
			String txt = scan.nextLine();
			String operacao[] = new String[3];
		
			operacao = txt.split(" ");
			if (operacao.length == 3){
				float valor1 = Float.parseFloat(operacao[0]);
				float valor2 = Float.parseFloat(operacao[2]);
		
				switch(operacao[1]){
				case "+":
					System.out.println(txt + " = " + this.adicao(valor1, valor2));
					break;
				case "-":
					System.out.println(txt + " = " + this.subtracao(valor1, valor2));
					break;
				case "*":
					System.out.println(txt + " = " + this.multiplicacao(valor1, valor2));
					break;
				case "/":
					System.out.println(txt + " = " + this.divisao(valor1, valor2));
					break;
				default:
					System.out.println("Operador incorreto");
					break;
				}
			} else System.out.println("Erro no formato");
		
			System.out.println("Deseja continuar? (digite S para sim) - ");
			resposta = "";
			resposta = scan.nextLine().toUpperCase();
			System.out.println(resposta);
		} while(resposta.equals("S"));
	}
	
	public float adicao(float v1, float v2) {
		return v1 + v2;
	}
	
	public float subtracao(float v1, float v2) {
		return v1 - v2;
	}
	
	public float multiplicacao(float v1, float v2) {
		return v1 * v2;
	}
	
	public float divisao(float v1, float v2) {
		return v1 / v2;
	}

}
