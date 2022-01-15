package question2;

import question1.PilePleineException;
import question1.PileVideException;

/**
 * A remplacer en partie par votre classe Pile de la question 1.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile implements PileI {

    private Object[] zone;
    private int ptr;

    public Pile(int taille) {
        if (taille <= 0){
            taille = CAPACITE_PAR_DEFAUT;
        }
        this.zone = new Object[taille];
        this.ptr = 0;
    }

    public Pile() {
        this(0);
    }

    public void empiler(Object o) throws PilePleineException {
        if (estPleine())
            throw new PilePleineException();
        this.zone[this.ptr] =o;
        this.ptr++;
    }

     public Object depiler() throws PileVideException {
        if (estVide())
            throw new PileVideException();
        this.ptr--;
        return this.zone[ptr];
    }

    public Object sommet() throws PileVideException {

        if (estVide())
            throw new PileVideException();

        return this.zone[ptr-1];
    }

    public int capacite() {
        // a completer
       return this.zone.length;
    }

    public int taille() {
        // a completer
            if(estVide()){
            ptr = 0;
        }
        return this.ptr;
    }

    public boolean estVide() {
        // a completer
        return this.ptr == 0;
    }

    public boolean estPleine() {
        // a completer
        return this.ptr == this.zone.length;
    }

    public boolean equals(Object o) {
        // a completer
        if( this== o ){
            return true;
        }      
        if(!(o instanceof Pile)){
            return false;
        }
        Pile p1 = (Pile)o;
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        // a completer
          StringBuffer s = new StringBuffer("[");
        for (int i = ptr - 1; i >= 0; i--) {
            s.append(zone[i].toString());
            if (i > 0)
                s.append(", ");
        }
        s.append("]");
        return s.toString();
    }
}