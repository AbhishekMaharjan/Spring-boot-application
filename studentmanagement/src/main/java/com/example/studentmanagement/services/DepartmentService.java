/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.studentmanagement.services;

import com.example.studentmanagement.dtos.DepartmentDTO;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author User
 */
public interface DepartmentService  {
    
    List<DepartmentDTO> findAllDepartments();
    
}
