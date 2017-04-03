package implementacao3;

public class ListaEncadeadaMetodoInterativo implements ListaEncadeada_IF 
{
    private No cabeca = new No();
    
    @Override
    public boolean isEmpty() {
        if(cabeca.getProximo() == null)
            return true;
        else
            return false;
    }

    @Override
    public int size() {
        int tamanho = 0;
        No atual = cabeca;
        while(atual.getProximo() != null)
        {
            tamanho++;
            atual = atual.getProximo();
        }
        return tamanho;
    }

    @Override
    public int search(int element) throws Exception {
        No atual = cabeca;
        while((atual.getProximo() != null) && (atual.getDado() != element))
            atual = atual.getProximo();
        
        if(atual.getDado() == element)
            return atual.getDado();
        else
            throw new Exception("Elemento não encontrado");
            
    }

    @Override
    public void insert(int element) {       
        if(cabeca.getProximo() == null)
        {
            No novaCabeca = new No(element);
            cabeca.setProximo(novaCabeca);
        }
        else
        {
            No atual = cabeca.getProximo();
            No novoNo = new No(element);
            novoNo.setProximo(atual);
            cabeca.setProximo(novoNo);
        }
    }

    @Override
    public void remove(int element) {
           No atual = cabeca;
           No anterior = null;
           while((atual.getProximo() != null) && (atual.getDado() != element))
           {
               anterior = atual;
               atual = atual.getProximo();
           }
           
           if(atual.getProximo() != null)
               anterior.setProximo(atual.getProximo());
           else
               anterior.setProximo(null); 
    }

    @Override
    public int[] toArray() {
        int[] resultado = new int[size()];
        No atual = cabeca;
        int contador = 0;
        
        while(atual.getProximo() != null)
        {
            atual = atual.getProximo();
            resultado[contador] = atual.getDado();            
            contador++;
        }        
        return resultado;
    }    
}
