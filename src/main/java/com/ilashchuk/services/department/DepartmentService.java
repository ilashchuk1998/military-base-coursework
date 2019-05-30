package com.ilashchuk.services.department;

import com.ilashchuk.model.Department;

import java.util.List;

public interface DepartmentService {
    Department insertDepartment(Department department);
    Department getDepartment(int id);
    Department updateDepartment(Department department);
    void deleteDepartment(int id);
    List<Department> getAll();
}
