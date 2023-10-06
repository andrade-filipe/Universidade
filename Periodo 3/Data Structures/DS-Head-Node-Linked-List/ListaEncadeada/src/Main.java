public class Main {
    public static void main(String[] args) {
        ListaDoisCadeado<Integer> teste = new ListaDoisCadeado<>(1);//[1]
        teste.addElement(2,1);//[1,2]
        teste.addElement(3,2);//[1,2,3]
        teste.setLastElement(4);//[1,2,3,4]
        teste.addElement(7,3);
        teste.addElement(8,4);
        teste.setFirstElement(111);

        System.out.println(teste.findCell(4));

        for (int i = 0; i < teste.getListSize(); i++) {
            System.out.println(teste.findCell(i).getElement());
        }

        teste.removeFirstCell();
        System.out.println(teste.findCell(0).getElement());
        teste.removeLastCell();
        System.out.println(teste.findCell(teste.getListSize()-1).getElement());
        teste.removeCell(1);
        System.out.println(teste.findCell(1).getElement());
        teste.removeAll();
        System.out.println(teste);
    }
}