/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

import Pokemons.Pidgeot;
import Pokemons.Fearow;

/**
 *
 * @author crist
 */
public class Ginasio1{
    Pidgeot pokemon1;
    Fearow pokemon2;
    String dono;
    int exp;
    public Ginasio1(String dono)
    {
        this.dono = dono;
        exp = 1000;
    }
    public int ganhaExp()
    {
        return exp;
    }
    
}
