/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupo1.asreliquiasmatematicas.ui;

import com.grupo1.asreliquiasmatematicas.Game;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carol
 */
public class TelaLeste extends javax.swing.JFrame {

    String[][] quiz = new String[10][6];
    int question = 0;
    int acertos = 0;
    int vida = 5;
    List<Integer> respondidas = new ArrayList();

    public TelaLeste() {
        initComponents();
        initData();
        update();
    }

    public void update() {
        if (acertos == 5) {
            Game.getInstance().reliquiaLeste = true;
            TelaSucesso ts = new TelaSucesso();
            ts.setVisible(true);
            dispose();

        } else {

            question = (int) (Math.random() * 9);

            if (respondidas.contains(question)) {
                update();
            } else {
                jTextArea1.setText(quiz[question][0]);
                lblVidas.setText("" + vida);
                btnResp1.setText(quiz[question][1]);
                btnResp2.setText(quiz[question][2]);
                btnResp3.setText(quiz[question][3]);
                btnResp4.setText(quiz[question][4]);
                respondidas.add(question);
            }

        }

    }

    public void initData() {
        quiz[0][0] = "Qual o conjunto numérico que engloba todos os outros? ";
        quiz[0][1] = "Complexos";
        quiz[0][2] = "Naturais";
        quiz[0][3] = "Irracionais";
        quiz[0][4] = "Reais";
        quiz[0][5] = "4";
        quiz[1][0] = "De qual grupo pertence números como 3√3?";
        quiz[1][1] = "Reais";
        quiz[1][2] = "Irracionais";
        quiz[1][3] = "Racionais";
        quiz[1][4] = "Naturais";
        quiz[1][5] = "2";
        quiz[2][0] = "Qual conceito é usado para resolver equações de segundo grau?";
        quiz[2][1] = "Conjuntos";
        quiz[2][2] = "Venn";
        quiz[2][3] = "Sistema";
        quiz[2][4] = "Bhaskara";
        quiz[2][5] = "4";
        quiz[3][0] = "Constantes como π e Euler fazem parte de qual conjunto?";
        quiz[3][1] = "Irracionais ";
        quiz[3][2] = "Naturais";
        quiz[3][3] = "Complexos";
        quiz[3][4] = "Inteiros";
        quiz[3][5] = "1";
        quiz[4][0] = "Dado o conjunto A = {1,2,5, 10, 15, 28}, o número de subconjuntos possíveis para esse conjunto é:";
        quiz[4][1] = "2";
        quiz[4][2] = "8";
        quiz[4][3] = "16";
        quiz[4][4] = "32";
        quiz[4][5] = "4";
        quiz[5][0] = "Seja A = {2,5}, B = {2,5,6} e C {6,10}, determine os elementos da operação (A U B) ∩ (B U C).";
        quiz[5][1] = "{2,10}";
        quiz[5][2] = "{2,5,6,10}";
        quiz[5][3] = "{6,10}";
        quiz[5][4] = "{2,5,6}";
        quiz[5][5] = "4";
        quiz[6][0] = "A quantidade de subconjuntos do conjunto (A – B) U C, em que A = {2,4,6,8,10,12,14} B = {3,6,8,12} e C = {0,4,7}, é:";
        quiz[6][1] = "2³";
        quiz[6][2] = "2⁴";
        quiz[6][3] = "2⁵";
        quiz[6][4] = "2⁶";
        quiz[6][5] = "4";
        quiz[7][0] = "Em um gráfico de primeiro grau, o que define uma função crescente? ";
        quiz[7][1] = "a>0";
        quiz[7][2] = "a<0";
        quiz[7][3] = "a≠0";
        quiz[7][4] = "a=0";
        quiz[7][5] = "1";
        quiz[8][0] = "Por definição de Log, qual das opções representa o resultado de um suposto Log, sendo ele Logx y = z? ";
        quiz[8][1] = "y^z=x";
        quiz[8][2] = "x^z=y";
        quiz[8][3] = "x^y=z";
        quiz[8][4] = "y^x=z";
        quiz[8][5] = "2";
        quiz[9][0] = "Nas equações exponenciais, qual o elemento fundamental a ser igualado para desenvolver a resposta final? ";
        quiz[9][1] = "Base";
        quiz[9][2] = "Potência";
        quiz[9][3] = "Numerador";
        quiz[9][4] = "Denominador";
        quiz[9][5] = "2";
    }

    public void responder(String resposta) {
        if (quiz[question][5] == resposta) {
            acertos++;

        } else {
            vida--;
        }

        update();
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
        btnTeste = new javax.swing.JButton();
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

        btnTeste.setText("inicio voltar");
        btnTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTesteActionPerformed(evt);
            }
        });
        getContentPane().add(btnTeste, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reino Leste.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTesteActionPerformed
        TelaStart teste = new TelaStart();
        teste.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTesteActionPerformed

    private void btnResp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp4ActionPerformed
        responder("4");
    }//GEN-LAST:event_btnResp4ActionPerformed

    private void btnResp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp3ActionPerformed
        responder("3");
    }//GEN-LAST:event_btnResp3ActionPerformed

    private void btnResp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp2ActionPerformed
        responder("2");
    }//GEN-LAST:event_btnResp2ActionPerformed

    private void btnResp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResp1ActionPerformed
        responder("1");
    }//GEN-LAST:event_btnResp1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnResp1;
    private javax.swing.JButton btnResp2;
    private javax.swing.JButton btnResp3;
    private javax.swing.JButton btnResp4;
    private javax.swing.JButton btnTeste;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel lblVidas;
    // End of variables declaration//GEN-END:variables
}
