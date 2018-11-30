    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
package pokemonteste;

import Pokemons.*;
import java.util.*;

    /**
     *
     * @author eleno
     */
    public class Locais {

    String Nome;
    String Tipo;
    int    ExperienciaPadrao;// atributo pra calcular experiencia obtida por pokemons selvagens da area de farm
    Batalha batalha; 
    public Locais(){};
    public void Farm1 (Treinador x) {
        Nome = "Floresta";
        ExperienciaPadrao = 50;
        ArrayList<Pokemon> pokemonsarea = new ArrayList();
        Pokemon pidgeot = new Pidgeot("Pidgeot");
        pokemonsarea.add(pidgeot);
        AreaFarm area = new AreaFarm();
        area.preencheLista(pokemonsarea);
        area.rodalocal(x);
    }
    public void Farm2 (Treinador x) {
        Nome = "Lago";
        ExperienciaPadrao = 100;
        ArrayList<Pokemon> pokemonsarea = new ArrayList();
        Pokemon tangela = new Tangela ("Tangela");
        pokemonsarea.add(tangela);
        batalha.pokemonvspokemon(x, tangela);
    }
    public void Farm3 (Treinador x) {
        Nome = "Vulcão";
        ExperienciaPadrao = 200;
        ArrayList<Pokemon> pokemonsarea = new ArrayList();
        Pokemon magmar = new Magmar ("Magmar");
        pokemonsarea.add(magmar);
        batalha.pokemonvspokemon(x, magmar);
    }
    public void Ginasio1 (Treinador x){
        Nome = "Ginásio Básico";
        Treinador y = new Treinador ("Bruxo", 43);
        ArrayList<Pokemon> pokemonsarea = new ArrayList();
        Pokemon Ratata = new Ratata ("Ratata");
        Pokemon Fearow = new Fearow ("Fearow");
        batalha.treinadorvstreinador(x, (LiderdeGinasio) y);
    }
    public void Ginasio2 (Treinador x){
        Nome = "Ginásio Médio";
        Treinador y = new Treinador ("Carol",20);
        ArrayList<Pokemon> pokemonarea = new ArrayList();
        Pokemon Arcanine = new Arcanine ("Arcanine");
        Pokemon Vileplume = new Vileplume ("Vileplume");
        batalha.treinadorvstreinador(x, (LiderdeGinasio) y);
    }
    public void Ginasio3 (Treinador x){
        Nome = "Ginásio Difícil";
        Treinador y = new Treinador ("Julia", 21);
        ArrayList<Pokemon> pokemonarea = new ArrayList();
        Pokemon Ninetales = new Ninetales("Ninetales");
        Pokemon Growlithe = new Growlithe("Growlithe");
        batalha.treinadorvstreinador(x, (LiderdeGinasio) y);
    }
}
        /* aqui será instanciado todos os locais, como os ginásios e os lugares secundário para farmar xp
        * atributos basicos: nome, pokemons e está atrelado a batalha, pois aqui ocorrerá as batalhas
        * os ginasios tem insignias para facilitar o controle de quando o jogo é completo
        */

