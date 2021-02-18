package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.control.cell.*;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class TableController implements Initializable {

    @FXML private TableView<PaymentDto> theTable;
    @FXML private TableColumn<PaymentDto, Long> clientIdColumn;
    @FXML private TableColumn<PaymentDto, String> ownerColumn;
    @FXML private TableColumn<PaymentDto, String> addressColumn;
    @FXML private TableColumn<PaymentDto, Integer> amountColumn;
    @FXML private TableColumn<PaymentDto, Date> periodColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clientIdColumn.setCellValueFactory(new PropertyValueFactory<PaymentDto, Long>("id"));
        ownerColumn.setCellValueFactory(new PropertyValueFactory<PaymentDto, String>("clientName"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<PaymentDto, String>("address"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<PaymentDto, Integer>("amount"));
        periodColumn.setCellValueFactory(new PropertyValueFactory<PaymentDto, Date>("period"));

        theTable.setItems(getPayments());



    }

    private ObservableList<PaymentDto> getPayments() {

        ObservableList<PaymentDto> observableList = FXCollections.observableArrayList();

        Date date = new Date();
        observableList.add(new PaymentDto(1L,"Pete", "arbat", 2000, date));
        observableList.add(new PaymentDto(2L,"Pete", "arbat", 2000, date));
        observableList.add(new PaymentDto(3L,"Pete", "arbat", 2000, date));
        observableList.add(new PaymentDto(4L,"Pete", "arbat", 2000, date));
        observableList.add(new PaymentDto(5L,"Pete", "arbat", 2000, date));
        observableList.add(new PaymentDto(6L,"Pete", "arbat", 2000, date));
        observableList.add(new PaymentDto(7L,"Pete", "arbat", 2000, date));
        observableList.add(new PaymentDto(8L,"Pete", "arbat", 2000, date));
        observableList.add(new PaymentDto(9L,"Pete", "arbat", 2000, date));


        return observableList;

    }
}
