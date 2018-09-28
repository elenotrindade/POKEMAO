/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

import java.util.*;

/**
 *
 * @author eleno
 */
public class Pokemonteste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemons = new ArrayList();
        pokemons.add (new Pikachu());
        Pikachu pokemon1 = new Pikachu() {};
        pokemon1.setNome("SKRRSKRR777");
        Pikachu pokemon2 = new Pikachu();
        pokemon2.setNome("SKRRSKRR777");
        pokemons.add (new Pigeot());
        pokemons.add (new Ratata());
        pokemons.add (new Beedril());
        pokemons.add (new Staryu());
        for (int i=0; i<pokemons.size();i++)
        {
            System.out.println(pokemons.get(i).toString());
            pokemons.get(i).emitirSom();
        }
        System.out.println(pokemon1.equals(pokemon2));
    }
    
}
