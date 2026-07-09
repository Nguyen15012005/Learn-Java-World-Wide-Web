package iuh.fit.midterm01.repository.impl;

import iuh.fit.midterm01.util.JpaUtil;
import jakarta.persistence.EntityManager;

/**
 * @author Nguyễn Nam Trung Nguyên
 * @version 1.0
 * @MSSV 23640731
 * @Class DHKTPM19ATT
 * @since 7/9/2026
 */
public class GenericRepositoryImpl<T> implements iuh.fit.midterm01.repository.GenericRepository<T> {
    public Class<T> type;

    public GenericRepositoryImpl(Class<T> type) {
        this.type = type;
    }

    @Override
    public void save(T entity) {
        EntityManager em = JpaUtil.getEmf().createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            em.close();
        }
    }

    @Override
    public void delete(Long id){
        EntityManager em = JpaUtil.getEmf().createEntityManager();

        try {
            em.getTransaction().begin();
            T entity = em.find(type, id);
            if(entity != null) em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            em.close();
        }
    }

    @Override
    public T findById(Long id){
        EntityManager em = JpaUtil.getEmf().createEntityManager();
        try {
            return em.find(type, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            em.close();
        }

        return null;
    }
}
