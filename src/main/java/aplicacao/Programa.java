package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = enf.createEntityManager();

		pessoa p = em.find(pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();

		System.out.println("Acabou o sistema");
		em.close();
		enf.close();
	}

}
