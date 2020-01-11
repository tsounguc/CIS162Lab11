
/**
 * Write a description of class CheckerboardMyWay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.*;

public class CheckerboardMyWay extends JPanel{

    public static void main(String args[]){
        JFrame f = new JFrame("Checker Board");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new CheckerboardMyWay ());
        f.pack();
        f.setVisible(true);
    }

    public CheckerboardMyWay (){
        setPreferredSize (new Dimension(500,500));    
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int j = 0; j<8; j++)
        {
            for(int i = 0; i<8; i++)
            {
                if(g.getColor().getRed() == 0)
                {
                    g.setColor(Color.red);
                }
                else{
                    g.setColor(Color.black);
                }
                g.fillRect(i * 50, j*50, 50, 50);
            }
            if(g.getColor().getRed() == 0)
            {
                g.setColor(Color.red);
            }
            else{
                g.setColor(Color.black);

            }
        }
        }
    }


