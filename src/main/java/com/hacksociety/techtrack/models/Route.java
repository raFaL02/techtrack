package com.hacksociety.techtrack.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;


@Table(name = "route")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private StatusRoute status;

    @ManyToOne
    @JoinColumn(name = "employee")
    private Employee employee;

    @Column(name = "created_at")
    private LocalTime createdAt;
}
