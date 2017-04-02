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
        No aux = cabeca;
        while(aux.getProximo() != null)
        {
            tamanho++;
            aux = aux.getProximo();
        }
        return tamanho;
    }

    @Override
    public int search(int element) throws Exception {
        return 0;
    }

    @Override
    public void insert(int element) {
        No auxCabeca = cabeca;
        if(cabeca.getProximo() == null)
        {
            No novaCabeca = new No(element);
            novaCabeca.setProximo(cabeca);
            cabeca = novaCabeca;           
        }
        else
        {
            while(auxCabeca.getProximo() != null)            
                auxCabeca = auxCabeca.getProximo();
            No novoNo = new No(element);
            novoNo.setProximo(auxCabeca.getProximo());
            auxCabeca.setProximo(novoNo);           
        }
    }

    @Override
    public void remove(int element) {
       if(cabeca.getDado() == element)
           cabeca = cabeca.getProximo();
       else
       {
           No aux = cabeca;
           //while ((aux != null) and (aux.getDado() != element))
           {
               
           }
       }
       
    }

    @Override
    public int[] toArray() {
        int[] resultado = new int[size()];
        No aux = cabeca;
        int contador = 0;
        
        while(aux.getProximo() != null)
        {
            resultado[contador] = aux.getDado();
            aux = aux.getProximo();
            contador++;
        }
        
        return resultado;
    }    
}
