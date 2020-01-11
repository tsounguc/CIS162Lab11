import java.awt.*;
import javax.swing.*;

public class Checkerboard extends JPanel{

    public static void main(String args[]){
        JFrame f = new JFrame("Checker Board");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Checkerboard ());
        f.pack();
        f.setVisible(true);
    }

    public Checkerboard (){
        setPreferredSize (new Dimension(500,500));    
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int j = 0; j<8; j++)
        {
            for(int i = 0; i<8; i++)
            {
                if((i+j)%2==0)
                {
                    g.setColor(Color.red);
                }
                else{
                    g.setColor(Color.black);
                }
                g.fillRect(i * 50, j*50, 50, 50);
            }

        }
        }
    }
