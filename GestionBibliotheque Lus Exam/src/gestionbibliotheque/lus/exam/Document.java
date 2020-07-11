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
public class Document {

    /*Properties*/
    protected int numero;
    protected String titre;

    public Document() {
        this.titre = "";
    }

    public Document(int nmr, String ttr) {
        this.titre = ttr;
        this.numero = nmr;
    }

    public void setNumero(int nmr) {
        this.numero = nmr;
    }

    public int getNumero() {
        return this.numero;
    }
    
    public void setTitre(String ttr) {
        this.titre = ttr;
    }

    public String getTitre() {
        return this.titre;
    }

    @Override
    public String toString() {
        return "titre du document : " + this.getTitre();
    }
}
