public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> teste = new ListaEncadeada<>(1);//[1]
        teste.setFirstElement(2);// [2,1]
        teste.addElement(78,1); //[2,78,1]
        teste.addElement(5,2); //[2,78,5,1]
        teste.addElement(99, 3); //[2,78,5,99,1]
        teste.addElement(7, 4); //[2,78,5,99,7,1]
        teste.setLastElement(98); //[2,78,5,99,7,1,98]

        Iterador iterate = new Iterador(teste.findCell(0));
        int count = 0;
        while (iterate.hasNext()){
            if(count < teste.getListSize()){
                System.out.println(teste.findCell(count).getElement());
                count++;
            } else {
                break;
            }
        }

        teste.removeLastCell();//removi ultima pos (98), novo ultimo é (1)
        System.out.println(teste.findCell(teste.getListSize() - 1).getElement() +
        "--------");//confirmado
        teste.removeFirstCell(); //removi primeira celula (2), novo primeiro é (78)
        System.out.println(teste.findCell(0).getElement() + "========"); //confirmado
        teste.removeCell(2); //removi pos 2 (99) nova pos 2 é (7)
        System.out.println(teste.findCell(2).getElement() + "+++++++++");//confirmado

        Iterador iterate2 = new Iterador(teste.findCell(0));
        int count2 = 0;
        //nova lista = [78,5,7,1]
        while (iterate2.hasNext()){
            if(count2 < teste.getListSize()){
                System.out.println(teste.findCell(count2).getElement() + "!!!!!!!!");
                count2++;
            } else {
                break;
            }
        }
        teste.removeAll();
        System.out.println(teste + "________");
        //working as expected
    }
}