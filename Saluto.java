package org.saluti;

public abstract class Saluto {
        private String parola1;
        private String parola2;
        private String parola3;

       /*public String Saluta(String parola1, String parola2, String parola3) {
           this.parola1=parola1;
           this.parola2=parola2;
           this.parola3=parola3;
           String Salutato = this.Saluta();
           return Salutato;
        }*/

    public abstract String Saluta();

    public String getParola1() {
        return parola1;
    }

    public void setParola1(String parola1) {
        this.parola1 = parola1;
    }
    public String getParola2() {
        return parola2;
    }

    public void setParola2(String parola2) {
        this.parola2 = parola2;
    }

    public String getParola3() {
        return parola3;
    }

    public void setParola3(String parola3) {
        this.parola3 = parola3;
    }
}

