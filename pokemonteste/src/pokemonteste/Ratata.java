/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;
import java.util.*;

/**
 *
 * @author eleno
 */
public class Ratata extends Pokemon implements Normal {

    @Override
    public void emitirSom() {
        System.out.println("Ratata!");
    }
        public void setNome() {
        this.nome="Ratata";
    }
        public void ataqueAnuncio() {
        System.out.println(this.nome + " usa choque do trovão");
    }
}
