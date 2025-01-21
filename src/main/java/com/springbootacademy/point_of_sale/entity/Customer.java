package com.springbootacademy.point_of_sale.entity;


import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
@TypeDefs({
        @TypeDef
        (name="json",typeClass= JsonType.class)})
public class Customer {
    @Id
    @Column(name = "customer_id",length = 45)
    private int customerId;

    @Column(name="customer_name",length = 100 ,nullable = false)
    private String customerName;

    @Column(name="customer_address",length =255)
    private String customerAddress;
    @Type(type = "json")
    @Column(name = "contact_number", columnDefinition = "json")
    private List<String> contactNumber;
    ;

    @Column(name = "nic")
    private String nic;

    @Column(name = "active_state",columnDefinition = "TINYINT default 0")
    private boolean active;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String customerAddress, ArrayList contactNumber, String nic, boolean active) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.contactNumber = contactNumber;
        this.nic = nic;
        this.active = active;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public List<String> getContactNumber() {
        return contactNumber;
    }

    public String getNic() {
        return nic;
    }

    public boolean isActive() {
        return active;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setContactNumber(List<String> contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", contactNumber=" + contactNumber +
                ", nic='" + nic + '\'' +
                ", active=" + active +
                '}';
    }
}
