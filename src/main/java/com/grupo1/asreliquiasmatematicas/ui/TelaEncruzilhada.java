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

        btnNorte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placareinonorte.png"))); // NOI18N
        btnNorte.setToolTipText("");
        btnNorte.setContentAreaFilled(false);
        btnNorte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNorteActionPerformed(evt);
            }
        });

        btnSul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placareinosul.png"))); // NOI18N
        btnSul.setToolTipText("");
        btnSul.setContentAreaFilled(false);
        btnSul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSulActionPerformed(evt);
            }
        });

        btnLeste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placareinoleste.png"))); // NOI18N
        btnLeste.setContentAreaFilled(false);
        btnLeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLesteActionPerformed(evt);
            }
        });

        btnOeste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placareinooeste.png"))); // NOI18N
        btnOeste.setToolTipText("");
        btnOeste.setContentAreaFilled(false);
        btnOeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOesteActionPerformed(evt);
            }
        });

        btnBossFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placaboss.png"))); // NOI18N
        btnBossFinal.setToolTipText("");
        btnBossFinal.setContentAreaFilled(false);
        btnBossFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBossFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnButtonsLayout = new javax.swing.GroupLayout(pnButtons);
        pnButtons.setLayout(pnButtonsLayout);
        pnButtonsLayout.setHorizontalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnButtonsLayout.createSequentialGroup()
                        .addComponent(btnOeste, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(btnBossFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSul, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(btnLeste, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        pnButtonsLayout.setVerticalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonsLayout.createSequentialGroup()
                .addComponent(btnNorte)
                .addGap(141, 141, 141)
                .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOeste)
                    .addComponent(btnLeste)
                    .addComponent(btnBossFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(btnSul)
                .addContainerGap())
        );

        getContentPane().add(pnButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 800, 440));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Godolfredo: \"Que lugar é esse? Como vim parar aqui? Bem no dia do meu aniversário essas coisas acontecem!\"\n\nVoz do além: \"Grandioso Godolfredo, você será o responsável por salvar esse reino do grande mal que o assombra. Busque as relíquias matemáticas e encontrará sua volta pra casa! Siga para o Norte.\"\n\n");
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
