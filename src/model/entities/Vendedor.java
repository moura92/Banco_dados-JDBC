package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Vendedor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String email;
	private Date dataNascimento;
	private Double salario;

	private Departamento departamento;

	public Vendedor() {
	}

	public Vendedor(Integer id, String nome, String email, Date dataNascimento, Double salario,
			Departamento departamento) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
		this.departamento = departamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmil() {
		return email;
	}

	public void setEmil(String emil) {
		this.email = emil;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedor other = (Vendedor) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "ID: " 
				+ id 
				+ "\nNome: " 
				+ nome 
				+ "\nEmail: " 
				+ email 
				+ "\nData Nascimento: " 
				+ dataNascimento
				+ "\nSalario: " 
				+ salario 
				+ "\nDepartamento: " 
				+ departamento;
	}

}