import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
//                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw a second inner border
//                        g.setColor(Color.RED);
//                        g.drawRect(x1 + 5 , y1 + 5, width - 10, height - 10);
//                        
//                        //Draw first line
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        //Draw second line 
//                        g.setColor(Color.GREEN);
//                        g.drawLine(x2, y1, x1, y2);
//                        
//                        //Draw oval
//                        g.setColor(Color.BLUE);
//                        g.fillOval((width- 55) / 2, (height - 55) /2, 55, 55);
                        
                        
//                        //Draw polygon
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
                        
                        
                     
                        
                        
                        //Franjas Rojas                                             
                        g.setColor(Color.RED);
                        g.fillRect(x1 , y1 , width + 1, height / 5);
                        
                        g.setColor(Color.RED);
                        g.fillRect(x1 , height * 2 / 5, width + 1, height / 5); //height entre la fraccion de la ventana donde debe comenzar 
                        
                        g.setColor(Color.RED);
                        g.fillRect(x1 , (height * 4 / 5) + 1, width + 1, height / 5);
                        
                        
                        
                        //Triangulo azul
                        Polygon triangulo = new Polygon();
                        triangulo.addPoint(x1 , y1 );
                        triangulo.addPoint(width / 2, height / 2 );
                        triangulo.addPoint(x1 , height + 1);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(triangulo);
                        
                        
                       
                        //Estreya
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                        
                    
                    
                        
                       
                    
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
            }
}