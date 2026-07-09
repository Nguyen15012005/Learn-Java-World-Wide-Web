package iuh.fit.midterm01.service.impl;

import iuh.fit.midterm01.entity.Department;
import iuh.fit.midterm01.repository.DepartmentRepository;
import iuh.fit.midterm01.repository.impl.DepartmentRepositoryImpl;
import java.util.List;

/**
 * @author Nguyễn Nam Trung Nguyên
 * @version 1.0
 * @MSSV 23640731
 * @Class DHKTPM19ATT
 * @since 7/9/2026
 */
public class DepartmentServiceImpl implements iuh.fit.midterm01.service.DepartmentService {

    public final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl() {
        departmentRepository = new DepartmentRepositoryImpl();
    }

    @Override
    public List<Department> findAll(){
        return departmentRepository.findAll();
    }

    @Override
    public List<Department> findByName(String deptName){
        return departmentRepository.findByName(deptName);
    }

    @Override
    public void update(Long id, Department newDepartment){
        departmentRepository.update(id,newDepartment);
    }
}
