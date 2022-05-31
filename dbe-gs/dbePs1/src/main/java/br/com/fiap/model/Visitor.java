package br.com.fiap.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//RM86904 Marcos Vinicius Mendes Ferreira
//RM88849 Priscila Nastacio Fernandes de Sá

@Entity
public class Visitor {

//	aqui e a classe de um visitante, vamos deixar os atributos em portugues pra ficar mais legivel

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVisitante = 1L;
	private String nomeVisitante;
	private LocalDate dataNascimento;
	private Integer numeroCpf;
	private Integer numeroRg;
	private Integer numeroDigitoRg;
	private LocalDate dataCadastro = LocalDate.now(); // para que sempre o cadastro seja feito na data correta
	private String imagePath;

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Visitor() {
		super();
	}

	public Visitor(Long idVisitante, String nomeVisitante, LocalDate dataNascimento, Integer numeroCpf,
			Integer numeroRg, Integer numeroDigitoRg, LocalDate dataCadastro) {
		super();
		this.idVisitante = idVisitante;
		this.nomeVisitante = nomeVisitante;
		this.dataNascimento = dataNascimento;
		this.numeroCpf = numeroCpf;
		this.numeroRg = numeroRg;
		this.numeroDigitoRg = numeroDigitoRg;
		this.dataCadastro = dataCadastro;
	}

	public Long getIdVisitante() {
		return idVisitante;
	}

	public void setIdVisitante(Long idVisitante) {
		this.idVisitante = idVisitante;
	}

	public String getNomeVisitante() {
		return nomeVisitante;
	}

	public void setNomeVisitante(String nomeVisitante) {
		this.nomeVisitante = nomeVisitante;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(Integer numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public Integer getNumeroRg() {
		return numeroRg;
	}

	public void setNumeroRg(Integer numeroRg) {
		this.numeroRg = numeroRg;
	}

	public Integer getNumeroDigitoRg() {
		return numeroDigitoRg;
	}

	public void setNumeroDigitoRg(Integer numeroDigitoRg) {
		this.numeroDigitoRg = numeroDigitoRg;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Visitor [idVisitante=" + idVisitante + ", nomeVisitante=" + nomeVisitante + ", dataNascimento="
				+ dataNascimento + ", numeroCpf=" + numeroCpf + ", numeroRg=" + numeroRg + ", NumeroDigitoRg="
				+ numeroDigitoRg + ", dataCadastro=" + dataCadastro + "]";
	}

}