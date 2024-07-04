module com.example.romannumeralskatatdd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.romannumeralskatatdd to javafx.fxml;
    exports com.example.romannumeralskatatdd;
}