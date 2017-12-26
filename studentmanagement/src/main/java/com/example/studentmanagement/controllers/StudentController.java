
package com.example.studentmanagement.controllers;

import com.example.studentmanagement.dtos.StudentDTO;
import com.example.studentmanagement.entities.Department;
import com.example.studentmanagement.entities.Student;
import com.example.studentmanagement.repositories.DepartmentRepository;
import com.example.studentmanagement.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/students")
    public ResponseEntity<?> saveStudent(@RequestBody StudentDTO dto){
            Student student = new Student();
    student.setFirstName(dto.getFirstName());
    student.setLastName(dto.getLastName());
    student.setAddress(dto.getAddress());
    
    Department department = departmentRepository.findByDepartmentName(dto.getDepartmentNAme());
    student.setDepartment(department);
    studentRepository.save(student);
    return ResponseEntity.ok("new student saved");
    
            }
    
    
}