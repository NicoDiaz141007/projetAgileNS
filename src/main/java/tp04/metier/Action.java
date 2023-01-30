/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp04.metier;

import java.util.Objects;

/**
 *
 * @author perussel
 */
public abstract class Action {
    
    private String libelle;
    //Ajout de la valeur de l'action
    private float valeur;


    /**
     * Get the value of libelle
     *
     * @return the value of libelle
     */
    public String getLibelle() {
        return libelle;
    }

    //Ajout de la méthode setValeur

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }
    

    
    
    public Action(String libelle) {
        this.libelle = libelle;
    }

    public abstract float valeur(Jour j);
    
    @Override
    public int hashCode() {
        int hash = 3;
        int val = 53;
        //int test = 1;
        hash = val * hash + Objects.hashCode(this.libelle);
        return hash;
    }

    /**
     * 
     * @param obj
     * @return 
     */
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Action other = (Action) obj;
        if (!Objects.equals(this.libelle, other.libelle)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getLibelle();
    }
}
