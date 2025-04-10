package com.hacksociety.techtrack.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Table(name = "request")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "request_number")
    private String requestNumber;

    private String description;

    @Enumerated(EnumType.STRING)
    private StatusRequest status;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @Column(name = "created_at")
    private LocalTime createdAt;

    @Column(name = "ended_at")
    private LocalTime endedAt;
}
