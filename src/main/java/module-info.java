// module-info.java
module org.example.documentservice {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.documentservice to javafx.fxml;
    exports org.example.documentservice;
}
