/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

import Pokemons.Tangela;
import Pokemons.Vileplume;
import Pokemons.Victreebel;

/**
 *
 * @author crist
 */
public class Ginasio2 {
    Tangela pokemon1;
    Victreebel pokemon2;
    Vileplume pokemon3;
    String dono;
    int exp;
    public Ginasio2(String dono)
    {
        this.dono = dono;
        exp = 2000;
    }
    public int ganhaExp()
    {
        return exp;
    }
}
