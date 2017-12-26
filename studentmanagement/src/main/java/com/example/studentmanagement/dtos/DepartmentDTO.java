
package com.example.studentmanagement.dtos;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDTO {
    private Long  departmentId;
    private String departmentName;
    private List<StudentDTO> studentList=new ArrayList<>();

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<StudentDTO> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentDTO> studentList) {
        this.studentList = studentList;
    }
    
    
}
