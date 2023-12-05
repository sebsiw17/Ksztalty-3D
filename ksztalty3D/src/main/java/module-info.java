module com.example.ksztalty3d {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ksztalty3d to javafx.fxml;
    exports com.example.ksztalty3d;
}