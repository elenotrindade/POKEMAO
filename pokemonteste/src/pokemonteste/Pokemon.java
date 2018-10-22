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
<<<<<<< HEAD
    protected int nvl, hp, atk, def, turno = -1;
    public void setNome (String name){
        nome = name;
    };
=======
    int nvl;
    int hp;
    int atk;
    int def;
    int turno = -1;
    protected void setNome (String name){
        nome = name;
    };
    public String getNome(){
        return nome;
    }
    public abstract void emitirSom();  
    public abstract void setNome();
>>>>>>> e1c556dfa7a317f61809afc147412ac692b86d63
    public abstract void ataqueAnuncio();
    @Override
    public String toString(){
        return this.nome;
    }
}
