public class Pilha {

    private Object[] elementos;
    private int quantidade = 0;

    public Pilha(int i) {
        elementos = new object[máximo];
    }

    public boolean estavazia() {
        return quantidade == 0;
    }

    public int tamanho() {
        return quantidade;
    }

    public void empilha (Object elemento) {
        if(quantidade == elementos.length)
             throw new PilhaCheiaException("Não é possível empilhar mais elementos")
        this.elementos[quantidade] = elemento;
        quantidade++;

    }
    public Object topo() {
        return elementos[quantidade-1];
    }

    public Object desempilha() {
        if(estaVazia())
            throw new PilhaVaziaException("Não é possível desempilhar.")
        Object topo = topo();
        quantidade--1;
        return topo;
    }
}