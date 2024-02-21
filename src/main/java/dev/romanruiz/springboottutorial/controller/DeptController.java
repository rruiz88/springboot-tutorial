package dev.romanruiz.springboottutorial.controller;


import dev.romanruiz.springboottutorial.entity.Department;
import dev.romanruiz.springboottutorial.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return deptService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDeptList() {
        return deptService.fetchDeptList();
    }

    @GetMapping("/departments/{id}")
    public Optional<Department> fetchDeptById(@PathVariable("id") Long deptId) {
        return deptService.fetchDeptById(deptId);
    }

    @DeleteMapping("/departments/delete/{id}")
    public String deleteDeptById(@PathVariable("id") Long deptId) {
       deptService.deleteDeptById(deptId);
       return "Department:" + deptId + " has been deleted!";
    }

    @PutMapping("/departments/{id}")
    public Department updateDept(@PathVariable("id") Long deptId, @RequestBody Department department) {
        return deptService.updateDept(deptId, department);
    }
}
