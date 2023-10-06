public class Vetor<Generic> {
    private Generic[] vetor;
    private int countElements;

    public Vetor(int size) {

        vetor = (Generic[]) new Object[size];

        this.countElements = 0;
    }

    //Método que retorna o tamanho atual do vetor
    public int tamanho() {
        return countElements;
    }

    //Método que verifica se o vetor está vazio
    public boolean vazio() {
        return tamanho() == 0;
    }

    //Método que verifica se existe dado em uma posição do vetor
    public boolean existeDado(int position) {
        return vetor[position] != null;
    }

    //Método que retorna o valor de uma posição do vetor
    public Generic imprime(int position) {
        //verifica se existe
        if (!existeDado(position)) {
            throw new ArrayIndexOutOfBoundsException("Não existe dado nessa posição");
        }
        //retorna o valor
        return vetor[position];
    }

    //Método que adiciona no vetor usando o recurso de Iterador
    public void adicionarIterator(Generic element) {
        if (tamanho() == vetor.length) {
            redimensionar();
        }
        //Passamos o vetor como parâmetro para o iterador
        Terceractor iterator = new Terceractor(vetor);

        int i=0;
        while (iterator.hasNext()){ //percorrendo o vetor usando iterador
            if (iterator.next() == null) {
                vetor[i] =  element;
                countElements++;
                break;
            }
            i++;
        }
    }

    //Método que adiciona no vetor
    public void adicionar (Generic element, int position) {
        // verifica se a posição é válida
        if (position < 0 || position > countElements) {
            throw new IndexOutOfBoundsException("Essa posição não pode existir");
        }
        /*garante que a posição exista em caso de encher o Array*/
        if (countElements == vetor.length) {
            redimensionar();
        }
        //garante o espaço do elemento na posição desejada
        for (int i = countElements; i > position; i--) {
            vetor[i] = vetor[i-1];
        }
        //por fim, adiciona o elemento
        vetor[position] = element;
        countElements++;
    }

    public void adicionarInicio(Generic element){
        adicionar(element, 0);
    }

    public void adicionarFim(Generic element){
        adicionar(element, tamanho());
    }

    //Método que remove do vetor em uma determinada posição
    public void remover(int position) {
        //verifica se existe o dado
        if(!existeDado(position)) {
            throw new ArrayIndexOutOfBoundsException("dado inexistente");
        }
        /*substitui o elemento que quer ser removido pelo próximo elemento
         no array e faz o mesmo com todos os próximos elementos
         até chegar no final do array*/
        for(int i = position; i < countElements - 1; i++){
            vetor[i] = vetor[i + 1];
        }
        //tira a casa da contagem
        countElements--;
    }

    //Método que remove do início do vetor
    public void removerInicio() {
        remover(0);
    }

    //Método que remove do fim do vetor
    public void removerFim() {
        remover(countElements - 1);
    }

    //Método que limpa/apaga todas as posições do vetor
    public void limpar() {
        for(int i = 0; i < this.vetor.length; i++){
            this.remover(i);
        }
    }

    //Método que dobra o tamanho do vetor caso ele atinja o seu tamanho.
    public void redimensionar() {
        if(this.countElements == this.vetor.length) {
            Generic[] newArray = (Generic[]) new Object[this.vetor.length * 2];
            for(int i = 0; i < this.vetor.length; i++){
                newArray[i] = this.vetor[i];
            }
            this.vetor = newArray;
        }
    }

    public void conferirRemove(Vetor teste){
        for(int i = 0; i < countElements; i++){
            System.out.println(teste.imprime(i));
        }
    }
}
