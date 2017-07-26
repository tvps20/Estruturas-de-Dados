package implementacao3;

public class testes {

    public static void main(String[] args) throws Exception {
        
        System.out.println("The Max Heap is ");
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
        maxHeap.MaxHeap();
 
        maxHeap.print();
        System.out.println("The max val is " + maxHeap.Remover());     
        
        System.out.println("Brincando com TabelaHash...");
        TabelaHash_IF tabela = new TabelaHash(2);
        
        tabela.insert(1);
        tabela.insert(2);
        tabela.remove(2545);
  
        System.out.println(tabela.print());

             
    }
    
}
