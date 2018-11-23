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
public class Beedril extends Pokemon implements Normal{

    public Beedril(String nome) {
        this.nome = nome;
    }
    //@return Retorna o nome
    public String getNome() {
        return nome;
    }

    @Override
    public void ataqueAnuncio() {
        System.out.println(this.nome + " usa malemolencia");
    }

    @Override
    public float investida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
