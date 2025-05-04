package org.example.probematura.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends User{
    @ElementCollection
    @CollectionTable(name="customer_address",joinColumns = @JoinColumn(name="customer_id"))
    private List<Address> addresses;
    @Enumerated(EnumType.STRING)
    private CustomerType type;
    @Column(nullable = false)
    private String note;

}
