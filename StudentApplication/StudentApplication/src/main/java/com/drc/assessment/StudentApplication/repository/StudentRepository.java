package com.drc.assessment.StudentApplication.repository;

import com.drc.assessment.StudentApplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
