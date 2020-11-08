/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author DMS
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextArea display;
    @FXML
    private Button bttujuh;
    @FXML
    private Button btdelapan;
    @FXML
    private Button btsembilan;
    @FXML
    private Button btempat;
    @FXML
    private Button btlima;
    @FXML
    private Button btenam;
    @FXML
    private Button btsatu;
    @FXML
    private Button btdua;
    @FXML
    private Button bttiga;
    @FXML
    private Button btnol;
    @FXML
    private Button btenter;
    @FXML
    private Button btclear;
    @FXML
    private Button btbagi;
    @FXML
    private Button btkali;
    @FXML
    private Button btkurang;
    @FXML
    private Button bttambah;

    @FXML
   //rivate Button btclear;//
    private int angka1 = 0;
    private String operasi = "netral";
    private int angka2 = 0;
    private int hasil;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonClicked(ActionEvent event) {
        if(event.getSource()== btnol){
            if(!display.getText().isBlank()){
                display.setText(display.getText() + "0");
            }
        }
        if(event.getSource()== btsatu){ 
        display.setText(display.getText() + "1"); 
        }
        else if (event.getSource() == btdua) { 
        display.setText(display.getText() + "2"); 
        }
        else if (event.getSource() == bttiga){ 
        display.setText(display.getText() + "3"); 
        }
        else if (event.getSource() == btempat) { 
        display.setText(display.getText() + "4"); 
        }
        else if (event.getSource() == btlima) { 
        display.setText(display.getText() + "5");
        }
        else if (event.getSource() == btenam) { 
        display.setText(display.getText() + "6");
        }
        else if (event.getSource() == bttujuh){ 
        display.setText(display.getText() + "7");
        }
        else if (event.getSource() == btdelapan){
        display.setText(display.getText() + "8");
        }
        else if (event.getSource() == btsembilan){
        display.setText(display.getText() + "9");
        }
        else if (event.getSource() == btclear) { 
        display.setText(""); 
        }
        else if (event.getSource() == bttambah){
        angka1 = Integer.parseInt(display.getText()); 
        operasi = "plus"; 
        display.setText(""); 
        }
        else if (event.getSource() == btbagi  ){
        angka1 = Integer.parseInt(display.getText()); 
        operasi = "bagi"; 
        display.setText(""); 
        }
        else if (event.getSource() == btkurang){ 
        angka1 = Integer.parseInt(display.getText()); 
        operasi = "minus"; 
        display.setText(""); 
            
        }
        else if (event.getSource() == btkali) { 
        angka1 = Integer.parseInt(display.getText()); 
        operasi = "kali"; 
        display.setText(""); 
        }
        else if (event.getSource() == btenter) { 
        angka2 = Integer.parseInt(display.getText()); 
        if (operasi.equals("plus")) { 
        hasil = angka1 + angka2; 
        } 
        if (operasi.equals("minus")) { 
        hasil = angka1 - angka2; 
        } 
        if (operasi.equals("kali")) { 
        hasil = angka1 * angka2; 
        } 
        if (operasi.equals("bagi")) { 
        hasil = angka1 /angka2; 
        } 
        display.setText(String.valueOf(hasil)); 
        operasi = "netral"; 
} 
} 

       
    }
    




