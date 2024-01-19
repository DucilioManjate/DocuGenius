package org.example.documentservice.ui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainUI {

    public void showPreview(String filePath) {
        Stage stage = new Stage();
        stage.setTitle("Preview do Documento PDF");

        VBox root = new VBox();
        Button printButton = new Button("Imprimir");
        root.getChildren().addAll(printButton);

        printButton.setOnAction(event -> {
            // Para imprimir o documento PDF usando a impressora padrão
            System.out.println("Imprimindo o documento PDF...");
        });

        stage.setScene(new Scene(root, 300, 200));
        stage.show();
    }
}
