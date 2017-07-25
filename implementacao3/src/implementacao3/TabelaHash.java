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
public class TabelaHash implements TabelaHash_IF {

    private ListaEncadeada[] TabelaHash;
    private int Tamanho;
    int chave;
    
    public TabelaHash(int i) {
        Tamanho = i;
        chave = 0;
        TabelaHash = new ListaEncadeada[Tamanho];      
    }

    @Override
    public void insert(int element) {
        chave = FucaoHashing(element);
        
        if(TabelaHash[chave] != null)
            TabelaHash[chave].InserirNoInicio(element);   
        else
        {
            TabelaHash[chave] = new ListaEncadeada();
            TabelaHash[chave].InserirNoInicio(element);
        }
    }

    @Override
    public void remove(int element) throws Exception {
        chave = FucaoHashing(element);
        
        try
        {
            TabelaHash[chave].remove(element);
        }
        catch(Exception e)
        {
            throw new Exception("Elemento não encontrado");
        }
    }

    @Override
    public int search(int element) throws Exception {
        chave = FucaoHashing(element);
        
        try
        {
            int item = TabelaHash[chave].search(element);
            return item;
        }
        catch(Exception e)
        {
            throw new Exception("Elemento não encontrado");
        }
    }

    @Override
    public String print() {
        return "nada";
    }
    
    private int FucaoHashing(int numero)
    {
        return numero % Tamanho;
    }
    
}
