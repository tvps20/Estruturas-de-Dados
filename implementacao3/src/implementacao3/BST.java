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
        int[] resultado = new int[NumeroDeNos()];
        FazerPercursoPreOrder(resultado, raiz);
        return resultado;
    }
    
    private void FazerPercursoPreOrder(int[] array, NoArvore _no)
    {
        if(_no != null)
        {
            InserirNoArray(array, _no);
            FazerPercursoPreOrder(array, _no.getEsquerdo());
            FazerPercursoPreOrder(array, _no.getDireito());
        }
    }
    
    private void InserirNoArray(int[] array, NoArvore _no)
    {
        for(int i=0; i<array.length; i++)
        {
            if(array[i] == 0) //Corrigir isso, se o tiver um elemento 0 inserido, vai da problema.
            {
                array[i] = _no.getDado();
                break;
            }           
        }
    }
    

    @Override
    public int[] order() {
        int[] resultado = new int[NumeroDeNos()];
        FazerPercursoOrder(resultado, raiz);
        return resultado; 
    }
    
    private void FazerPercursoOrder(int[] array, NoArvore _no)
    {
        if(_no != null)
        {
            FazerPercursoOrder(array, _no.getEsquerdo());
            InserirNoArray(array, _no);
            FazerPercursoOrder(array, _no.getDireito());
        }
    }

    @Override
    public int[] postOrder() {
        int[] resultado = new int[NumeroDeNos()];
        FazerPercursoPostOrder(resultado, raiz);
        return resultado;
    }
    
    private void FazerPercursoPostOrder(int[] array, NoArvore _no)
    {
        if(_no != null)
        {
            FazerPercursoPostOrder(array, _no.getEsquerdo());            
            FazerPercursoPostOrder(array, _no.getDireito());
            InserirNoArray(array, _no);
        }
    }
    
    @Override
    public boolean isComplete() {
        //Se a quantidade de nos sem grau 2(serão as folhas) for igual a 2^altura retorna verdadeiro
        //Pois para ser completa, apenas as folhas devem ter menos do q grau 2.
        if(ContarFolhas(raiz) == (Math.pow(2, AlturaDaArvore())))
           return true;
        else
           return false;
    }
    
    public int ContarFolhas(NoArvore _no) //Retorna a soma dos nos que não possi grau 2.
    { 
        if((_no.getEsquerdo() == null) || (_no.getDireito() == null)) //Verifica se o nó não tem grau 2.
            return 1;
 
        int grausEsquerda = ContarFolhas(_no.getEsquerdo());
        int grausDireita = ContarFolhas(_no.getDireito());
        
        return grausEsquerda + grausDireita;
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
