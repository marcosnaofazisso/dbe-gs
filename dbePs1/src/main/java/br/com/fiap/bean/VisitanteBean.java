package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.file.UploadedFile;

import br.com.fiap.dao.VisitanteDao;
import br.com.fiap.model.Visitante;
import br.com.fiap.service.UploadService;

//RM86904 Marcos Vinicius Mendes Ferreira
//RM88849 Priscila Nastacio Fernandes de Sá

//esse e o bean do visitante, chamaremos de VisitorBean que instancias visitantes
@Named
@RequestScoped
public class VisitanteBean {

	private Visitante visitante = new Visitante();

	@Inject
	private VisitanteDao dao;

	private UploadedFile image;

	public String save() {
		System.out.println("Aqui esta um visitante ============[ " + this.visitante + "]");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		visitante.setImagePath(UploadService.write(image, "visitantes"));
		dao.create(visitante);

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Visitor sucessful registered !!!!!!!!!"));

		return "visitantes";
	}

	public List<Visitante> getAll() {
		return dao.listAll();
	}

	public Visitante getSetup() {
		return visitante;
	}

	public void setSetup(Visitante setup) {
		this.visitante = setup;
	}

	public UploadedFile getImage() {
		return image;
	}

	public void setImage(UploadedFile image) {
		this.image = image;
	}

	public Visitante getVisitante() {
		return visitante;
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}
}
