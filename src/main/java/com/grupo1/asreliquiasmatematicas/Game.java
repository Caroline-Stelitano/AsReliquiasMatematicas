/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo1.asreliquiasmatematicas;

public class Game {

    private static Game instance;

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }
    public boolean reliquiaLeste = true;
    public boolean reliquiaNorte = true;
    public boolean reliquiaSul = true;
    public boolean reliquiaOeste = true;  
//    COLOCAR TUDO FALSE NO FUNCIONAMENTO DO JOGO

}
