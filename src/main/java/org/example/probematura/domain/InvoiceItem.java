package org.example.probematura.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceItem extends AbstractPersistable<Long> {
    @ManyToOne
    private Article article;
    @ManyToOne
    private Invoice invoice;
    @Column(nullable = false)
    private Integer quantity;
    @Column(nullable = false)
    private BigDecimal price;
}
