package PilaNodo;


public class MetodosNodos {
    Nodo cima;
    int tam;
    
    public void Ingresarnumero(int num){
        Nodo nodo=new Nodo(num);
        nodo.siguiente=cima;
        cima=nodo;
        tam++;
    }
    
    public void borrar(){
        if(cima==null){
            System.out.println("Pila vacia");
        }else{
            cima=cima.siguiente;
            tam--;
        }
    }
    public void mostrar(){
        Nodo recorre=cima;
        while(recorre!=null){
            System.out.println(recorre.numero);
            recorre=recorre.siguiente;
        }
    }

}
