/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp04.metier;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author perussel
 */
public class ActionSimple extends Action {

    // attribut lien
    private Map<Jour, Cours> mapCours;
    
    // constructeur
    public ActionSimple(String libelle) {
        // Action simple initialisée comme 1 action
        super(libelle);
        // init spécifique
        this.mapCours = new HashMap();
    }
    
    // enrg possible si pas de cours pour ce jour
    public void enrgCours(Jour j, float v) {
        if(this.mapCours.containsKey(j) == false)
            this.mapCours.put(j, new Cours(j, v));
    }
    
    public void modifJourVal(Jour j, float x){
        if(this.mapCours.containsKey(j) == true)
            this.mapCours.replace(j, new Cours (j,x));
    }
    
    //Ajout de la méthode setValeur pour définir la valeur d'une action pour un jour donné
    public void setValeur(Jour j, float valeur) {
    if(this.mapCours.containsKey(j)) {
        this.mapCours.replace(j, new Cours(j, valeur));
    }
}


   
    
    
    @Override
    public float valeur(Jour j) {
        if(this.mapCours.containsKey(j) == true)
            return this.mapCours.get(j).getValeur();
        else 
            return 0; // definition d'une constante possible
    }
  
    // encapsulation de la définition de la classe Cours
    private class Cours {
        
        private Jour jour;

        private float valeur;

        public float getValeur() {
            return valeur;
        }
        
        public Jour getJour() {
            return jour;
        }

        public Cours(Jour jour, float valeur) {
            this.jour = jour;
            this.valeur = valeur;
        }

    }
}