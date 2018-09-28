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
public class Pigeot extends Pokemon implements Normal{

    @Override
    public void emitirSom() {
        System.out.println("Pigeot!");
    }
        public void setNome() {
        this.nome="Pigeot";
    }
        public void ataqueAnuncio() {
        System.out.println(this.nome + " usa bicada bolada");
    }
}
