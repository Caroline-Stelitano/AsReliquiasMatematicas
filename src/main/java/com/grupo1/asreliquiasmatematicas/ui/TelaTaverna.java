/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupo1.asreliquiasmatematicas.ui;

import com.grupo1.asreliquiasmatematicas.Dialogos;

public class TelaTaverna extends javax.swing.JFrame {

    Dialogos dialogos = new Dialogos();
    int dialogoAtual = -1;

    private void proximoDialogo() {
        dialogoAtual++;
        if (dialogoAtual == dialogos.taverna.length) {
            TelaNorte tn = new TelaNorte();
            tn.setVisible(true);
            dispose();
        } else {
            cxDialogo.setText(dialogos.taverna[dialogoAtual]);
        }
    }

    public TelaTaverna() {
        initComponents();
        proximoDialogo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNext = new javax.swing.JButton();
        cxDialogo = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(819, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placapassar.png"))); // NOI18N
        btnNext.setContentAreaFilled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 50, -1));

        cxDialogo.setEditable(false);
        cxDialogo.setBackground(new java.awt.Color(0, 0, 0));
        cxDialogo.setColumns(20);
        cxDialogo.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        cxDialogo.setForeground(new java.awt.Color(255, 255, 51));
        cxDialogo.setLineWrap(true);
        cxDialogo.setRows(5);
        cxDialogo.setText("Essa história começa com Godolfredo, um rapaz comum, que em uma de suas voltas do trabalho pra casa, onde seria sua festa de aniversário, cai num portal interdimensional, que o leva para uma terra desconhecida.");
        cxDialogo.setWrapStyleWord(true);
        cxDialogo.setOpaque(false);
        getContentPane().add(cxDialogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 760, 100));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taverna.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        proximoDialogo();
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnNext;
    private javax.swing.JTextArea cxDialogo;
    // End of variables declaration//GEN-END:variables
}
