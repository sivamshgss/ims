package org.project.invoice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserOrganizationId implements Serializable {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "organization_id")
    private Long organizationId;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserOrganizationId that = (UserOrganizationId) o;
        return Objects.equals(userId, that.userId) && Objects.equals(organizationId, that.organizationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, organizationId);
    }
}
