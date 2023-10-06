class Queue<Generic> {
    /*
     * Mantém o controle da primeira posição da fila
     */
    private Cell first;
    /*
     * Mantém o controle da ultima posição da fila
     */
    private Cell last;
    /*
     * Mantém controle do tamanho da fila
     */
    private int queueSize;

    /**
     * Construtor da fila
     */
    public Queue(){
        queueSize = 0;
    }

    /**
     * Verifica se a fila está vazia
     * @return boolean
     */
    public boolean isQueueEmpty(){
        return queueSize == 0;
    }

    /**
     * Verifica se o elemento está vazio (null)
     * @param element
     * @return boolean
     */
    public boolean isElementEmpty(Generic element){
        return element == null;
    }

    /**
     * Verifica se existe algum dado no primeiro lugar da fila
     * @param element
     * @return boolean
     */
    public boolean verifyFirst(Generic element){
        return getFirst() == element;
    }

    /**
     * retorna o tamanho da fila
     * @return int
     */
    public int size(){
        return queueSize;
    }

    /**
     * Adiciona elementos no final da fila
     * @param element
     */
    public void enqueue(Generic element){
        if(isElementEmpty(element)){
            throw new NullPointerException("Elemento é nulo");
        }
        Cell cell = new Cell(null, element);

        if(this.queueSize == 0){
            this.first = this.last = cell;
        }else {
            cell.setNext(this.last);
            this.last = cell;
        }
        this.queueSize += 1;
    }

    /**
     * Remove elementos do começo da fila
     */
    public void dequeue(){
        if(isQueueEmpty()) throw new RuntimeException("Fila Vazia");

        Iterador iterador = new Iterador(this.last);

        while(iterador.hasNext()){
            if(iterador.getCurrentCell().getNext() != this.first){
                iterador.next();
            } else {
                iterador.getCurrentCell().setNext(null);
                this.first = iterador.getCurrentCell();
                queueSize -= 1;
                break;
            }
        }
    }

    /**
     * Retorna o primeiro da fila sem remove-lo
     * @return Generic
     */
    public Generic getFirst(){
        if(isQueueEmpty()) throw new RuntimeException("Fila Vazia");
        return (Generic) this.first.getElement();
    }

    /**
     * edita o primeiro elemento da fila
     * @param element
     */
    public void editFirst(Generic element){
        if(isElementEmpty(element)) throw new NullPointerException("Elemento está vazio");
        this.first.setElement(element);
    }

    /**
     * Apaga todos os elementos da fila
     */
    public void clear(){
        this.first = this.last = null;
        this.queueSize = 0;
    }
}
