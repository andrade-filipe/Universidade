public class Deck<Generic> {
    private Cell head;
    private Cell tail;
    private int deckSize;

    /**
     * Construtor Padrão
     */
    public Deck(){
        this.head = null;
        this.tail = null;
        this.deckSize = 0;
    }

    /**
     * Método responsável por checar se o deck está vazio.
     *
     * @return boolean - true(está vazia), false(não está vazia)
     */
    public boolean isEmpty(){
        if(this.deckSize == 0){
            return true;
        }
        return false;
    }

    /**
     * Método responsável por checar se o deck contém dados.
     *
     * @return boolean - true (existe dado), false(não há dados)
     */
    public boolean existsData(){
        if (this.head == null && this.tail == null){
            return false;
        }
        return true;
    }

    /**
     * Método responsável por retornar o tamanho do deck
     * @return int - Referência à variável stackSize
     */
    public int size(){
        return this.deckSize;
    }

    /**
     * Método responsável por limpar o deck inteiro, faz isso
     * removendo o topo e a cauda dele e "resetando" o tamanho para 0
     */
    public void clear(){
        this.head = null;
        this.tail = null;
        this.deckSize = 0;
    }

    /**
     * Método adiciona na frente do deck
     * @param element - Pode ser qualquer objeto
     */
    public void addToHead(Generic element){
        var cell = new Cell(null,element);
        if(isEmpty()){
            this.head = this.tail = cell;
        }else{
            cell.setNext(this.head);
            this.head = cell;
        }
        this.deckSize += 1;
    }

    /**
     * Método adiciona no fundo do deck
     * @param element - Pode ser qualquer objeto
     */
    public void addToTail(Generic element){
        var cell = new Cell(null,element);
        if(isEmpty()){
            addToHead(element);
        }else{
            cell.setNext(this.tail);
            this.tail = cell;
            this.deckSize += 1;
        }
    }

    /**
     * Método revela o elemento na frente do deck
     * @return Generic - Retorna qualquer tipo de objeto
     */
    public Generic getFromHead(){
        if(!existsData()){
            throw new IndexOutOfBoundsException("Não há dados no deck");
        }
        return (Generic) this.head.getElement();
    }

    /**
     * Método Revela o elemento no fundo do deck
     * @return Generic - retorna qualquer tipo de objeto
     */
    public Generic getFromTail(){
        if(!existsData()){
            throw new IndexOutOfBoundsException("Não há dados no deck");
        }
        return (Generic) this.tail.getElement();
    }

    /**
     * Método Edita o elemento na frente do deck
     * @param element - Pode ser qualquer objeto
     */
    public void editHead(Generic element){
        if(!existsData()){
            throw new IndexOutOfBoundsException("Não há dados no deck");
        }else{
            this.head.setElement(element);
        }
    }

    /**
     * Método edita o elemento no fundo do deck
     * @param element - pode ser qualquer objeto
     */
    public void editTail(Generic element){
        if(!existsData()){
            throw new IndexOutOfBoundsException("Não há dados no deck");
        }else{
            this.tail.setElement(element);
        }

    }

    /**
     * Método remove o objeto da frente do deck
     */
    public void removeFromHead(){
        if(!existsData()){
            throw new IndexOutOfBoundsException("Não há dados no deck");
        }else{
            this.head = this.head.getNext();
            this.deckSize -= 1;
        }
    }

    /**
     * Método remove o objeto no fundo do deck
     */
    public void removeFromTail(){
        if(!existsData()){
            throw new IndexOutOfBoundsException("Não há dados no deck");
        }else{
            this.tail = this.tail.getNext();
            this.deckSize -=1;
        }
    }
}
