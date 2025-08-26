public class Pila <T>{
    Node <T> head = null;
    Node push(T data) {
        Node <T> node = new Node(data);
        if(head==null){
            head=node;
        }else {
            node.next = head;
            head = node;
        }
        return head;
    }
    void imprimir() {
        Node current = head;
        System.out.println("Imprimiendo pila");
        while (current != null) {
            System.out.println(current.data + "\n" + "-");
            current = current.next;
        }
    }
     T pop() {
        if(head == null){
            System.out.println("La pila está vacía");
            return null;
        }
        Node <T> current = head;
        head = current.next;
        return current.data;
    }
    T top() {
        if (head==null){
            System.out.println("La pila esta vacía");
            return null;
        }else{
            return head.data;
        }
    }
    boolean isEmpty() {
        return head == null;

    }


}