package br.com.fiap.produto.produto.model;

public class Client {
	private Long id;
	private String cliente;
	private String documento;
	private String endereco;

	public Client(Long id, String cliente, String documento, String endereco) {
		super();
		this.cliente = cliente;
		this.documento = documento;
		this.endereco = endereco;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client() {
		
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}

}
