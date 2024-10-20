package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[5];
        int[] valoresNotas = {100,50,20,10,5,2};

        for (int i = 0; i < valoresNotas.length; i++){
            int quantidade = valor / valoresNotas[i];
            if(quantidade > 0){
                papeisMoeda[i] = new PapelMoeda(valoresNotas[i], quantidade);
                valor -= quantidade * valoresNotas[i];
            }
        }
        //papeisMoeda[1] = new PapelMoeda(2, count);
        // issue resolvido no método acima
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            for (int i = 6; i >= 0; i++) {
                if (troco.papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            for (int i = 6; i >= 0 && ret != null; i++) {
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
                }
            }
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
    }
}
