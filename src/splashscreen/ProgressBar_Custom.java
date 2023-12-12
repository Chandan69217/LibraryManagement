package splashscreen;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

public class ProgressBar_Custom extends JProgressBar {
    
    private Color colorString = new Color(0, 0, 0);
    
    public Color getColorString() {
        return colorString;
    }
    
    public void setColorString(Color colorString) {
        this.colorString = colorString;
    }
    
    
    public ProgressBar_Custom() {
        setPreferredSize(new Dimension(100, 5));
        setBackground(new Color(77, 77, 77));
        setForeground(new Color(190, 190, 190));
        setBorderPainted(true);
        setBorder(customBorder);
                          // Rectangular Progressbar Design
        
//        setUI(new BasicProgressBarUI() {
//            
//            @Override
//            protected void paintString(Graphics grphcs, int i, int i1, int i2, int i3, int i4, Insets insets) {
//                grphcs.setColor(getColorString());
//                super.paintString(grphcs, i, i1, i2, i3, i4, insets);
//            }
//        });
    }

    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_RESOLUTION_VARIANT,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        
        g2.setRenderingHints(rh);
        int Width = getWidth();
        int Height = getHeight();
        
        GradientPaint painter = new GradientPaint(0, 0, Color.decode("#FFD6FF"),
                0, Width, Color.decode("#BD0FF00"));
        
        RoundRectangle2D.Float background = new RoundRectangle2D.Float(
                0, 0, Width, Height, 15, 15);
        
        g2.setPaint(painter);
        g2.fill(background);
        
        
        
        int progressBarWidth = (int) (Width * getPercentComplete());

        // Create a rounded rectangle for the filled progress
        
        painter = new GradientPaint(0,0,Color.decode("#EF5DA8"),0,Width,Color.decode("#EF5DA8"));
        RoundRectangle2D.Float progress = new RoundRectangle2D.Float(
                0, 0, progressBarWidth, Height,15, 15);

        // Fill the progress with the progress bar's foreground color
        
//        g2.setColor(Color.decode("#EF5DA8"));
        g2.setPaint(painter);
        g2.fill(progress);
        g2.dispose();
        
    }
    
    Border customBorder = new Border(){
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setColor(Color.decode("#EF5DA8"));
            g2.setStroke(new BasicStroke(2));
            g2.draw(new RoundRectangle2D.Float(x,y,width-1,height-1,15,15));
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(5, 5, 5, 5);
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }
        
    };
   
    
    
}
