import java.math.BigDecimal;

public class Cargo {
	private String descricao;
	private BigDecimal Salario;
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getSalario() {
		return Salario;
	}
	public void setSalario(BigDecimal salario) {
		Salario = salario;
	}
}
