package org.example.probematura.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SaleByEmployeeDto(
        Integer number,
        LocalDateTime date,
        String firstName,
        String lastName,
        BigDecimal price
) {
}
