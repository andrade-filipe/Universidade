public class ListaDoisCadeado<Generic> {
    private int listSize; //guarda o tamanho da lista
    private HeadCell headCell;

    //Construtor vazio
    public ListaDoisCadeado(){
        this.headCell = new HeadCell();
        this.listSize = 0;
    }

    //Construtor c/ elemento, automaticamente se torna o 1o elemento
    public ListaDoisCadeado(Generic element){
        this.headCell = new HeadCell();
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
        Iterador iterate = new Iterador(headCell.getHead());
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
            if(position <= listSize/2){
                return normalIteration(position);
            }
            if(position > listSize/2){
                return backwardsiteration(position);
            }
        }
        return null;
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
            //pego a celula anterior a posição que quero adicionar
            Cell previousCell = findCell(position - 1);
            //pego a celula NA posição que quero adicionar
            Cell previousNext = previousCell.getNext();
            //adiciono a celula na posição que quero adicionar
            Cell cell = new Cell(previousCell,previousNext, element);
            //Coloco a nova como anterior daquela que tava na posição que eu quis adicionar
            previousNext.setPrevious(cell);
            //Coloco a próxima da celula anterior à posição que quero adicionar como a nova celula
            previousCell.setNext(cell);
            //conto + 1 na lista
            listSize += 1;
        }
    }

    //adiciona um elemento na primeira posição da lista, empurrando o antigo primeiro para frente
    public void setFirstElement(Generic element){
        Cell firstCell = new Cell(element);

        if (this.listSize == 0){
            headCell.setHead(firstCell);
            headCell.setTail(firstCell);
        } else {
            firstCell.setNext(headCell.getHead());
            firstCell.setPrevious(headCell.getTail());
            headCell.setHead(firstCell);
        }
        this.listSize += 1;
    }

    //adiciona um elemento na ultima posição da lista
    public void setLastElement(Generic element){
        Cell lastCell = new Cell(null,null,element);

        if(this.listSize == 0){
            setFirstElement(element);
        } else {
            headCell.getTail().setNext(lastCell);
            lastCell.setPrevious(headCell.getTail());
            lastCell.setNext(headCell.getHead());
            headCell.setTail(lastCell);
        }
        this.listSize += 1;
    }

    //remove celula especifica
    public void removeCell(int position){
        try{
            //acho a celula anterior a que quero descartar
            Cell removedPrevious = findCell(position - 1);
            //Coloco a próxima da anterior a que quero remover como a proxima da proxima
            Cell removedNext = removedPrevious.getNext().getNext();
            if(removedNext == null){
                removeLastCell();
            } else {
                removedPrevious.setNext(removedNext);
            }
            //coloco a anterior da próxima da posição removida como a celula anterior a
            removedNext.setPrevious(removedPrevious);
            //deleto colocando a sua anterior como nula e a proxima como nula
            Cell removeThis = removedPrevious.getNext();
            removeThis.setPrevious(null);
            removeThis.setNext(null);
            //diminuo a quantidade
            listSize -= 1;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //remove a primeira célula da lista
    public void removeFirstCell(){
        try{
            Cell newFirst = headCell.getHead().getNext();
            headCell.setHead(newFirst);
            newFirst.setPrevious(headCell.getTail());
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
            //coloco a próxima da penúltima como head
            beforeTheLast.setNext(headCell.getHead());
            //a nova última é a penúltima
            headCell.setTail(beforeTheLast);
            //removido com sucesso
            listSize -= 1;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //remove todas as células "esquecendo" o começo e o final da lista.
    public void removeAll(){
        try{
            headCell.setHead(null);
            headCell.setTail(null);
            listSize = 0;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Cell normalIteration(int position){
        //percorre a lista
        Iterador iterate = new Iterador(headCell.getHead());
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
        return iterate.getCurrentCell();
    }

    public Cell backwardsiteration(int position){
        Iterador iterateBackwards = new Iterador(headCell.getTail());
        int countBackwards = listSize - 1;

        while(iterateBackwards.hasNext()){
            if (countBackwards != position){
                iterateBackwards.previous();
                countBackwards--;
            } else {
                break;
            }
        }
        //retorna a celula que parou
        return iterateBackwards.getCurrentCell();
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "first= " + headCell.getHead() +
                ", last= " + headCell.getTail() +
                ", listSize= " + listSize +
                '}';
    }
}
