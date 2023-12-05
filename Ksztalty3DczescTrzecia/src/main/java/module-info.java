module com.example.ksztalty3dczesctrzecia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ksztalty3dczesctrzecia to javafx.fxml;
    exports com.example.ksztalty3dczesctrzecia;
}