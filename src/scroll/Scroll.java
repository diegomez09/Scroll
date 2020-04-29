
package scroll;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;


public class Scroll extends JFrame{
JScrollPane scroll;
    JLabel etiqueta;
public Scroll(){
    super("SCROLLEABLE");
     this.setLayout(null);
        this.setBackground(Color.yellow);     
        this.setBounds(0,0,600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scroll=new JScrollPane();
        scroll.setBounds(0,0,570,550);
        etiqueta = new JLabel();
        Icon imagen = new ImageIcon("C:\\Users\\Usuario\\Downloads\\ini.jpg");
        etiqueta.setIcon (imagen);                
        scroll.setViewportView(etiqueta);
        this.add(scroll);
        
this.setVisible(true);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scroll m=new Scroll();
    }
}
