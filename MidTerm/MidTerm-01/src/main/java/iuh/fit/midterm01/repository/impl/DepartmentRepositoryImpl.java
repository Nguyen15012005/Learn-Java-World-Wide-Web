package iuh.fit.midterm01.repository.impl;

import iuh.fit.midterm01.entity.Department;
import iuh.fit.midterm01.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

/**
 * @author Nguyễn Nam Trung Nguyên
 * @version 1.0
 * @MSSV 23640731
 * @Class DHKTPM19ATT
 * @since 7/9/2026
 */
public class DepartmentRepositoryImpl extends GenericRepository<Department> implements iuh.fit.midterm01.repository.DepartmentRepository {

    public DepartmentRepositoryImpl() {
        super(Department.class);
    }

    @Override
    public List<Department> findAll(){
        EntityManager em = JpaUtil.getEmf().createEntityManager();

        try {
            String jpql = """
                    select d
                    from Department d
                    """;

            TypedQuery<Department> query = em.createQuery(jpql, Department.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            em.close();
        }
        return null;
    }

    @Override
    public List<Department> findByName(String deptName){
        EntityManager em = JpaUtil.getEmf().createEntityManager();

        try {
            String jpql = """
                    select d
                    from Department d
                    where d.name like :deptName
                    """;

            TypedQuery<Department> query = em.createQuery(jpql, Department.class).setParameter("deptName", "%" + deptName + "%");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            em.close();
        }
        return null;
    }

    @Override
    public void update(Long id, Department newDepartment){
        EntityManager em = JpaUtil.getEmf().createEntityManager();

        try {
            em.getTransaction().begin();
            Department department = em.find(Department.class, id);
            if (department != null){
                department.setName(newDepartment.getName());
            }

            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            em.close();
        }
    }
}
