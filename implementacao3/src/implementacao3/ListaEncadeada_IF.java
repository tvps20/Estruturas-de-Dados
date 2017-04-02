package implementacao3;

/*
 * Interface para implementa��o da classe "ListaEncadeada"
 * que deve ser implementada usando a abordagem recursiva
 * considerando sempre uma lista de n�meros inteiros n�o negativos
 */
public interface ListaEncadeada_IF {
	public boolean isEmpty();
	public int size();
	public int search(int element) throws Exception; //lan�ar exce��o caso n�o encontre
	public void insert(int element); //deve-se inserir no in�cio da lista
	public void remove(int element);
	public int[] toArray();
}