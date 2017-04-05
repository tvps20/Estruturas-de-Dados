package implementacao3;

public class NoArvore implements Comparable<NoArvore>
{
    private int dado;
    private NoArvore esquerdo;
    private NoArvore direito;
    private NoArvore parente;
    
    public NoArvore(int _dado)
    {
        this.dado = _dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoArvore getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(NoArvore esquerdo) {
        this.esquerdo = esquerdo;
    }

    public NoArvore getDireito() {
        return direito;
    }

    public void setDireito(NoArvore direito) {
        this.direito = direito;
    }

    public NoArvore getParente() {
        return parente;
    }

    public void setParente(NoArvore parente) {
        this.parente = parente;
    }

    @Override
    public int compareTo(NoArvore o) {
        
        if(this.dado < o.dado)
            return -1;
        if(this.dado > o.dado)
            return 1;
        return 0;
    }  
}
