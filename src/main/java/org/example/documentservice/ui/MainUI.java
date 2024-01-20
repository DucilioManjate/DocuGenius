package org.example.documentservice.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.documentservice.controller.MainController;

public class MainUI extends Application {

    private final MainController mainController;

    public MainUI(MainController mainController) {
        this.mainController = mainController;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Serviço de Documentos");

        VBox root = new VBox();
        Button downloadButton = new Button("Baixar Documento");
        Button previewButton = new Button("Visualizar Documento");
        Button editButton = new Button("Editar Documento");
        root.getChildren().addAll(downloadButton, previewButton, editButton);

        downloadButton.setOnAction(event -> {
            // Lógica para baixar e exibir documentos
            mainController.processDocument();
        });

        previewButton.setOnAction(event -> {
            // Lógica para visualizar o documento
            showDocumentPreview(mainController.getDocumentContent());
        });

        editButton.setOnAction(event -> {
            // Lógica para editar o documento
            showDocumentEditor(mainController.getDocumentContent());
        });

        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }

    private void showDocumentPreview(String documentContent) {
        // Lógica para exibir o preview do documento (por exemplo, em uma nova janela)
        Stage previewStage = new Stage();
        previewStage.setTitle("Preview do Documento");
        TextArea previewTextArea = new TextArea(documentContent);
        previewTextArea.setEditable(false);

        VBox previewRoot = new VBox(previewTextArea);
        previewStage.setScene(new Scene(previewRoot, 400, 300));
        previewStage.show();
    }

    private void showDocumentEditor(String documentContent) {
        // Lógica para exibir o editor do documento
        Stage editorStage = new Stage();
        editorStage.setTitle("Editor do Documento");
        TextArea editorTextArea = new TextArea(documentContent);

        Button saveButton = new Button("Salvar Documento");
        saveButton.setOnAction(event -> {
            // Lógica para salvar o documento após a edição
            mainController.editDocument(editorTextArea.getText());
            editorStage.close();
        });

        VBox editorRoot = new VBox(editorTextArea, saveButton);
        editorStage.setScene(new Scene(editorRoot, 400, 300));
        editorStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
