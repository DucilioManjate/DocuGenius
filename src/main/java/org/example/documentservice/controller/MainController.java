package org.example.documentservice.controller;

import org.example.documentservice.service.DocumentService;

public class MainController {

    private final DocumentService documentService;

    public MainController(DocumentService documentService) {
        this.documentService = documentService;
    }

    public void processDocument() {
        // Chamada para gerar o documento Word
        documentService.generateWordDocument();

        // Lógica para exibir a prévia do PDF
    }

    public String getDocumentContent() {
        return documentService.getDocumentContent();
    }

    public void editDocument(String newContent) {
        documentService.editDocument(newContent);
    }

    public void saveDocument(String filePath) {
        documentService.saveDocument(filePath);
    }
}
