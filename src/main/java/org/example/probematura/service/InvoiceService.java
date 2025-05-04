package org.example.probematura.service;

import org.example.probematura.domain.Employee;
import org.example.probematura.domain.Invoice;
import org.example.probematura.dto.DistinctArticleDto;
import org.example.probematura.dto.SaleByEmployeeDto;
import org.example.probematura.help.ArticlePurchaseView;
import org.example.probematura.help.EmployeeSaleView;
import org.example.probematura.repository.InvoiceRespository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvoiceService {
    InvoiceRespository invoiceRepository;
    public InvoiceService(InvoiceRespository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }
    public SaleByEmployeeDto toSaleByEmployeeDto(EmployeeSaleView v) {
        return new SaleByEmployeeDto(v.getNumber(),v.getDate(),v.getFirstName(),v.getLastName(),v.getPrice());
    }
    public List<SaleByEmployeeDto> findSalesByEmployee(Employee e){
        List<EmployeeSaleView> invoices=invoiceRepository.findInvoiceByEmployee(e);
        List<SaleByEmployeeDto> dto=new ArrayList<SaleByEmployeeDto>();
        for(EmployeeSaleView i:invoices){
            dto.add(toSaleByEmployeeDto(i));
        }
        return dto;
    }
}
