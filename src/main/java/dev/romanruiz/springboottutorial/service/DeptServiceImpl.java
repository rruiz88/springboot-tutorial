package dev.romanruiz.springboottutorial.service;


import dev.romanruiz.springboottutorial.entity.Department;
import dev.romanruiz.springboottutorial.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptRepository deptRepository;
    @Override
    public Department saveDepartment(Department department) {
        return deptRepository.save(department);
    }
}
