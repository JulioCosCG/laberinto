
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;



public class Personaje {
    Laberinto lab=new Laberinto();//Pregunta del millon, traigo la matriz heredada, la heredacion es un llamado de un onjetohijo a un  onjeto padre
    private int x=40;
    private int y=40;
    private final int ancho=40;
    private final int alto=40;
    
    private final int anchoBOT=20;
    private final int altoBOT=20;
    
    private final int movimiento=40;
    private String color = "red";
    private int puntos=0;
    
    public void paint(Graphics grafico){
        //x=80;y=440;
        
        grafico.setColor(Color.GREEN);
        grafico.clearRect(x, y, alto, ancho);
        if ((x==80) && (y==120)) {grafico.setColor(Color.BLUE);puntos=puntos+100; grafico.drawString("Score:       0001", 30, 23);} // else {grafico.setColor(Color.red);}
        if ((x==80) && (y==440)) {grafico.setColor(Color.BLUE);puntos=puntos+100; System.out.println("pts: "+puntos);} // else {grafico.setColor(Color.red);}
        if ((x==800) && (y==440)) {};
        grafico.fillOval(x, y, ancho, alto);
        grafico.setColor(Color.BLACK);
        grafico.drawOval(x, y, alto, ancho);
        
        //--------BOT--------------------------------------------------------------
        grafico.setColor(Color.BLUE);
        grafico.fillOval(x+50, y+50, altoBOT, anchoBOT);
        
    }
    
    public void teclaPrecionada(KeyEvent evento){
        int [][]laberinto=lab.obtenerLaberinto();
        if(evento.getKeyCode()==83){//tecla izquierda
            if(laberinto[y/40][(x/40)-1]!=1){
                x=x-movimiento;
            }
        }
        if(evento.getKeyCode()==68){//tecla derecha
            if(laberinto[y/40][(x/40)+1]!=1){
            System.out.println(x+" , "+y);
                x=x+movimiento;
            //JOptionPane.showMessageDialog(null, "Sonará BEEP cuando "+ "pulsos en aceptar."+ "Solo en ventanas");
            //Toolkit.getDefaultToolkit().beep();    
            }
        }
        if(evento.getKeyCode()==78){//tecla abajo
            if(laberinto[(y/40)+1][x/40]!=1){
                y=y+movimiento;
            //System.out.println(y);
            }
        }
        if(evento.getKeyCode()==69){//tecla arriba
            if(laberinto[(y/40)-1][x/40]!=1){
                y=y-movimiento;
            }
        }
    }
}
