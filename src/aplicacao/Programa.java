package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		p1.setId(null);
		p1.setNome("Carlos da Silva");
		p1.setEmail("carlos@gmail.com");

		Pessoa p2 = new Pessoa();
		p2.setId(null);
		p2.setNome("Joaquim Torres");
		p2.setEmail("joaquim@gmail.com");

		Pessoa p3 = new Pessoa();
		p3.setId(null);
		p3.setNome("Ana Maria");
		p3.setEmail("ana@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();

		System.out.println("Pronto!");

	}

}
