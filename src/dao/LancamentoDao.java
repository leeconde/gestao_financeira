package dao;

import entities.Lancamento;
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