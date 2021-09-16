package org.saluti;

public class Main {
    public static void main(String[] args) {
        Saluto italiano= new SalutoIta();
        String parola1= italiano.Saluta();
        System.out.println(parola1);

        Saluto inglese= new SalutoIng();
        String parola2= inglese.Saluta();
        System.out.println(parola2);

        Saluto spagnolo= new SalutoSpa();
        String parola3= spagnolo.Saluta();
        System.out.println(parola3);

    }
}
