/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

import java.util.ArrayList;

/**
 *
 * @author 1513 X-MXTI
 */
public class Treinador {
    
        protected   String Nome;
        protected   int    idade;
        protected   int    experiencia;
        protected   ArrayList<Pokemon> pokemons = new ArrayList();
        protected   ArrayList<Insignia> insignias = new ArrayList();

    public String getNome() {
        return Nome;
    }

   
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = this.experiencia+experiencia; // adiciona experiencia atual com a recebida
    }

    void addpokemon(Pokemon e) {
        pokemons.add(e);
    }
    void addInsignia (Insignia e)
    {
        insignias.add( e);
    }
    void chamaataque ()
    {
        if(Treinador)
        
        
    }
    
}
