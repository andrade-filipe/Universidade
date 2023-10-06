public class ListaEncadeada<Generic> {
    private Cell first; //Guarda a primeira celula da lista
    private Cell last; //Guarda a Ultima célula da lista
    private int listSize; //guarda o tamanho da lista

    //Construtor vazio
    public ListaEncadeada(){
        this.first = null;
        this.last = null;
        this.listSize = 0;
    }

    //Construtor c/ elemento, automaticamente se torna o 1o elemento
    public ListaEncadeada(Generic element){
        this.first = null;
        this.last = null;
        this.listSize = 0;
        this.setFirstElement(element);
    }

    //confere se o elemento é vazio
    public boolean isEmpty(Generic element){
        if(element == null){
            return true;
        } else {
            return false;
        }
    }

    //confere se o elemento já existe na lista
    public boolean alreadyExists(Generic element){
        Iterador iterate = new Iterador(first);
        boolean exists = false;
        //percorre a lista
        while(iterate.hasNext()){
            //confere elemento por elemento
            if(iterate.getCurrentCell().getElement().equals(element)){
                return true;
            } else {
                return false;
            }
        }
        return exists;
    }

    //retorna o tamanho da lista
    public int getListSize(){
        return listSize;
    }

    //retorna a célula na posição desejada (através de Iterator)
    public Cell findCell(int position){
        if(listSize == 0){
            throw new IndexOutOfBoundsException("Lista Vazia");
        } else if (position < 0 || position >= listSize){
            throw new IndexOutOfBoundsException("Posição inválida");
        } else {
            //percorre a lista
            Iterador iterate = new Iterador(first);
            int count = 0;
            while(iterate.hasNext()){
                //chega até o lugar correto na lista
                if(count != position){
                    iterate.next();
                    count++;
                } else {
                    break;
                }
            }
            //retorna a celula que parou
            return iterate.getCurrentCell();
        }
    }

    //Adiciona elemento na posição desejada
    public void addElement(Generic element, int position){
        if(alreadyExists(element) || isEmpty(element)){
            throw new NullPointerException("Elemento Já existe ou é nulo");
        }else if (position < 0 || position > listSize){
            throw new IndexOutOfBoundsException("Posição Não existe");
        }else if (position == listSize){
            //caso o usuário coloque uma posição que não está no meio
            setLastElement(element);
        }else if (position == 0){
            //caso o usuário coloque uma posição que não está no meio
            setFirstElement(element);
        }else{
            Cell previousCell = findCell(position - 1);
            Cell previousNext = previousCell.getNext();
            Cell cell = new Cell(previousNext, element);
            previousCell.setNext(cell);
            listSize += 1;
        }
    }

    //adiciona um elemento na primeira posição da lista, empurrando o antigo primeiro para frente
    public void setFirstElement(Generic element){
        Cell firstCell = new Cell(element);

        if (this.listSize == 0){
            first = last = firstCell;
        } else {
            firstCell.setNext(first);
            first = firstCell;
        }
        this.listSize += 1;
    }

    //adiciona um elemento na ultima posição da lista
    public void setLastElement(Generic element){
        Cell lastCell = new Cell(null,element);

        if(this.listSize == 0){
            setFirstElement(element);
        } else {
            last.setNext(lastCell);
            last = lastCell;
        }
        this.listSize += 1;
    }

    //remove celula especifica
    public void removeCell(int position){
        try{
            //acho a celula anterior a que quero descartar
            Cell previousCell = findCell(position - 1);
            //pulo a celula que quero remover colocando a sua próxima como próxima da anterior.
            previousCell.setNext(previousCell.getNext().getNext());
            listSize -= 1;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //remove a primeira célula da lista
    public void removeFirstCell(){
        try{
            first = first.getNext();
            listSize -= 1;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //remove a última celula da lista.
    public void removeLastCell() {
        try {
            //Pego a penúltima célula da lista
            Cell beforeTheLast = findCell(listSize - 2);
            //coloco a próxima da penúltima como nulo
            beforeTheLast.setNext(null);
            //a nova última é a penúltima
            last = beforeTheLast;
            //removido com sucesso
            listSize -= 1;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //remove todas as células "esquecendo" o começo e o final da lista.
    public void removeAll(){
        try{
            first = null;
            last = null;
            listSize = 0;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "first=" + first +
                ", last=" + last +
                ", listSize=" + listSize +
                '}';
    }
}
