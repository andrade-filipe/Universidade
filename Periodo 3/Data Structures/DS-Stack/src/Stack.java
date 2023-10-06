public class Stack<Generic>{
    private Cell head;
    private int stackSize;

    /**
     * Construtor Padrão
     */
    public Stack(){
        this.head = null;
        this.stackSize = 0;
    }

    /**
     * Método responsável por checar se a célula do topo
     * da pilha contém dados.
     *
     * @return boolean - true (existe dado), false(não há dados)
     */
    public boolean existsData(){
        if(this.head != null){
            return true;
        }
        return false;
    }

    /**
     * Método responsável por checar se a pilha está vazia
     *
     * @return boolean - true(está vazia), false(não está vazia)
     */
    public boolean isEmpty(){
        if(this.stackSize == 0){
            return true;
        }
        return false;
    }

    /**
     * Método responsável por retornar o tamanho da pilha
     * @return int - Referência à variável stackSize
     */
    public int size(){
        return this.stackSize;
    }

    /**
     * Método responsável por limpar a pilha inteira, faz isso
     * removendo o topo dela e "resetando" o tamanho para 0
     */
    public void clear(){
        this.head = null;
        this.stackSize = 0;
    }

    /**
     * Método responsável por adicionar elementos na pilha
     * @param element - Pode ser qualquer objeto
     */
    public void push(Generic element){
        var cell = new Cell(null,element);
        if(isEmpty()){
            this.head = cell;
        }else{
            cell.setNext(head);
            this.head = cell;
        }
        this.stackSize += 1;
    }

    /**
     * Método Remove o objeto do topo da lista e traz para "cima"
     * um outro elemento
     */
    public void pop(){
        if(!existsData()){
            throw new IndexOutOfBoundsException("Não há elemento no topo");
        }else{
            this.head = this.head.getNext();
        }
        this.stackSize -= 1;
    }

    /**
     * Método Altera o valor do Objeto no topo da pilha
     * @param element - Pode ser qualquer objeto
     */
    public void pull(Generic element){
        if(!existsData()){
            throw new IndexOutOfBoundsException("Não há elemento no topo");
        }else{
            this.head.setElement(element);
        }
    }

    /**
     * Método Revela o objeto do topo da pilha, mas não remove-o
     * @return
     */
    public Generic top(){
        if(!existsData()){
            throw new IndexOutOfBoundsException("Não há elemento no topo");
        }
        return ((Generic) this.head.getElement());
    }
}
