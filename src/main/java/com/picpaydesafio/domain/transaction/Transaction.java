package com.picpaydesafio.domain.transaction;

import com.picpaydesafio.domain.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "Transactions")
@Table(name = "Transactions")
@Data
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
public class Transaction {
    private Long id;

    private BigDecimal ammount;

    @OneToMany
    @JoinColumn(name = "sender_id")
    private User sender;

    @OneToMany
    @JoinColumn(name = "receiver_id")
    private User receiver;

    private LocalDateTime timestamp;
}
