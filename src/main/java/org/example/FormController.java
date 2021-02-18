package org.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class FormController {

    private Long orderId = null;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    public void transferId(Long id) {
        orderId = id;

        System.out.println(orderId);
    }
}
