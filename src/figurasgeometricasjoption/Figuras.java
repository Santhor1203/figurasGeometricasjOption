
package figurasgeometricasjoption;
import javax.swing.JOptionPane;

public class Figuras {
    double area;
    public void AreaCirculo(int radio){
        //pi*r^2
        area = (Math.PI)*(Math.pow(2,radio));
        JOptionPane.showMessageDialog(null,"El area de tu circulo es"+area+"\n");
    }   
    public void AreaCuadrado(int lado){
        area = lado*lado;
        JOptionPane.showMessageDialog(null,"El area de tu cuadrado es"+area+"\n");
    }
    public void Areatriangulo(int base, int altura){
        area = (base*altura)/2;
        JOptionPane.showMessageDialog(null,"El area de tu triangulo es"+area+"\n");
    }
    public void AreaRectangulo(double base2,double altura2){
        area = base2*altura2;
        JOptionPane.showMessageDialog(null,"El area de tu rectangulo es"+area+"\n");
    }
    public void AreaEsfera(double radio2){
        //area=4pi*r ^2
        area = 4*(Math.PI)*(Math.pow(2,radio2)) ;
        JOptionPane.showMessageDialog(null,"El area de tu esfera es"+area+"\n");
    }
    public void AreaCubo(int lado2){
        //area=
        area =(lado2*lado2)*6;
        JOptionPane.showMessageDialog(null,"El area de tu cubo es"+area+"\n");
    }    
        
}
