/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.ufg.inf.manutencao.util;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

/**
 *
 * @author Leonardo
 */
public class UtilTexto {
  /**
  * Le o conteudo (texto) de um arquivo pdf
  *
     * @param caminho
  */
  public static String extraiTextoDoPDF(String caminho) {
    PDDocument pdfDocument = null;
    try {
      pdfDocument = PDDocument.load(caminho);
      PDFTextStripper stripper = new PDFTextStripper();
      String texto = stripper.getText(pdfDocument);
      return texto;
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if (pdfDocument != null) try {
        pdfDocument.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

  /**
  *
  * Extrai o conteudo do arquivo indicado
  *
  */
  public static void main(String[] args) {
    String caminho = "C:\\Users\\Leonardo\\Desktop\\Facu\\Manutencao\\Radoc-2011-Final.pdf";
    String texto = extraiTextoDoPDF(caminho);
    System.out.println(texto);
  }
}
