package br.unit.exercicio;

public class TestaPonto
{
    /**
     * Método main
     */
    public static void main(String args[])
    {
       Ponto p1, p2, p3;
 
       p1 = new Ponto();
       p2 = new Ponto(-5, 10);
       p3 = new Ponto(p2);
 
       System.out.println(p1.toString());
       System.out.println(p2.toString());
       System.out.println(p3.toString());
       
       p1.desloca(100, 550);
       
       System.out.println(p1.toString());

       p1.desloca("-450", "548");
       
       System.out.println(p1.toString());
       
    }
}