package org.project.invoice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "invoice_sequences")
public class InvoiceSequence {

    @Id
    private Long organizationId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    @MapsId
    private Organization organization;

    @Column(name = "last_number", nullable = false)
    private Long lastNumber;
}
