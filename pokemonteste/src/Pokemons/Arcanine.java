/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import pokemonteste.*;

/**
 *
 * @author crist
 */
public class Arcanine extends Pokemon implements Fogo{
    public Arcanine(String nome) {
        this.nome = nome;
    }
    //@return Retorna o nome
    public String getNome() {
        return nome;
    }

    @Override
    public void ataqueAnuncio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int chamaAtaque(int i) {
        if (i == 1){
            return 0;
        }
    }

    @Override
    public int flameThrower() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int inferno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int fireBlast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int flameBurst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
