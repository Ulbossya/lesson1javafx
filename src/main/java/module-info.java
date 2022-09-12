module com.example.lesson1javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson1javafx to javafx.fxml;
    exports com.example.lesson1javafx;
}