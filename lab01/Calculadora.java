
package cjava.lab01;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Calculadora extends Applet implements ActionListener{
   
    Button btnSuma=new Button("+");
    Button btnResta=new Button("-");
    Button btnMultiplica=new Button("*");
    Button btnDivide=new Button("/");
    TextField txtValor1 = new TextField("");
    TextField txtValor2 = new TextField("");
     TextField  txtResultado = new TextField("");
     Label lblValor1 = new Label("Valor 1");
     Label lblValor2 = new Label("Valor 2");
     Label lblResultado = new Label("Resultado ");
    
    public void init(){
        setLayout(null);
        btnSuma.setBounds(150,30,20,20);
        btnResta.setBounds(150,50,20,20);
        btnMultiplica.setBounds(170,30,20,20);
        btnDivide.setBounds(170,50,20,20);
        txtValor1.setBounds(100,30,40,20);
        txtValor2.setBounds(100,50,40,20);
        txtResultado.setBounds(100,100,100,20);
        lblValor1.setBounds(10,30,110,23);
        lblValor2.setBounds(10,50,40,20);
        lblResultado.setBounds(10,100,110,23);
        
        btnSuma.addActionListener(this);
        
        add(btnSuma);
        add(btnResta);
        add(btnMultiplica);
        add(btnDivide);
        add(txtValor1);
        add(txtValor2);
        add(txtResultado);
        add(lblValor1);
        add(lblValor2);
        add(lblResultado);
        
     
        
    }
    Operaciones objOp = new Operaciones();
@Override
    public void actionPerformed(ActionEvent e) {
        
        String dato1 = txtValor1.getText();
        String dato2 = txtValor2.getText();
        if(e.getSource()==btnSuma){
            String r=objOp.suma(dato1, dato2);
            txtResultado.setText(r);
        }
        if(e.getSource()==btnResta){
            String r=objOp.resta(dato1, dato2);
            txtResultado.setText(r);
        }
        if(e.getSource()==btnMultiplica){
            String r=objOp.multiplica(dato1, dato2);
            txtResultado.setText(r);
        }
        if(e.getSource()==btnDivide){
            String r=objOp.divide(dato1, dato2);
            txtResultado.setText(r);
        }
   
    }
}