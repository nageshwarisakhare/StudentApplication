package com.drc.assessment.StudentApplication.controller;

import com.drc.assessment.StudentApplication.model.Student;
import com.drc.assessment.StudentApplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
     return studentService.saveStudent(student);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
       return studentService.updateStudent(student);
    }

    @GetMapping("/getById/{rollNo}")
    public Optional<Student> getStudentById(@PathVariable int rollNo){
        return studentService.getStudentById(rollNo);
    }
    @GetMapping("/getAllStudents")
    public Page<Student> getAllStudents(Pageable pageable){
    return studentService.getAllStudents(pageable);
    }

}
