package br.com.fiap.bean;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.model.file.UploadedFile;
import br.com.fiap.dao.VisitorDao;
import br.com.fiap.model.Visitor;
import br.com.fiap.service.UploadService;

//RM86904 Marcos Vinicius Mendes Ferreira
//RM88849 Priscila Nastacio Fernandes de Sá

//esse e o bean do visitante, chamaremos de VisitorBean que instancias visitantes
@Named
@RequestScoped
public class VisitorBean {

	private Visitor visitante = new Visitor();
	@Inject
	private VisitorDao dao;
	private UploadedFile image;

	public String save() {
		// para sabermos como ta ficando no console
		System.out.println(this.visitante);

		visitante.setImagePath(UploadService.write(image, "visitantes"));
		dao.create(visitante);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Visitante cadastrado com sucesso"));
		return "visitantes";
	}

	public List<Visitor> getAll() {
		return dao.listAll();
	}

	public Visitor getSetup() {
		return visitante;
	}

	public void setSetup(Visitor setup) {
		this.visitante = setup;
	}

	public UploadedFile getImage() {
		return image;
	}

	public void setImage(UploadedFile image) {
		this.image = image;
	}

}
