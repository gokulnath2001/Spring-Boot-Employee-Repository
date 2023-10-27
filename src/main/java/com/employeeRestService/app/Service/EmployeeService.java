package com.employeeRestService.app.Service;

import com.employeeRestService.app.DAO.EmployeesDAO;
import com.employeeRestService.app.Repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Component
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<EmployeesDAO> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<EmployeesDAO> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Boolean updateEmployee( EmployeesDAO employeesDAO) {
        if(employeeRepository.findById(employeesDAO.getId()).isPresent()) {
            employeeRepository.save(employeesDAO);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public void deleteEmployeeById( Long id ) {
        employeeRepository.deleteById(id);
    }
}
