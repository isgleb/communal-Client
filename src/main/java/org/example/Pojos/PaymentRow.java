package org.example.Pojos;

import javafx.beans.property.SimpleStringProperty;

import java.util.Date;

import lombok.*;

@Data
@AllArgsConstructor
public class PaymentRow {

    private Long id;
    private String name;
    private String address;
    private int amount;
    private Date period;
}
