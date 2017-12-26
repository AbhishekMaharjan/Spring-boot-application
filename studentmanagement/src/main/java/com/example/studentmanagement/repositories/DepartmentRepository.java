/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.studentmanagement.repositories;

import com.example.studentmanagement.entities.Department;
import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author User
 */
public interface DepartmentRepository extends JpaRepository<Department,Long> 
{
    Department findByDepartmentName(String departmentName);
}
