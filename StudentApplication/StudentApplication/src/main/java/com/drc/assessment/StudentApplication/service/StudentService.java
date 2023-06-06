package com.drc.assessment.StudentApplication.service;

import com.drc.assessment.StudentApplication.exceptions.AlreadyExistException;
import com.drc.assessment.StudentApplication.model.Student;
import com.drc.assessment.StudentApplication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student saveStudent(Student student){
        try{
            if(studentRepository.existsById(student.getRollNo())){
                throw new AlreadyExistException("Student already exist in database");
            }
            return studentRepository.save(student);
        }
        catch(AlreadyExistException e){
            e.printStackTrace();
        }
        return null;
    }

    public Student updateStudent(Student student){
       return studentRepository.save(student);
    }

    public Optional<Student> getStudentById(int rollNo){
        return studentRepository.findById(rollNo);
    }

    public Page<Student> getAllStudents(Pageable pageable){
        return studentRepository.findAll(pageable);
    }
}
