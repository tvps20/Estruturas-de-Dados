package implementacao3;

public class BST implements ArvoreBinaria_IF {
    
    private NoArvore raiz;
 
    public BST() {
        raiz = null;
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
        return new int[1];
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
    
    public int AlturaDaArvore()
    {
        return AuxParaCalcularAltura(raiz);
    }
    
    private int AuxParaCalcularAltura(NoArvore _raiz)
    {
        if(_raiz == null)
           return -1; //Altura da arvore vazia

        int AlturaEsquerda = AuxParaCalcularAltura(_raiz.getEsquerdo());
        int AlturaDireita = AuxParaCalcularAltura(_raiz.getDireito());

        if(AlturaEsquerda > AlturaDireita)
            return AlturaEsquerda + 1;
        else
            return AlturaDireita + 1;
       
    }
    
    public int NumeroDeNos()
    {
        return AuxParaCalcularNumeroDeNos(raiz);
    }
    
    private int AuxParaCalcularNumeroDeNos(NoArvore _raiz)
    {
        if(_raiz == null)
            return 0;
        
        int numeroDeNosEsquerdo = AuxParaCalcularNumeroDeNos(_raiz.getEsquerdo());
        int numeroDeNosDireito = AuxParaCalcularNumeroDeNos(_raiz.getDireito());
        
        return numeroDeNosEsquerdo + numeroDeNosDireito + 1;
    }
}
