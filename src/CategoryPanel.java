/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Main-Hall
 */
public class CategoryPanel extends javax.swing.JPanel {

    /**
     * Creates new form CategoryPanel
     */
    public CategoryPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbcatphoto = new javax.swing.JLabel();
        lbcatname = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(null);

        lbcatphoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/1562758569940.jpg"))); // NOI18N
        lbcatphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lbcatphoto);
        lbcatphoto.setBounds(10, 11, 180, 130);

        lbcatname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbcatname.setForeground(new java.awt.Color(255, 255, 255));
        lbcatname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbcatname.setText("jLabel1");
        add(lbcatname);
        lbcatname.setBounds(10, 145, 168, 17);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lbcatname;
    public javax.swing.JLabel lbcatphoto;
    // End of variables declaration//GEN-END:variables
}