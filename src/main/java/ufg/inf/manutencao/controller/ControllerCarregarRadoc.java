/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.ufg.inf.manutencao.controller;

import javax.swing.JFileChooser;
import javax.swing.JTextField;
import main.java.ufg.inf.manutencao.view.ViewCarregarRadoc;
import javax.swing.filechooser.FileNameExtensionFilter;
import main.java.ufg.inf.manutencao.util.UtilTexto;


/**
 *
 * @author Leonardo
 */
public class ControllerCarregarRadoc {
    
    ViewCarregarRadoc viewCarregarRadoc;

    public ControllerCarregarRadoc(ViewCarregarRadoc viewCarregarRadoc) {
        this.viewCarregarRadoc = viewCarregarRadoc;
    }

    public ViewCarregarRadoc getViewCarregarRadoc() {
        return viewCarregarRadoc;
    }

   public void setViewCarregarRadoc(ViewCarregarRadoc viewCarregarRadoc) {
        this.viewCarregarRadoc = viewCarregarRadoc;
    }
   
   public void alterarArquivoSelecionado(JTextField diretorio) {
        int returnVal;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("PDF Documents", "pdf"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        returnVal = fileChooser.showOpenDialog(getViewCarregarRadoc());
        diretorio.setText(fileChooser.getSelectedFile().getPath());
        lerArquivoPDF(fileChooser.getSelectedFile().getPath());
   }
   
   public void lerArquivoPDF(String caminhoDoArquivo){
       String texto = UtilTexto.extraiTextoDoPDF(caminhoDoArquivo);
       System.out.println(texto);
   }
   
}
