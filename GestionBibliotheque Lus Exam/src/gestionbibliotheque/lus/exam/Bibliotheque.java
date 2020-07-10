/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbibliotheque.lus.exam;

import java.util.ArrayList;

/**
 *
 * @author ~Bouchaib
 */
public class Bibliotheque {

    /*Properties*/
    private ArrayList<Document> documents;
    private ArrayList<Adherent> adherents;

    public Bibliotheque() {
        documents = new ArrayList<Document>();
        adherents = new ArrayList<Adherent>();
    }

    public void ajouterAdherent(Adherent ad) {
        adherents.add(ad);
    }

    public void ajouterDocument(Document doc) {
        documents.add(doc);
    }

    public void listerDocuments() {
        int documentsSize = documents.size();
        for (int i = 0; i < documentsSize; i++) {
            System.out.println(documents.get(i).toString());
        }
    }
    
    public void listerAdherents() {
        int adherentsSize = adherents.size();
        for (int i = 0; i < adherentsSize; i++) {
            System.out.println(adherents.get(i).toString());
        }
    }
}
