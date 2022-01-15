package question3;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

public class Pile2<T> implements PileI<T>{
    /** par délégation : utilisation de la class Stack */
    private Stack<T> stk;
    /** la capacité de la pile */
    private int capacite;

    /** Création d'une pile.
     * @param taille la "taille maximale" de la pile, doit être > 0
     */
    public Pile2(int taille){
     if (taille <= 0){
            taille = CAPACITE_PAR_DEFAUT;
        }
        this.stk = new Stack<T>();
        this.capacite = taille;
        // à compléter
    }

    public Pile2(){
   this(PileI.CAPACITE_PAR_DEFAUT);
        // à compléter
    }
        public boolean estPleine(){
        return this.stk.size() == this.capacite;
    }

    public void empiler(T o) throws PilePleineException{
       if(estPleine()){
            throw new PilePleineException();
        }
        this.stk.push(o);
        // à compléter
    }

    public T depiler() throws PileVideException{
        // à compléter
    }

    public T sommet() throws PileVideException{
        // à compléter
    }

    // recopier ici toutes les autres méthodes
    // qui ne sont pas modifiées en fonction
    // du type des éléments de la pile

} // Pile2