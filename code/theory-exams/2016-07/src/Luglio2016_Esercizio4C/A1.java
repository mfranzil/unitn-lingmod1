package Luglio2016_Esercizio4C;

// ERRORE IN FASE DI COMPILAZIONE

public class A1 {
    int x = 7;
}

class B1 extends A1 {
    int k = 1;
}

public class E1 {
    public static void main(String[] args) {
	A1 a1 = new B1();
	A1 a2 = (A1)(new B1());
	B1 b1 = new A1();	    // ERRORE
	
	System.out.println(a1.x + a2.x + b1.x);
    }
}
