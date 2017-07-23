package implementacao3;

/*
 * Interface para implemento da classe "ListaEncadeada"
 * que deve ser implementada usando a abordagem recursiva
 * considerando sempre uma lista de nmeros inteiros no negativos
 */
public interface ListaEncadeada_IF {
	public boolean isEmpty();
	public int size();
	public int search(int element) throws Exception; //lanar exceo caso no encontre
	public void insert(int element); //deve-se inserir no incio da lista
	public void remove(int element);
	public int[] toArray();
}