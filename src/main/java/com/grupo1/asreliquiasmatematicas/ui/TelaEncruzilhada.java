/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupo1.asreliquiasmatematicas.ui;

import com.grupo1.asreliquiasmatematicas.Game;

/**
 *
 * @author carol
 */
public class TelaEncruzilhada extends javax.swing.JFrame {

    /**
     * Creates new form TelaEncruzilhada
     */
    public TelaEncruzilhada() {
        initComponents();
        
        /*
            if (Game.getInstance().reliquiaNorte == false) {
                btnLeste.setVisible(false);
            }
        se a condição for true ela esconde o botao. 
        se a condiçao for false ela nao cai na condiçao e o botao continua visivel.
        */
        boolean mostrarBotaoLeste = Game.getInstance().reliquiaNorte;
        if (!mostrarBotaoLeste) {
            btnLeste.setVisible(false);
        }

        boolean mostrarBotaoOeste = Game.getInstance().reliquiaLeste;
        if (!mostrarBotaoOeste) {
            btnOeste.setVisible(false);
        }
        
        boolean mostrarBotaoSul = Game.getInstance().reliquiaOeste;
        if (!mostrarBotaoSul) {
            btnSul.setVisible(false);
        }
        
        boolean mostrarBotaoBossFinal = Game.getInstance().reliquiaSul;
        if (!mostrarBotaoBossFinal) {
            btnBossFinal.setVisible(false);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnButtons = new javax.swing.JPanel();
        btnNorte = new javax.swing.JButton();
        btnSul = new javax.swing.JButton();
        btnLeste = new javax.swing.JButton();
        btnOeste = new javax.swing.JButton();
        btnBossFinal = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(816, 639));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnButtons.setOpaque(false);
        pnButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNorte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placareinonorte.png"))); // NOI18N
        btnNorte.setToolTipText("");
        btnNorte.setBorder(null);
        btnNorte.setContentAreaFilled(false);
        btnNorte.setFocusable(false);
        btnNorte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNorteActionPerformed(evt);
            }
        });
        pnButtons.add(btnNorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -20, 400, 146));

        btnSul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placareinosul.png"))); // NOI18N
        btnSul.setToolTipText("");
        btnSul.setBorder(null);
        btnSul.setContentAreaFilled(false);
        btnSul.setFocusable(false);
        btnSul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSulActionPerformed(evt);
            }
        });
        pnButtons.add(btnSul, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 359, 150, 75));

        btnLeste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placareinoleste.png"))); // NOI18N
        btnLeste.setBorder(null);
        btnLeste.setContentAreaFilled(false);
        btnLeste.setFocusable(false);
        btnLeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLesteActionPerformed(evt);
            }
        });
        pnButtons.add(btnLeste, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 150, 75));

        btnOeste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placareinooeste.png"))); // NOI18N
        btnOeste.setToolTipText("");
        btnOeste.setBorder(null);
        btnOeste.setContentAreaFilled(false);
        btnOeste.setFocusable(false);
        btnOeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOesteActionPerformed(evt);
            }
        });
        pnButtons.add(btnOeste, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 150, 75));

        btnBossFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placaboss.png"))); // NOI18N
        btnBossFinal.setToolTipText("");
        btnBossFinal.setBorder(null);
        btnBossFinal.setContentAreaFilled(false);
        btnBossFinal.setFocusable(false);
        btnBossFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBossFinalActionPerformed(evt);
            }
        });
        pnButtons.add(btnBossFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 150, 75));

        getContentPane().add(pnButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 800, 440));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Godolfredo: \"Que lugar é esse? Como vim parar aqui? Bem no dia do meu aniversário essas coisas acontecem!\"\nVoz do além: \"Grandioso Godolfredo, você será o responsável por salvar esse reino do grande mal que o assombra. Busque as relíquias matemáticas e encontrará sua volta pra casa! Siga para o Norte.\"\n\n");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setOpaque(false);
        getContentPane().add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 760, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encruzilhada.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLesteActionPerformed
        TelaLeste leste = new TelaLeste();
        leste.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLesteActionPerformed

    private void btnSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSulActionPerformed
        TelaSul sul = new TelaSul();
        sul.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSulActionPerformed

    private void btnNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNorteActionPerformed
        TelaTaverna taverna = new TelaTaverna();
        taverna.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNorteActionPerformed

    private void btnOesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOesteActionPerformed
        TelaOeste oeste = new TelaOeste();
        oeste.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOesteActionPerformed

    private void btnBossFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBossFinalActionPerformed
        TelaBossFinal bossFinal = new TelaBossFinal();
        bossFinal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBossFinalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBossFinal;
    private javax.swing.JButton btnLeste;
    private javax.swing.JButton btnNorte;
    private javax.swing.JButton btnOeste;
    private javax.swing.JButton btnSul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pnButtons;
    // End of variables declaration//GEN-END:variables
}
