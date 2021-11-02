/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupo1.asreliquiasmatematicas.ui;

import com.grupo1.asreliquiasmatematicas.Game;
import com.grupo1.asreliquiasmatematicas.quiz.Quiz;

/**
 *
 * @author carol
 */
public class TelaLeste extends javax.swing.JFrame {

    Quiz quiz = new Quiz("Leste");

    public TelaLeste() {
        initComponents();
        updateScreen();
    }

    public void updateScreen() {
        boolean sucesso = quiz.update(jTextArea1, lblVidas,
                btnResp1, btnResp2, btnResp3, btnResp4);

        if (sucesso) {
            Game.getInstance().reliquiaLeste = true;
            TelaSucesso ts = new TelaSucesso();
            ts.setVisible(true);
            dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextArea1 = new javax.swing.JTextArea();
        btnResp1 = new javax.swing.JButton();
        btnResp2 = new javax.swing.JButton();
        btnResp3 = new javax.swing.JButton();
        btnResp4 = new javax.swing.JButton();
        lblTempo = new javax.swing.JLabel();
        lblVidas = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("vasco da gama ?\n");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setOpaque(false);
        getContentPane().add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 450, 110));

        btnResp1.setBackground(new java.awt.Color(255, 255, 255));
        btnResp1.setText("muito mais");
        btnResp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnResp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, 20));

        btnResp2.setBackground(new java.awt.Color(255, 255, 255));
        btnResp2.setText("quase nada");
        btnResp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnResp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, -1, -1));

        btnResp3.setBackground(new java.awt.Color(255, 255, 255));
        btnResp3.setText("muito menos");
        btnResp3.setPreferredSize(new java.awt.Dimension(115, 29));
        btnResp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnResp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 110, 20));

        btnResp4.setBackground(new java.awt.Color(255, 255, 255));
        btnResp4.setText("muita coisa");
        btnResp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnResp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, -1, -1));

        lblTempo.setForeground(new java.awt.Color(255, 255, 255));
        lblTempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempo.setText("3:00");
        getContentPane().add(lblTempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, -1, -1));

        lblVidas.setForeground(new java.awt.Color(255, 255, 255));
        lblVidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVidas.setText("vidas");
        getContentPane().add(lblVidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reino Leste.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp4ActionPerformed
        quiz.responder("4");
        updateScreen();
    }//GEN-LAST:event_btnResp4ActionPerformed

    private void btnResp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp3ActionPerformed
        quiz.responder("3");
        updateScreen();
    }//GEN-LAST:event_btnResp3ActionPerformed

    private void btnResp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp2ActionPerformed
        quiz.responder("2");
        updateScreen();
    }//GEN-LAST:event_btnResp2ActionPerformed

    private void btnResp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp1ActionPerformed
        quiz.responder("1");
        updateScreen();
    }//GEN-LAST:event_btnResp1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnResp1;
    private javax.swing.JButton btnResp2;
    private javax.swing.JButton btnResp3;
    private javax.swing.JButton btnResp4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel lblVidas;
    // End of variables declaration//GEN-END:variables
}
