/*
* Application pour la gestion de bibliotheque et des adherants
* Examen de Java
* LUS – Ingénierie Informatique et Technologie Avancée pour l’entreprise
 */
package gestionbibliotheque.lus.exam;

/**
 *
 * @author ~Bouchaib
 */
public class GestionBibliothequeLusExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bibliotheque bibli = new Bibliotheque();
        Adherent ad = new Adherent("pr1", "nm1");
        Adherent ad2 = new Adherent("pr2", "nm2");
        bibli.ajouterAdherent(ad);
        bibli.ajouterAdherent(ad2);

        int n = 4;
        Document[] docs = new Document[n];
        docs[0] = new Livre(1, "ttr1", "aut1");
        docs[1] = new Journal(2, "ttr2", "period1");
        docs[2] = new BD(3, "ttr3", "aut2", "nm2");
        docs[3] = new Livre(4, "ttr4", "aut4");

        for (int i = 0; i < n; i++) {
            System.out.println("document " + docs[i]);
            bibli.ajouterDocument(docs[i]);
        }
        bibli.listerDocuments();
        bibli.listerAdherents();
    }
}
