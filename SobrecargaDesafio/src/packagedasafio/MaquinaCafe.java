package packagedasafio;
public class MaquinaCafe {
	
	private int acucarDisponivel;
	private int quantidadeAcucar;
	
	public static void main(String[] args) {
		MaquinaCafe maquina = new MaquinaCafe();
		maquina.acucarDisponivel = 30;

		maquina.fazerCafe();
		maquina.fazerCafe(20);

		maquina.fazerCafe(100);
	}
	
	public void fazerCafe() {
		fazerCafe(10);
	}
	
	public void fazerCafe(int quantidadeAcucar) {
		if (this.acucarDisponivel >= quantidadeAcucar) {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo seu café com " + quantidadeAcucar + " gramas de açucar.");
		} else {
			System.out.println("Não temos açucar suficiente para fazer seu café!");
		}
	}
}
