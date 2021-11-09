/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo1.asreliquiasmatematicas.quiz;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Quiz {

    String[][] quiz;
    int question = 0;
    int acertos = 0;
    int vida = 5;
    List<Integer> respondidas = new ArrayList();

    public Quiz(String local) {
        switch (local) {
            case "Leste":
                quiz = QuizTelaLeste.buildQuiz();
                break;
            case "Norte":
                quiz = QuizTelaNorte.buildQuiz();
                break;
            case "Sul":
                quiz = QuizTelaSul.buildQuiz();
                break;
            case "Oeste":
                // TODO: trocar
                quiz = QuizTelaLeste.buildQuiz();
                break;
            case "BossFinal":
                quiz = QuizTelaBossFinal.buildQuiz();
                break;
        }

    }

    public void responder(String resposta) {
        if (quiz[question][5] == resposta) {
            acertos++;
        } else {
            vida--;
        }
    }

    // Retorna se o jogador venceu o jogo
    public boolean update(
            JTextArea textAreaPergunta,
            JLabel lblVidas,
            JButton btnResp1,
            JButton btnResp2,
            JButton btnResp3,
            JButton btnResp4
    ) {
        if (acertos == 5) {
            return true;
        } else {
            question = (int) (Math.random() * (quiz.length - 1));

            if (respondidas.contains(question)) {
                update(textAreaPergunta, lblVidas,
                        btnResp1, btnResp2, btnResp3, btnResp4);
            } else {
                textAreaPergunta.setText(quiz[question][0]);
                lblVidas.setText("" + vida);
                btnResp1.setText(quiz[question][1]);
                btnResp2.setText(quiz[question][2]);
                btnResp3.setText(quiz[question][3]);
                btnResp4.setText(quiz[question][4]);
                respondidas.add(question);
            }

            return false;
        }
    }
    
    // Retorna se o jogador perdeu o jogo
    public boolean isGameOver() {
        return vida == 0;
    }
}
