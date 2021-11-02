/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo1.asreliquiasmatematicas.quiz;

/**
 *
 * @author carol
 */
public class QuizTelaLeste {
    public static String[][] buildQuiz() {
        String[][] quiz = new String[10][6];
        
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
        
        return quiz;
    }
}
