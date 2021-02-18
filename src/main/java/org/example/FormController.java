package org.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class FormController {

    private Long orderId;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    public void transferId(Long id) {

        if (id >= 0) {
            orderId = id;
//            getPaymentDetails(Long id);
        } else {
            orderId = null;
        }

        System.out.println(orderId);
    }
}
