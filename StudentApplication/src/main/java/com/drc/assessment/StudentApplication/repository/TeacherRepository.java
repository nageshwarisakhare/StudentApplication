package com.drc.assessment.StudentApplication.repository;

import com.drc.assessment.StudentApplication.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,String> {
}
