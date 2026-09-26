package com.StudentManagement.demo.repository;

import com.StudentManagement.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
