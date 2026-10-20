package org.project.invoice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class InvoiceItemId implements Serializable {

    @Column(name = "invoice_id")
    private Long invoiceId;

    @Column(name = "item_id")
    private Long itemId;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceItemId that = (InvoiceItemId) o;
        return Objects.equals(invoiceId, that.invoiceId) && Objects.equals(itemId, that.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceId, itemId);
    }
}
