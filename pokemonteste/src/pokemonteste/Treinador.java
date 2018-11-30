/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

import java.util.ArrayList;
import pokemonteste.Pokemon;
import pokemonteste.Pokemon;

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
    
    public Treinador(String nome, int idade) {
        Nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
    
   
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = this.experiencia+experiencia; // adiciona experiencia atual com a recebida
    }

    public void addpokemon(Pokemon e) {
        pokemons.add(e);
    }
    public void addInsignia (Insignia e)
    {
        insignias.add( e);
    }
    public int getNumeroInsignias() {
        return insignias.size();
    }
    
                      
    
}
