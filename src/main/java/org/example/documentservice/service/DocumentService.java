package org.example.documentservice.service;

import java.io.FileOutputStream;
import java.io.IOException;

public class DocumentService {

    private String documentContent; // Armazena o conteúdo do documento

    public void generateWordDocument() {
        // Lógica para preencher o documento Word
        // Exemplo: Criar um arquivo de texto simulado
        this.documentContent = "Conteúdo do documento";
        System.out.println("Documento Word simulado gerado com sucesso!");
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public void editDocument(String newContent) {
        // Lógica para editar o documento
        this.documentContent = newContent;
        System.out.println("Documento editado com sucesso!");
    }

    public void saveDocument(String filePath) {
        // Lógica para salvar o documento em um arquivo
        // Exemplo: Salvar como texto
        try (FileOutputStream out = new FileOutputStream(filePath)) {
            out.write(documentContent.getBytes());
            System.out.println("Documento salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
