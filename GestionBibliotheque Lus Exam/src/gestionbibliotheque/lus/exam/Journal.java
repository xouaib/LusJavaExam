/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbibliotheque.lus.exam;

/**
 *
 * @author ~Bouchaib
 */
public class Journal extends Document {

    /*Properties*/
    private String periodicite;

    public Journal() {
        super();
        this.periodicite = "";
    }

    public Journal(int nmr, String ttr, String perio) {
        super(nmr, ttr);
        this.periodicite = perio;
    }

    @Override
    public String toString() {
        return "periode : " + this.periodicite + " , " + super.toString();
    }
}
