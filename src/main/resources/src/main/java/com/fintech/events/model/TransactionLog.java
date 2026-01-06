package com.fintech.events.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "transaction_logs")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class TransactionLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String transactionId;
    private String status;
    private Double amount;
}
