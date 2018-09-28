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
public class Beedril extends Pokemon {

    @Override
    public void emitirSom() {
        System.out.println("Beedril!!");
    }

    @Override
    public void setNome() {
        this.nome="Beedril";
    }

    @Override
    public void ataqueAnuncio() {
        System.out.println(this.nome + " usa malemolencia");
    }
}
