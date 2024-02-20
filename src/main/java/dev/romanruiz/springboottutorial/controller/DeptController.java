package dev.romanruiz.springboottutorial.controller;


import dev.romanruiz.springboottutorial.entity.Department;
import dev.romanruiz.springboottutorial.service.DeptService;
import dev.romanruiz.springboottutorial.service.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return deptService.saveDepartment(department);
    }
}
