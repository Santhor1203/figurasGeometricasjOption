/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricasjoption;

import javax.swing.JOptionPane;

/**
 *
 * @author srg12
 */
public class Datos {
       int radio,lado,base,altura,radio2,lado2; 
    double base2,altura2;
    public void clase() {

    
    Figuras fig= new Figuras();
    radio=Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide el radio de tu circulo?\n"));
        fig.AreaCirculo(radio);
    lado=Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide uno de los lados de tu cuadrado?\n"));      
        fig.AreaCuadrado(lado);
    base=Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide la base de tu triangulo?\n"));
    altura=Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide la altura de tu triangulo?\n"));
         fig.Areatriangulo(base,altura);
     base2=Double.parseDouble(JOptionPane.showInputDialog("Cuanto mide  la base de tu rectangulo\n"));
     altura2=Double.parseDouble(JOptionPane.showInputDialog("Cuanto mide  la altura de tu rectangulo\n"));
        fig.AreaRectangulo(base2,altura2);
    radio2=Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide el radio de tu esfera?\n"));
        fig.AreaEsfera(radio2);
    lado2=Integer.parseInt(JOptionPane.showInputDialog("Cuanto mide uno de los lados de tu cuadrado?\n"));
        fig.AreaCubo(lado2);        

    }  
   
}
