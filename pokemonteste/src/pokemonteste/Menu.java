/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;
import Pokemons.*;
import Pokemons.Pikachu;
import static java.lang.System.in;
import java.util.*;

/**
 *
 * @author crist
 */
public class Menu {
    /**
     * Classe que irá ser responsável pela iteração constante, chamando a classe Locais e mudando entre os locais, após recebimento da insígnia, e verificar 
     * se chegou no limite de insígnia pra zerar o jogo, e salvar.
     * 
     */
    public Menu () {
        
    }
    
    public Menu(String nome, int idade) {
        Treinador coach = new Treinador(nome, idade);
    }
    
    public void rodar() {
        //Aqui ocorrerá todas as chamadas de funções e classe Locais.
        //Caso queira acrescentar funções à essa classe para que seja chamada na main, vá na Classe Tela no pacote Interface, e chame a função 
        // onde está sendo chamada a função rodar() lá, terá um comentário em CapsLock em cima.
        Treinador coach = new Treinador();
        Pikachu Pikachu = new Pikachu("Pikachu");
        System.out.println("Você foi designado para treinar um Pikachu, parabéns!!");
        coach.pokemons.add(Pikachu);
        Scanner teclado = new Scanner (System.in);
        
        
        do {
        System.out.println("1 - Enfrentar Lider do Ginasio");
        System.out.println("2 - Enfrentar Pokemons Selvagens");
        System.out.println("O que queres fazer?");
        int escolha = teclado.nextInt();
         switch (escolha){
             case 1: Locais a = new Locais();
             a.Ginasio1(coach);
             break;
             case 2: Locais b = new Locais();
             b.Farm1(coach);
             break; 
            default: System.out.println("Escolha Inválida!");
         }
        }while(coach.getNumeroInsignias() == 0);
        if (coach.getNumeroInsignias() == 1){
            do {
            int escolha = teclado.nextInt();
            Scanner scan = new Scanner(System.in);
             switch (escolha){
                case 1: Locais a = new Locais();
                a.Ginasio2(coach);
                break;
                case 2: Locais b = new Locais();
                b.Farm2(coach);
                break; 
                 default: System.out.println("Escolha Inválida!");
             }
            }while(coach.getNumeroInsignias() == 1);
        }
        if (coach.getNumeroInsignias() == 2)
        {
        do {
        int escolha = teclado.nextInt();
        Scanner scan = new Scanner(System.in);
         switch (escolha){
                case 1: Locais a = new Locais();
                a.Ginasio3(coach);
                break;
                case 2: Locais b = new Locais();
                b.Farm3(coach);
                break; 
             default: System.out.println("Escolha Inválida!");
         }
        }while(coach.getNumeroInsignias() == 2);
       }
       if (coach.getNumeroInsignias() == 3)
            System.out.println("Você venceu!!");
}
}
