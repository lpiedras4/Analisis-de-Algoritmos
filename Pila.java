public class Pila {
    Node head = null;
<T> Node push(T data) {
    Node node = new Node(data);
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


 Node pop() {
    if(head == null){
        System.out.println("La pila está vacía");
        return null;
    }
    Node  current = head;
    System.out.println("Dato eliminado: " + current.data);
    head = head.next;
    return head;
}
<T> Object top() {
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