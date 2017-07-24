/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao3;

/**
 *
 * @author Hall-9000
 */
public class MaxHeap implements ArvoreBinaria_IF {
    
    private int[] Heap;
    private int tamanho;
    private int tamanhoMaximo;
    
    private static final int Cabeca = 1;

    public MaxHeap() { 
        this.tamanhoMaximo = 0;
        this.tamanho = 0;
        Heap = new int[this.tamanhoMaximo +1];
        Heap[0] = Integer.MAX_VALUE;
    }
    
    private int Pai(int posicao)
    {
        return posicao/2;
    }
    
    private int FilhoEsquerdo(int posicao)
    {
        return (2*posicao);
    }
    
    private int FilhoDireito(int posicao)
    {
        return (2*posicao) + 1;
    }
    
    private boolean IsFolha(int posicao)
    {
        if(posicao >= (tamanho/2) && posicao <= tamanho)
            return true;
        return false;
    }
    
    private void Troca(int fposicao, int sposicao)
    {
        int aux;
        aux = Heap[fposicao];
        Heap[fposicao] = Heap[sposicao];
        Heap[sposicao] = aux;     
    }
    
    private void MaxHeapify(int posicao)
    {
        if(!IsFolha(posicao))
        {
            if(Heap[posicao] < Heap[FilhoEsquerdo(posicao)] || Heap[posicao] < Heap[FilhoDireito(posicao)])
            {
                if(Heap[FilhoEsquerdo(posicao)] > Heap[FilhoDireito(posicao)])
                {
                    Troca(posicao, FilhoEsquerdo(posicao));
                    MaxHeapify(FilhoEsquerdo(posicao));
                }
                else
                {
                    Troca(posicao, FilhoDireito(posicao));
                    MaxHeapify(FilhoDireito(posicao));
                }
            }
        }
    }

    @Override
    public void insert(int element) {
        int[] novoArray = AumentarArray(Heap);
        Heap = novoArray;

        Heap[++tamanho] = element;
        int atual = tamanho;

        while(Heap[atual] > Heap[Pai(atual)])
        {
            Troca(atual, Pai(atual));
            atual = Pai(atual);
        }            
    }
    
    private int[] AumentarArray(int[] array)
    {
        int[] novoArray = new int[array.length + 1];
        
        for(int i=0; i< array.length; i++)
        {
            novoArray[i] = array[i];
        }
        
        return novoArray;
    }
    
    @Override
    public int[] preOrder() {
        int[] novo = new int[0];
        return novo;
    }

    @Override
    public int[] order() {
        int[] novo = new int[0];
        return novo;
    }

    @Override
    public int[] postOrder() {
        int[] novo = new int[0];
        return novo;
    }

    @Override
    public boolean isComplete() {
        int[] arrayAux = RemoverInteger();
        double qtdMaxElemento = (Math.log(arrayAux.length +1)/Math.log(2))-1;
        int aux = (int) qtdMaxElemento;
        
        if((Math.pow(2, aux +1)-1) == arrayAux.length)
            return true;
        else
            return false;
    }   
    
    public void print()
    {
        for(int i=1; i<= (tamanho/2); i++)
        {
            System.out.print("Pai: " + Heap[i] + " Filho Esquerdo: " + Heap[(2*i)] + " Filho Direiro: " + Heap[(2*i)+1]);
            System.out.println();
        }
    }
    
    public void MaxHeap()
    {
        for(int posicao = (tamanho/2); posicao >= 1; posicao--)
        {
            MaxHeapify(posicao);
        }
    }
    
    public int Remover()
    {
        int removido = Heap[Cabeca];
        Heap[Cabeca] = Heap[tamanho--];
        MaxHeapify(Cabeca);
        return removido;
    }
    
    private int[] RemoverInteger()
    {
        int[] novoArray = new int[Heap.length-1];
        
        for(int i=0; i<novoArray.length; i++)
        {
            novoArray[i] = Heap[i+1];
        }
        
        return novoArray;
    }
}
