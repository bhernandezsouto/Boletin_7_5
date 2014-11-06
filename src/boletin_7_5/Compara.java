/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_5;
import javax.swing.JOptionPane;
public class Compara {
    private double a;
    private double b;
    private double c;
    
    public Compara(){
        String respuesta = JOptionPane.showInputDialog("Introduce el primer numero");
        a = Double.parseDouble(respuesta);
        respuesta = JOptionPane.showInputDialog("Introduce el segundo numero");
        b = Double.parseDouble(respuesta);
        respuesta = JOptionPane.showInputDialog("Introduce el tercer numero");
        c = Double.parseDouble(respuesta);
    }
    public void esMayor (){
        int p = 0;
        if ((a>b)&&(a>c)){
            JOptionPane.showMessageDialog(null, "El numero mayor es el 1ª numero: " + a);
            p=1;
        }
        if ((b>a)&&(b>c)){
            JOptionPane.showMessageDialog(null, "El numero mayor es el 2ª numero: " + b);
            p=1;
        }
        if ((c>a)&&(c>b)){
            JOptionPane.showMessageDialog(null, "El numero mayor es el 3ª numero: " + c);
            p=1;
        }
        if ((a==b)&&(a>c)){
            JOptionPane.showMessageDialog(null, "Los numeros mayores son: " + a + " y " + b);
            p=1; 
        }
        if ((a==c)&&(a>b)){
            JOptionPane.showMessageDialog(null, "Los numeros mayores son: " + a + " y " + c);
            p=1;
        }
        if ((b==c)&&(c>a)){
            JOptionPane.showMessageDialog(null, "Los numeros mayores son: " + b + " y " + c);
            p=1;
        } 
        if (p == 0){
            JOptionPane.showMessageDialog(null, "los tres numeros son iguales");
        }        
    }
}
