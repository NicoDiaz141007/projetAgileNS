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
public class Portefeuille {

    Map<Action, LignePortefeuille> mapLignes;

    public class LignePortefeuille {
        // Déclaration des attributs d'une ligne de portefeuille

        private Action action;

        private int qte;


        public int getQte() {
            return qte;
        }

        public void setQte(int qte) {
            this.qte = qte;
        }

        //Déclaration getters et setters
        public Action getAction() {
            return this.action;
        }



        public LignePortefeuille(Action action, int qte) {
            this.action = action;
            this.qte = qte;
        }

        @Override
        public String toString() {
            return Integer.toString(qte);
        }
    }

    public Portefeuille() {
        this.mapLignes = new HashMap();
    }

    
    
    public void acheter(ActionSimple a, int q, Jour j) {
    // Vérifier si l'action est déjà présente dans le portefeuille
    if (this.mapLignes.containsKey(a) == false) {
        // Sinon on ajoute une nouvelle ligne de portefeuille pour cette action
        this.mapLignes.put(a, new LignePortefeuille(a, q));
    } else {
        // Sinon on met à jour la quantité pour cette action existante
        this.mapLignes.get(a).setQte(this.mapLignes.get(a).getQte() + q);
    }
    // On met à jour la valeur de l'action pour le jour actuel
    a.setValeur(j, a.valeur(j));
}

public void vendre(ActionSimple a, int q, Jour j) {
    // Vérifier si l'action est déjà présente dans le portefeuille
    if (this.mapLignes.containsKey(a) == true) {
        // Si c'est la cas, on vérifie si la quantité totale est supérieure à la quantité vendue
        if (this.mapLignes.get(a).getQte() > q) {
            // Si oui, mettez à jour la quantité pour cette action
            this.mapLignes.get(a).setQte(this.mapLignes.get(a).getQte() - q);
        } else if (this.mapLignes.get(a).getQte() == q) {
            // Sinon si la quantité totale est égale à la quantité vendue, on supprime cette action du portefeuille
            this.mapLignes.remove(a);
        }
    }        
    // On met à jour la valeur de l'action pour le jour actuel
    a.setValeur(j, a.valeur(j));
}

 
    @Override
    public String toString() {
        return this.mapLignes.toString();
    }

    public float valeur(Jour j) {
        float total = 0;
        for (LignePortefeuille lp : this.mapLignes.values()) {
            total = total + (lp.getQte() * lp.getAction().valeur(j));
        }
        return total;
    }
}
