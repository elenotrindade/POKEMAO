/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import pokemonteste.*;

/**
 *
 * @author eleno
 */
public class Pikachu extends Pokemon implements Eletrico {
    
    public Pikachu(String nome) {
        this.nome = nome;
    }
    //@return Retorna o nome
    public String getNome() {
        return nome;
    }

    @Override
    public void ataqueAnuncio() {
        System.out.println(this.nome + "usa choque do trovão");
    }

    @Override
    public int chamaAtaque(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int thunderShock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int voltTackle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int thunderFang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int shockWave() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
