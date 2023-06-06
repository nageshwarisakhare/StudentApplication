package com.drc.assessment.StudentApplication.service;

import com.drc.assessment.StudentApplication.model.Teacher;
import com.drc.assessment.StudentApplication.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class TeacherService implements UserDetailsService {

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final Teacher teacher = teacherRepository.findByUsername(username);
        if (teacher == null) {
            throw new UsernameNotFoundException(username);
        }
        UserDetails user = User.withUsername(teacher.getEmail()).password(teacher.getPassword()).authorities("USER").build();
        return user;
    }
}
