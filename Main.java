
public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        Cola cola = new Cola();
        //System.out.println(pila.vacia());
        //pila.frente();
        pila.push(2);
        pila.push(3);
        pila.push(4);
        System.out.println(pila.top());
        pila.imprimir();
        System.out.println(pila.top());
        cola.adicionar(1);
        cola.adicionar(2);
        cola.adicionar(3);
        cola.adicionar(4);
        cola.extraer();
        System.out.println();
        cola.imprimir();
        cola.adicionar(5);
        cola.imprimir();

    }
}