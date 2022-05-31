package br.com.fiap.dao;

import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import br.com.fiap.model.Visitor;

//RM86904 Marcos Vinicius Mendes Ferreira
//RM88849 Priscila Nastacio Fernandes de Sá

// classe que data acess object
public class VisitorDao {

	@Inject
	private EntityManager manager;

	public void create(Visitor visitante) {
		manager.getTransaction().begin();
		manager.persist(visitante);
		manager.getTransaction().commit();

		manager.clear();
	}

	public List<Visitor> listAll() {

		TypedQuery<Visitor> query = manager.createQuery("SELECT u FROM Visitante u", Visitor.class);

		return query.getResultList();
	}
}