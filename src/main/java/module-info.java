module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;
    requires lombok;

    opens org.example to javafx.fxml;
    exports org.example;
}