package implementacao3;

public class NoHeap 
{
    private int dado;
    private int indice;
    private NoHeap filhoEsquerdo;
    private NoHeap filhoDireito;


    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }


    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }


    public NoHeap getFilhoEsquerdo() {
        return filhoEsquerdo;
    }

    public void setFilhoEsquerdo(NoHeap filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }


    public NoHeap getFilhoDireito() {
        return filhoDireito;
    }

    public void setFilhoDireito(NoHeap filhoDireito) {
        this.filhoDireito = filhoDireito;
    }
}
