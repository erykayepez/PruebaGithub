/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import static java.time.Clock.system;

/**
 *
 * @author Usuario
 */
public class Practica {
private String marca;

public Practica(String mc)
{
    this.marca=mc;
}

    private Practica() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public void setMarca(String mc)
{
    this.marca=mc;
}
public String getMarca()
{
    return marca;
}

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Practica pr=new Practica();
        pr.setMarca("VolksWagen");
        System.out.println(pr.getMarca());
    }
    
}
