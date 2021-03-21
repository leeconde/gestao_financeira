package dao;

import entities.Lancamento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LancamentoDao {

  private static LancamentoDao instance;

  protected EntityManager entityManager;

  public static LancamentoDao getInstance() {
    if (instance == null) {
      instance = new LancamentoDao();
    }
    return instance;
  }

  private LancamentoDao() {
    entityManager = getEntityManager();
  }

  private EntityManager getEntityManager() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("gestao_financeira");
    if (entityManager == null) {
      entityManager = factory.createEntityManager();
    }
    return entityManager;
  }

  public Lancamento findById(int id) {
    return entityManager.find(Lancamento.class, id);
  }

  public List<Lancamento> findAll() {
    return entityManager.createQuery("FROM " + Lancamento.class.getName()).getResultList();
  }

  public void createLancamento(Lancamento lancarOperacao) {
    try {
      entityManager.getTransaction().begin();
      entityManager.persist(lancarOperacao);
      entityManager.getTransaction().commit();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

}