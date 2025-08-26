import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //int array[]={1,2,3,4,5,6,7,8};
        Pila stack = new Pila();
        Cola cola = new Cola();

        stack.push("Wos");
        stack.push('A');
        stack.push(0.938465396);
        stack.push(67);



       /*for(int i=0;i<array.length;i++){
            stack.push(array[i]);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }*/

        cola.adicionar("mateo");
        cola.adicionar('T');
        cola.adicionar(0.1234556);
        cola.adicionar(67);
        System.out.println(cola.frente());
        System.out.println(cola.fondo());
        System.out.println();
       /*for(int i=0;i<array.length;i++) {
            cola.adicionar(array[i]);
        }*/
      while(!cola.vacia()){
           System.out.println(cola.extraer());
       }




        }
    }
