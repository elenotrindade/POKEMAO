/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

import Pokemons.Magmar;
import Pokemons.Rapidash;
import Pokemons.Arcanine;
import Pokemons.Ninetales;

/**
 *
 * @author crist
 */
public class Ginasio3 {
    Rapidash pokemon1;
    Arcanine pokemon2;
    Ninetales pokemon3;
    Magmar pokemon4;
    String dono;
    int exp;
    public Ginasio3(String dono)
    {
        this.dono = dono;
        exp = 3000;
    }
    public int ganhaExp()
    {
        return exp;
    }
}
