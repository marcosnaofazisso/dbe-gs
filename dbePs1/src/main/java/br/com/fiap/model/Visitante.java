package br.com.fiap.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visitante {
	
	
//	aqui e a classe de um visitante, vamos deixar os atributos em portugues pra ficar mais legivel

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long visitorId = 1L;
	private String visitorName;
	private LocalDate birthDate;
	private String cpf;
	private String rg;
	private String rgDigit;
	private LocalDate registerDate = LocalDate.now(); // para que sempre o cadastro seja feito na data correta
	private String imagePath;

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Visitante() {
		super();
	}

	public Visitante(Long visitorId, String visitorName, LocalDate birthDate, String cpf, String rg, String rgDigit,
			LocalDate registerDate) {
		super();
		this.visitorId = visitorId;
		this.visitorName = visitorName;
		this.birthDate = birthDate;
		this.cpf = cpf;
		this.rg = rg;
		this.rgDigit = rgDigit;
		this.registerDate = registerDate;
	}

	public Long getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(Long visitorId) {
		this.visitorId = visitorId;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRgDigit() {
		return rgDigit;
	}

	public void setRgDigit(String rgDigit) {
		this.rgDigit = rgDigit;
	}

	public LocalDate getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}

	@Override
	public String toString() {
		return "Visitante [visitorId=" + visitorId + ", visitorName=" + visitorName + ", birthDate=" + birthDate
				+ ", cpf=" + cpf + ", rg=" + rg + ", rgDigit=" + rgDigit + ", registerDate=" + registerDate + "]";
	}

}