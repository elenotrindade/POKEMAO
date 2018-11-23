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
    protected String nome;

    protected int nvl, hp, atk, def, turno = -1;

    public abstract void ataqueAnuncio();
    @Override
    public String toString(){
        return this.nome;
    }

    int ataque() {
        //chama o time e retorna o dano do ataque
        return 1;
    }
}
