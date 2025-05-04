package org.example.probematura.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Company extends AbstractPersistable<Long> {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Address address;
}
