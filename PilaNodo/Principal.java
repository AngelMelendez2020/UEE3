package PilaNodo;

import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        MetodosNodos pila=new MetodosNodos();
        boolean si = true;
        int op;
        int num=0;
        System.out.println("Inserta 10 numeros automaticamente del 50 al 500");
        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1.Insertar dato");
            System.out.println("2.Borrar dato");
            System.out.println("3.Mostrar dato");
            System.out.println("4.salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    for (int i = 1; i <=10; i++) {
                        num=(int) (Math.random()*500+50);
                        pila.Ingresarnumero(num);
                    }
                    break;
                case 2:
                    pila.borrar();
                    break;
                case 3:
                    pila.mostrar();
                    break;
                case 4:
                    si = false;
                    break;

            }
        } while (si);
    }
    
}
