package org.example.probematura.repository;

import org.example.probematura.domain.Employee;
import org.example.probematura.domain.Invoice;
import org.example.probematura.dto.SaleByEmployeeDto;
import org.example.probematura.help.EmployeeSaleView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRespository extends JpaRepository {
    List<EmployeeSaleView> findInvoiceByEmployee(Employee employee);
}