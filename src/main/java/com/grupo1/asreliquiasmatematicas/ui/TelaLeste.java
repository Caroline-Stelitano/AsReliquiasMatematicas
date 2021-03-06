/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupo1.asreliquiasmatematicas.ui;

import com.grupo1.asreliquiasmatematicas.Dialogos;
import com.grupo1.asreliquiasmatematicas.Game;
import com.grupo1.asreliquiasmatematicas.quiz.Quiz;

public class TelaLeste extends javax.swing.JFrame {

    Dialogos dialogos = new Dialogos();
    int dialogoAtual = -1;
    
    Quiz quiz = new Quiz("Leste");

    public TelaLeste() {
        initComponents();
        pnQuiz.setVisible(false);
        proximoDialogo();
    }
    
    private void proximoDialogo() {
        dialogoAtual++;
        if (dialogoAtual == dialogos.leste.length) {
            pnDialogo.setVisible(false);
            pnQuiz.setVisible(true);
            updateScreen();
        } else {
            cxDialogo.setText(dialogos.leste[dialogoAtual]);
        }
    }

    public void updateScreen() {
        if (quiz.isGameOver()) {
            TelaGameOver tgo = new TelaGameOver();
            tgo.setVisible(true);
            dispose();
        } else {
            boolean sucesso = quiz.update(jTextArea1, lblVidas,
                    btnResp1, btnResp2, btnResp3, btnResp4);

            if (sucesso) {
                Game.getInstance().reliquiaLeste = true;
                TelaSucesso ts = new TelaSucesso("Leste");
                ts.setVisible(true);
                dispose();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnQuiz = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        btnResp1 = new javax.swing.JButton();
        btnResp2 = new javax.swing.JButton();
        btnResp3 = new javax.swing.JButton();
        btnResp4 = new javax.swing.JButton();
        lblVidas = new javax.swing.JLabel();
        pnDialogo = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        cxDialogo = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnQuiz.setOpaque(false);

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

        btnResp1.setBackground(new java.awt.Color(255, 255, 255));
        btnResp1.setText("muito mais");
        btnResp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp1ActionPerformed(evt);
            }
        });

        btnResp2.setBackground(new java.awt.Color(255, 255, 255));
        btnResp2.setText("quase nada");
        btnResp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp2ActionPerformed(evt);
            }
        });

        btnResp3.setBackground(new java.awt.Color(255, 255, 255));
        btnResp3.setText("muito menos");
        btnResp3.setPreferredSize(new java.awt.Dimension(115, 29));
        btnResp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp3ActionPerformed(evt);
            }
        });

        btnResp4.setBackground(new java.awt.Color(255, 255, 255));
        btnResp4.setText("muita coisa");
        btnResp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResp4ActionPerformed(evt);
            }
        });

        lblVidas.setForeground(new java.awt.Color(255, 255, 255));
        lblVidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVidas.setText("vidas");

        javax.swing.GroupLayout pnQuizLayout = new javax.swing.GroupLayout(pnQuiz);
        pnQuiz.setLayout(pnQuizLayout);
        pnQuizLayout.setHorizontalGroup(
            pnQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnQuizLayout.createSequentialGroup()
                .addContainerGap(443, Short.MAX_VALUE)
                .addGroup(pnQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResp1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResp3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnResp2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btnResp4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVidas)
                .addGap(17, 17, 17))
            .addGroup(pnQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnQuizLayout.createSequentialGroup()
                    .addGap(0, 3, Short.MAX_VALUE)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 330, Short.MAX_VALUE)))
        );
        pnQuizLayout.setVerticalGroup(
            pnQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQuizLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResp2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVidas)
                    .addComponent(btnResp1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResp3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResp4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnQuizLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(pnQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, 120));

        pnDialogo.setOpaque(false);

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placapassar.png"))); // NOI18N
        btnNext.setBorder(null);
        btnNext.setContentAreaFilled(false);
        btnNext.setFocusable(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        cxDialogo.setEditable(false);
        cxDialogo.setBackground(new java.awt.Color(0, 0, 0));
        cxDialogo.setColumns(20);
        cxDialogo.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        cxDialogo.setForeground(new java.awt.Color(255, 255, 51));
        cxDialogo.setLineWrap(true);
        cxDialogo.setRows(5);
        cxDialogo.setText("text");
        cxDialogo.setWrapStyleWord(true);
        cxDialogo.setOpaque(false);

        javax.swing.GroupLayout pnDialogoLayout = new javax.swing.GroupLayout(pnDialogo);
        pnDialogo.setLayout(pnDialogoLayout);
        pnDialogoLayout.setHorizontalGroup(
            pnDialogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDialogoLayout.createSequentialGroup()
                .addContainerGap(713, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnDialogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDialogoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cxDialogo, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        pnDialogoLayout.setVerticalGroup(
            pnDialogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDialogoLayout.createSequentialGroup()
                .addComponent(btnNext)
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(pnDialogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDialogoLayout.createSequentialGroup()
                    .addContainerGap(48, Short.MAX_VALUE)
                    .addComponent(cxDialogo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        getContentPane().add(pnDialogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 780, 160));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reino Leste.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp1ActionPerformed
        quiz.responder("1");
        updateScreen();
    }//GEN-LAST:event_btnResp1ActionPerformed

    private void btnResp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp2ActionPerformed
        quiz.responder("2");
        updateScreen();
    }//GEN-LAST:event_btnResp2ActionPerformed

    private void btnResp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp3ActionPerformed
        quiz.responder("3");
        updateScreen();
    }//GEN-LAST:event_btnResp3ActionPerformed

    private void btnResp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp4ActionPerformed
        quiz.responder("4");
        updateScreen();
    }//GEN-LAST:event_btnResp4ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        proximoDialogo();
    }//GEN-LAST:event_btnNextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnResp1;
    private javax.swing.JButton btnResp2;
    private javax.swing.JButton btnResp3;
    private javax.swing.JButton btnResp4;
    private javax.swing.JTextArea cxDialogo;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblVidas;
    private javax.swing.JPanel pnDialogo;
    private javax.swing.JPanel pnQuiz;
    // End of variables declaration//GEN-END:variables
}
