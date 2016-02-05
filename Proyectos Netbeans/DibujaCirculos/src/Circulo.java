
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
la clase codigo permite almacenar 1 circulo, pero ademas de su posicion en la pantalla,
si esta relleno o no, su color etc
*/
/**
 *
 * @author Hector Fernandez
 */
public class Circulo extends Ellipse2D.Double{
    
    public Color color = null;
    public boolean relleno = false;
    
    public Circulo(int _x, int _y, int _width, Color _color, boolean _relleno){
      this.x = _x - _width/2;
      this.y = _y - _width/2;
      this.width = _width;
      this.height = _width;
      this.relleno = _relleno;
      this.color = _color;
       
    }
    public void artAttack(Graphics2D g2){
       //leo el color del circulo 0
        g2.setColor(this.color);     
        if(this.relleno){
           g2.fill(this);
        }
         else{
            g2.draw(this);
        }
    }
        
}
