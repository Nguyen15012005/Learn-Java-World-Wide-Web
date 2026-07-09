package iuh.fit.midterm01.repository;

import iuh.fit.midterm01.entity.Department;

import java.util.List;

/**
 * @author Nguyễn Nam Trung Nguyên
 * @version 1.0
 * @MSSV 23640731
 * @Class DHKTPM19ATT
 * @since 7/9/2026
 */
public interface DepartmentRepository extends GenericRepository<Department> {
    List<Department> findAll();

    List<Department> findByName(String deptName);

    void update(Long id, Department newDepartment);
}
