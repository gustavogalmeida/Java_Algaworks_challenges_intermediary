import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		double doubleValor = scanner.nextDouble();
		System.out.print("Digite a porcentagem: ");
		int intPorcentagem = scanner.nextInt();
		
		BigDecimal bigResultado = calcula(intPorcentagem, doubleValor);
		String strResultado = formata(bigResultado);
		System.out.println("Valor descontado: " + strResultado);
	}
	
	public static BigDecimal calcula (int intPorcentagem, double valor) {
		double porcentagem = intPorcentagem/100.0;
		BigDecimal bigPorcentagem = new BigDecimal(porcentagem);
		BigDecimal resultado = new BigDecimal(valor);
		return resultado.multiply(bigPorcentagem);
	}
	
	public static String formata(BigDecimal valor) {
		DecimalFormat decimalFormat = new DecimalFormat("R$ #,##0.00");
		return decimalFormat.format(valor);
	}
}
