package dev.romanruiz.springboottutorial.service;

import dev.romanruiz.springboottutorial.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DeptService {
    public  Department saveDepartment(Department department);

    public List<Department> fetchDeptList();

    public Optional<Department> fetchDeptById(Long deptId);

    public void deleteDeptById(Long deptId);

    public Department updateDept(Long deptId, Department department);
}
