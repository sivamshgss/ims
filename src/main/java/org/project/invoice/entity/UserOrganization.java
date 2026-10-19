package org.project.invoice.entity;

import jakarta.persistence.*;
import org.project.invoice.enums.OrganizationRole;

@Entity
@Table(name = "user_organization")
public class UserOrganization {

    @EmbeddedId
    private UserOrganizationId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("organizationId")
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private OrganizationRole role;
}
