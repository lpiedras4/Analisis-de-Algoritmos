public class Cola <T>{
    Node <T> head = null;
    Node adicionar( T data) {
        Node <T> node = new Node(data);
        if(head==null){
            head = node;
        }else{
            Node last = head;
            while(last.next!=null){
                last = last.next;
            }
            last.next= node;

        }
        return head;
    }
    void imprimir() {
        Node current = head;
        System.out.println("Imprimiendo cola");
        while(current!=null){
            System.out.println(current.data + "\n" + "-");
            current = current.next;
        }
    }
    T extraer() {
        if(head == null){
            System.out.println("La cola está vacía");
            return null;
        }
        //NO USAR HEAD
        Node <T> current = head;
        head = current.next;
        return current.data;
    }
    T frente() {
        if (head==null){
            System.out.println("La cola esta vacía");
            return null;
        }else{
            return head.data;
        }
    }
    T fondo() {
        if (head==null){
            System.out.println("La cola esta vacía");
            return null;
        }else{
            Node <T> last = head;
            while(last.next!=null){
                last = last.next;
            }
            return last.data;
        }

    }
    boolean vacia() {
        if(head==null){
            return true;
        }else{
            return false;
        }
    }
}

