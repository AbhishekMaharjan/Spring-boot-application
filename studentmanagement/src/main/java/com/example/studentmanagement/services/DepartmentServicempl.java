/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.studentmanagement.services;

import com.example.studentmanagement.dtos.DepartmentDTO;
import com.example.studentmanagement.dtos.StudentDTO;
import com.example.studentmanagement.entities.Department;
import com.example.studentmanagement.repositories.DepartmentRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class DepartmentServicempl  implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<DepartmentDTO> findAllDepartments() {
        List<Department> departmentList=departmentRepository.findAll();
     
        departmentList.stream();
        
  
}
private Function<Department,DepartmentDTO > departmentDTOConverter = (d) -> {
    DepartmentDTO dto = new DepartmentDTO();
    dto.setDepartmentId(d.getDepartmentId());
    dto.setDepartmentName(d.getDepartmentName());
    List<StudentDTO> studentList = new ArrayList<>();
    
}