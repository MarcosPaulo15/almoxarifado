package Entities;

public class entities {
	private Integer codigo;

	private String descricao;

	private Double saldo;
	
	public entities() {
		
	}

	public entities(int codigo, String descricao, double saldo) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.saldo = saldo;
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return descricao;
	}

	public void setNome(String nome) {
		this.descricao = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Codigo=" + codigo + ", nome=" + descricao + ", saldo=" + saldo;
	}

}
