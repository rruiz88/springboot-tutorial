package dev.romanruiz.springboottutorial.service;


import dev.romanruiz.springboottutorial.entity.Department;
import dev.romanruiz.springboottutorial.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptRepository deptRepository;
    @Override
    public Department saveDepartment(Department department) {
        return deptRepository.save(department);
    }

    @Override
    public List<Department> fetchDeptList() {
        return deptRepository.findAll();
    }

    @Override
    public Optional<Department> fetchDeptById(Long deptId) {
        return deptRepository.findById(deptId);
    }

    @Override
    public void deleteDeptById(Long deptId) {
        deptRepository.deleteById(deptId);
    }

    @Override
    public Department updateDept(Long deptId, Department department) {
        Department deptDB = deptRepository.findById(deptId).get();

        if (Objects.nonNull(department.getDeptName()) && !"".equalsIgnoreCase(
                department.getDeptName()
        )) {
            deptDB.setDeptName(department.getDeptName());
        }


        if (Objects.nonNull(department.getDeptCode()) && !"".equalsIgnoreCase(
                department.getDeptCode()
        )) {
            deptDB.setDeptCode(department.getDeptCode());
        }


        if (Objects.nonNull(department.getDeptAddress()) && !"".equalsIgnoreCase(
                department.getDeptAddress()
        )) {
            deptDB.setDeptAddress(department.getDeptAddress());
        }
        return deptRepository.save(deptDB);
    }
}
