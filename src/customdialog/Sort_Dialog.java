package customdialog;

import form.deshboard.sort;
import java.awt.Color;

public class Sort_Dialog extends javax.swing.JDialog {

    public Sort_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SortPanel = new form.deshboard.sort();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(200, 230));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 0));
        getContentPane().add(SortPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public sort getSortPanel() {
        return SortPanel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private form.deshboard.sort SortPanel;
    // End of variables declaration//GEN-END:variables
}
