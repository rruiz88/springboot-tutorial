package dev.romanruiz.springboottutorial.repository;

import dev.romanruiz.springboottutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends JpaRepository<Department, Long> {
}
