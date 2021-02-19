package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class PaymentDetails {

    Long clientId;
    String ownersName;
    String address;
    Date period;
    int summ;

    int coldWater;
    int hotWater;
    int electricity;
    int repairment;

}
