
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import javax.swing.JLabel;


public class Puntaje {
    private int x=75;
    private int y=4;
    private final int ancho=50; 
    private final int alto=30;
    
    private int x2=50;
    private int y2=4;
    private final int ancho2=45; 
    private final int alto2=30;
    private int puntos=0;
    
    public void Paint(Graphics grafico){
        grafico.setColor(Color.white);
        grafico.fillRect(x, y, ancho, alto);
        grafico.setColor(Color.BLACK);
        grafico.drawRect(x, y, ancho, alto);
        //Para poner un cartel
        grafico.setColor(Color.white);
        grafico.fillRect(x-50, y, ancho2, alto2);
        grafico.setColor(Color.BLACK);
        grafico.drawRect(x-50, y, ancho2, alto2);
        //System.out.println("score: ");
        grafico.drawString("Score:       0000", 30, 23);
        //Label etiq = new Label("Etiqueta");
        
    }
    
}
