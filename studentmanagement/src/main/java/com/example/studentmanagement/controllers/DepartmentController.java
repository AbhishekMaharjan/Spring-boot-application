
package com.example.studentmanagement.controllers;

import com.example.studentmanagement.entities.Department;
import com.example.studentmanagement.repositories.DepartmentRepository;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
   @Autowired
   private DepartmentRepository departmentRepository;
  
   @PostMapping("/departments")
   public ResponseEntity<?> saveDepartment(@RequestBody Department department){
       departmentRepository.save(department);
       return ResponseEntity.ok("new Student saved successfully");
   }
   @GetMapping("/departments")
   public ResponseEntity<?> getDepartmentList(){
       
       Iterable<Department> departmentList = departmentRepository.findAll();
       return ResponseEntity.ok(departmentList);
   }
   @PutMapping
   public ResponseEntity<?> updateDepartment(@RequestParam Long departmentId,@RequestBody Department department){
      Department oldDepartment=departmentRepository.findOne(departmentId);
      oldDepartment.setDepartmentName(department.getDepartmentName());
      return ResponseEntity.ok("Department updateed successfully");

    }
   @DeleteMapping
   public ResponseEntity<?> deleteDepartment(@RequestParam Long departmentId){
       departmentRepository.delete(departmentId);
       return ResponseEntity.ok("department delete successfully");
   }
}
