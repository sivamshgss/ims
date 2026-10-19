package org.project.invoice.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "organizations")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String name;

    @OneToMany(mappedBy = "organization")
    private List<UserOrganization> memberships = new ArrayList<>();

    @OneToMany(mappedBy = "organization")
    private List<Customer> customers = new ArrayList<>();
}
