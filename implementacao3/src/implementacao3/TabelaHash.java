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
            TabelaHash[chave].search(element); 
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
        String text = "";
        
        for(int i=0; i<=TabelaHash.length -1; i++)
        {
            if(TabelaHash[i] != null)
            {
                int[] arrayDaVez = TabelaHash[i].toArray();           
                text += i + ": ";

                for(int j=0; j<=arrayDaVez.length-1; j++)
                {
                    if(j != arrayDaVez.length -1)                    
                        text += arrayDaVez[j] + ", ";
                    else
                        text += arrayDaVez[j];                
                }  

                if(i != TabelaHash.length -1)
                    text += "\n";  
            }
            else
            {
                if(i != TabelaHash.length -1)
                    text += i + ": \n";
                else
                    text += i + ": ";
            }
        }     
        return text;
    }
    
    private int FucaoHashing(int numero)
    {
        return numero % Tamanho;
    }
    
}
