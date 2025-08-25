public class Cola{
Node head = null;
    <T> Node adicionar( T data) {
             Node node = new Node(data);
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
    Node extraer() {
        if(head == null){
            System.out.println("La cola está vacía");
            return null;
        }
        //NO USAR HEAD
        Node current = head;
        System.out.println("Dato eliminado: " + current.data);
        head = current.next;
        return head;
    }
    <T> Object frente() {
        if (head==null){
            System.out.println("La cola esta vacía");
            return null;
        }else{
            return head.data;
        }
    }
    <T> Object fondo() {
        if (head==null){
            System.out.println("La cola esta vacía");
            return null;
        }else{
            Node last = head;
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

