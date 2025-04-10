package com.hacksociety.techtrack.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Table(name = "employee")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @OneToOne
    @JoinColumn(name = "app_user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private StatusEmployee status;

    @OneToMany(mappedBy = "employee")
    private List<Location> locations = new ArrayList<>();

    @OneToMany(mappedBy = "employee")
    private List<Route> routes = new ArrayList<>();
}
