/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo1.asreliquiasmatematicas;

public class Game {

    private static Game instance;   //instance é atributo da classe Game com tipo Game. 
    
    private Game(){}

    public static Game getInstance() {     //Game é o tipo do retorno do método getInstance()
        if (instance == null) {
            instance = new Game();          // instance recebe new Game();
        }
        return instance;
    }
    public boolean reliquiaLeste = false;    //reliquiaLeste é um atributo da classe Game
    public boolean reliquiaNorte = false;
    public boolean reliquiaSul = false;
    public boolean reliquiaOeste = false;  
//    COLOCAR TUDO TRUE PARA TESTE

}
