package com.learnspringboot.react_springboot_library.repository;

import com.learnspringboot.react_springboot_library.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findByUserEmail(String userEmail);
}
