/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

import Pokemons.*;
import java.util.ArrayList;
import pokemonteste.*;

/**
 *
 * @author 1513 X-MXTI
 */
public class AreaFarm extends Locais{
    
                    ArrayList<Pokemon> pokemonsarea = new ArrayList();
                    boolean derrotado = false;
                    
                    @Override
                    void rodalocal (Treinador x)
                    {
                        
                        while(pokemonsarea.isEmpty()==false||derrotado == false)
                        {
                            
                            while (x.pokemons.isEmpty()==false||pokemonsarea.isEmpty()==false)
                            {    
                                batalha.pokemonvspokemon(x, pokemonsarea.get(0));
                                if(x.pokemons.get(0).hp==0)
                                {
                                    x.pokemons.remove(0);
                                }
                                if(pokemonsarea.get(0).hp==0)
                                {
                                    pokemonsarea.remove(0);
                                }
                            
                           }    
                        
                            if(x.pokemons.isEmpty())
                            {
                                derrotado = true;
                                System.out.println("Voce foi derrotado!");
                            }
                        }
                        if(pokemonsarea.isEmpty())
                        {
                            System.out.println("Voce venceu!!!"); 
                           
                        }
                    
                    }    
}
