package components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Custom_JTextField extends javax.swing.JTextField{
    public Custom_JTextField(){
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(255,255,255));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 10, 10);
        g2.dispose();
        super.paintComponent(g2);
    }
    
    
}
