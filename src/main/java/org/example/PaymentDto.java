package org.example;

import javafx.beans.property.SimpleStringProperty;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class PaymentDto {

    private Long id;
    private String name;
    private String address;
    private int amount;
    private Date period;

//    public PaymentDto(Long id, String name, String address, int amount, Date period) {
//        this.id = id;
//        this.name = new SimpleStringProperty(name);
//        Address = new SimpleStringProperty(address);
//        this.amount = amount;
//        this.period = period;
//    }
}
