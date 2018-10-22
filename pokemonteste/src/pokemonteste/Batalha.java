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
public class Batalha {
    int turno = -1;
    //@return retorna se está em batalha ou não;
    public boolean estaEmBatalha(){
        boolean bool = true;
        return bool;
    }
    //@return retorna de qual pokemon é o turno
    public Pokemon turno (Pokemon x, Pokemon y)
    {
        if (x.turno == -1)
        {
            x.turno = x.turno * -1;
            return x;
        }
        else if (x.turno == 1 && y.turno == -1)
        {
            y.turno = y.turno * -1;
            x. turno = x.turno * -1;
            return y;
        }
        else
        {
            y.turno = y.turno * -1;
            x. turno = x.turno * -1;
            return x;
        }
    }
    public void batalhando (Pokemon x, Pokemon y){
        while (x.hp !=0 || y.hp !=0 )
        {
           
        }
    }
}