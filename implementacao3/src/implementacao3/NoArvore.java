package implementacao3;

public class NoArvore 
{
    private int dado;
    private NoArvore esquerdo;
    private NoArvore direito;
    private NoArvore parente;

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
    
}
