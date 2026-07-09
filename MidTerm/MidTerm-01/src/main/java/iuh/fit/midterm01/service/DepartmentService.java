package iuh.fit.midterm01.service;

import iuh.fit.midterm01.entity.Department;

import java.util.List;

/**
 * @author Nguyễn Nam Trung Nguyên
 * @version 1.0
 * @MSSV 23640731
 * @Class DHKTPM19ATT
 * @since 7/9/2026
 */
public interface DepartmentService {
    List<Department> findAll();

    List<Department> findByName(String deptName);

    void update(Long id, Department newDepartment);

    void save(Department department);

    void delete(Long id);

    Department findById(Long id);
}
