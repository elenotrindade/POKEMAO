/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

/**
 *
 * @author eleno
 */
public abstract class Pokemon {
    String nome;
    protected int nvl, hp, atk, def, turno = -1;
    public void setNome (String name){
        nome = name;
    };
    public abstract void ataqueAnuncio();
    @Override
    public String toString(){
        return this.nome;
    }
    /* float ataque (int atk, int hpInimigo) {
        float dano;
        dano = hpInimigo - ((float) (atk * multiplicador de dano);
        return dano;   
    }*/
}
