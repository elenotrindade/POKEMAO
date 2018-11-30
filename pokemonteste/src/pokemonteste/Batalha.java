/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;
import Pokemons.*;
/**
 *
 * @author eleno
 */
public class Batalha {
    int turno = -1;
    /*@return retorna se está em batalha ou não;
    */
    public boolean estaEmBatalha(){
        boolean bool = true;
        return bool;
    }
    /*@param os dois pokemons que estão no campo de batalha
    *@return retorna de qual pokemon é o turno
    */
    public Pokemon turno (Pokemon x, Pokemon y)
    {
        if (x.turno == -1 && y.turno == -1)
        {
            x.turno = x.turno * -1;
            return x;
        }
        else if (x.turno == 1 && y.turno == -1)
        {
            y.turno = y.turno * -1;
            return y;
        }
        else
        {
            y.turno = y.turno * -1;
            x. turno = x.turno * -1;
            return turno (x,y);
        }
    }
    /**
     * Luta dos pokemons 
    * @param x primeiro pokemon
    * @param y segundo pokemon
    * @return retorna qual foi o pokemon vitorioso
    */
    
   
    public Pokemon batalhar (Pokemon x, Pokemon y)
    {
        while (x.hp !=0 || y.hp !=0 )
        {
            
        }
        return x;
    }
    /*@param o pokemon que ta atacando e o que está recebendo o ataque *ainda não sabemos como definir como seria a seleção de cada ataque*
    */
    private void atacar (Pokemon x, Pokemon y)
    {
        int dano = x.ataque();
        dano = dano - y.def;
    }
}