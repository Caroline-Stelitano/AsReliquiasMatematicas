/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo1.asreliquiasmatematicas;

/**
 *
 * @author renat
 */
public class Game {

    private static Game instance;

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }
    public boolean reliquiaLeste = false;
    public boolean reliquiaNorte = false;
    public boolean reliquiaSul = false;
    public boolean reliquiaOeste = false;

}
