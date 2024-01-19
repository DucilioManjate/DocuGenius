// MainController.java
package org.example.documentservice.controller;

import org.example.documentservice.service.DocumentService;
import org.example.documentservice.ui.MainUI;

public class MainController {

    private final DocumentService documentService;
    private final MainUI mainUI;

    public MainController(DocumentService documentService, MainUI mainUI) {
        this.documentService = documentService;
        this.mainUI = mainUI;
    }

    public void processDocument(String documentNumber) {
        // Chamada para gerar o documento Word
        documentService.generateWordDocument(documentNumber);

        // Caminho do documento gerado (ajuste conforme sua implementação)
        String filePath = "generated_document.txt";

        // Exibe a prévia do PDF na interface do usuário
        mainUI.showPreview(filePath);
    }
}
