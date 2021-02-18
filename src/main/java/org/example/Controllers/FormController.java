package org.example.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.Pojos.PaymentDetails;

public class FormController implements Initializable {

    private Optional<Long> paymentId;

    private PaymentDetails paymentDetails;

    @FXML private TextField clientId;
    @FXML private TextField ownersName;
    @FXML private TextField address;
    @FXML private TextField sum;

    @FXML private TextField coldWater;
    @FXML private TextField hotWater;
    @FXML private TextField electricity;
    @FXML private TextField repairment;




    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    public void setId(Long id) {

        if (id >= 0) {
//            paymentId = id;
//            getPaymentDetails(Long id);
        } else {
            paymentId = null;
        }

        System.out.println(paymentId);
    }

    @FXML
    private void saveChanges() {


//        clientId.setText("0");
//        ownersName.setText("0");
//        address.setText("0");
//        sum.setText("0");
//
//        coldWater.setText("0");
//        hotWater.setText("0");
//        electricity.setText("0");
//        repairment.setText("no");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        if (paymentId.isPresent()) {
            PaymentDetails paymentDetails = HttpController.getThePayment(paymentId.get());

            clientId.setText(paymentDetails.getClientId().toString());
            ownersName.setText(paymentDetails.getOwnersName());
            address.setText(paymentDetails.getAddress());
            sum.setText(String.valueOf(paymentDetails.getSumm()));

            coldWater.setText(String.valueOf(paymentDetails.getColdWater()));
            hotWater.setText(String.valueOf(paymentDetails.getColdWater()));
            electricity.setText(String.valueOf(paymentDetails.getElectricity()));
            repairment.setText(String.valueOf(paymentDetails.getRepairment()));
        }
    }
}
