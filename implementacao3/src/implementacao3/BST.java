package implementacao3;

public class BST implements ArvoreBinaria_IF {
    
    private NoArvore raiz;
    private ListaEncadeada listaDeNos;
    
    public BST() {
        raiz = null;
        listaDeNos = new ListaEncadeada();
    }

    @Override
    public void insert(int element) {
        NoArvore pai = raiz;
        NoArvore no = null;
        
        while(pai != null)
        {
            no = pai;
            if(element < no.getDado())
                pai = pai.getEsquerdo();
            else
                pai = pai.getDireito();
        }
               
        if(raiz == null)
            raiz = new NoArvore(element);
        else
            if(element < no.getDado())
                no.setEsquerdo(new NoArvore(element));
            else
                no.setDireito(new NoArvore(element));
    }  
    
    @Override
    public int[] preOrder() {
        preOrder(raiz);
        return listaDeNos.toArray();
    }
    
    public void ColocarNoArray(NoArvore _no)
    {
        listaDeNos.InserirNoInicio(_no.getDado());
    }
    
    private int[] preOrder(NoArvore _no)
    {
        if(_no != null)
        {
            ColocarNoArray(_no);
            preOrder(_no.getEsquerdo());
            preOrder(_no.getDireito());
        }
        
        return listaDeNos.toArray();
    }

    @Override
    public int[] order() {
        return new int[1]; 
    }

    @Override
    public int[] postOrder() {
        return new int[1]; 
    }
    
   
    
    @Override
    public boolean isComplete() {
        return true; 
    }
    
    //public int SizeArvore(NoArvore _no)
    {
       //if(_no != null)
       {
           
       }      
    }
}
