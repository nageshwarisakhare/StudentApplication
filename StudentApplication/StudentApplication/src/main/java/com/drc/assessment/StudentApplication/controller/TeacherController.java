package com.drc.assessment.StudentApplication.controller;

import com.drc.assessment.StudentApplication.model.Teacher;
import com.drc.assessment.StudentApplication.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("teacher/login")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/byUsername")
    public UserDetails login(@RequestBody Teacher teacher){
        return teacherService.loadUserByUsername(teacher.getUsername());
    }
}
