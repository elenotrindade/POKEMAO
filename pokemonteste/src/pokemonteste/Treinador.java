/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

import java.util.*;

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

    public void addpokemon(Pokemon e) {
        pokemons.add(e);
    }
    public void addInsignia (Insignia e)
    {
        insignias.add( e);
    }
    public int chamaataque ()
    {
        int op;
        Scanner s = new Scanner(System.in);
        System.out.println("Ataques disponiveis: ");
        for(int i = 0; i < pokemons.get(0).Ataques.length; i++){
            System.out.println(i+1 + " para - " + pokemons.get(0).Ataques[i]);
        }
        System.out.println("Digite o numero do ataque desejado:");
        op = s.nextInt();
        
        return op;
    }
    
}
