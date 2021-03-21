package dao;

import entities.Lancamento;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LancarOperacaoDao {

  private static LancarOperacaoDao instance;

  protected EntityManager entityManager;

  public static LancarOperacaoDao getInstance() {
    if (instance == null) {
      instance = new LancarOperacaoDao();
    }
    return instance;
  }

  private LancarOperacaoDao() {
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