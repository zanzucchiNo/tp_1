package fr.zanzucchi;

public class Exercice1 {

    public void exo1() {

        //Identifiez l’erreur et corrigez

    for(int i = 0; i< 5;i++)
        System.out.print(i +", ");
    System.out.print("\n");

    //Identifiez l’erreur 2 et corrigez

    float a = 3.0f;
    double b = 4;
    double c;
    c =Math.sqrt(a *a +b *b);
    System.out.println("c = "+c);

    //Identifiez l’erreur 3 et corrigez

    byte bb = 42;
    char cc = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = .1234;
    double resultat = (f * bb) + (i / cc) - (d * s);
System.out.print((f *bb)+" + "+(i /cc)+" - "+(d *s));
System.out.println(" = "+resultat);
    byte b2 = 10;
    double b3 = b2 * bb;
System.out.println("b3 = "+b3);
}

}
