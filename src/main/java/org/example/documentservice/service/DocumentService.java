// DocumentService.java
package org.example.documentservice.service;

import java.io.FileOutputStream;
import java.io.IOException;

public class DocumentService {

    public void generateWordDocument(String documentNumber) {
        // Lógica para preencher o documento Word com base no número do documento
        // Use a biblioteca de sua escolha para manipulação de documentos Word

        // Exemplo: Criar um arquivo de texto simples para simular a criação do documento
        String content = "Conteúdo do documento para o número: " + documentNumber;
        try (FileOutputStream out = new FileOutputStream("generated_document.txt")) {
            out.write(content.getBytes());
            System.out.println("Documento Word simulado gerado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
