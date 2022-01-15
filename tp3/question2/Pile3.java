package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;

/**
 * Décrivez votre classe PileVector ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile3 implements PileI {

    private Vector<Object> v;
    private int capacite;
    public Pile3() {
        this(0);
    }

    public Pile3(int taille) {
        // traiter le cas <=0
    if (taille <= 0){
            taille = CAPACITE_PAR_DEFAUT;
        }
        this.v = new Vector<Object>();
        this.capacite = taille;
        // à compléter
    }

      public void empiler(Object o) throws PilePleineException {
        if(estPleine()){
            throw new PilePleineException();
        }
        this.v.add(o);
    }

       public Object depiler() throws PileVideException {
        if (estVide()){
            throw new PileVideException();
        }
        int d = v.lastIndexOf(sommet());    
        return this.v.remove(d);
    }

   public Object sommet() throws PileVideException {
        if (estVide())
            throw new PileVideException();
        return this.v.lastElement();
    }

    public int taille() {
        // à compléter
       return this.v.size();

    }

    public int capacite() {
        // à compléter
        return this.capacite;
    }

    public boolean estVide() {
        // à compléter
         return this.v.isEmpty();
    }

    public boolean estPleine() {
        // à compléter
      return this.v.size()==this.capacite;
    }

 
    public String toString() {
        String s = "[";
        for (int i = this.v.size() - 1; i >= 0; i--) {
            s+= this.v.get(i).toString();
            if(i >0){
                s+= ", ";
            }

        }
        return s + "]"; 
    }

    public boolean equals(Object o) {
        // à compléter
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

}
