/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

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
        
    }
}
