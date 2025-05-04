package org.example.probematura.help;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface EmployeeSaleView {
    Integer getNumber();
    LocalDateTime getDate();
    String getFirstName();
    String getLastName();
    BigDecimal getPrice();
}
