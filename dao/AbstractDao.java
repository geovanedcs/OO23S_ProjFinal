import javax.persistence.EntityManager;
import java.util.List;


public class DAO<T> {
	private final EntityManager em;
	private final Class<T> classe;

	public DAO(EntityManager em, Class<T> classe) {
		this.em = em;
		this.classe = classe;
	}

	public T busca(Integer id) {
		return this.em.getReference(classe, id);
	}

	public List<T> lista() {
		return em.createQuery("select a from " + classe.getName() + " a").getResultList();
	}

	public void adiciona(T t) {
		this.em.getTransaction().begin();
		this.em.persist(t);
		this.em.flush();
		this.em.getTransaction().commit();
	}
	
	public void remove(T t) {
		this.em.getTransaction().begin();
		this.em.remove(t);
		this.em.flush();
		this.em.getTransaction().commit();
	}

	public T atualiza(T t) {
		this.em.getTransaction().begin();
		t = this.em.merge(t);		
		this.em.flush();
		this.em.getTransaction().commit();
		return t;
	}

	public void removeQuery(T t, Integer chave) {
		this.em.getTransaction().begin();
		this.em.createQuery("delete from " + classe.getName() + " where codigo = " + chave).executeUpdate();
		this.em.flush();
		this.em.getTransaction().commit();
	}
}