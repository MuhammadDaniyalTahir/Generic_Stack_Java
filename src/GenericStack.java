class Node<T>{
    T data;
    Node next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

public class GenericStack<T> {
    private Node<T> head;
    int size;
    GenericStack(){
        size = 0;
        head = null;
    }

    public void push(final T data){
        Node<T> newNode = new Node<T>(data);
        if(head != null){
            Node<T> temp = head;
            head = newNode;
            head.next = temp;
        }
        else{
            head = newNode;
        }
        size++;
    }

    public T pop() throws ExceptionHandling {
        T data = null;
        if(head == null){
            throw new ExceptionHandling("Stack is already empty");
        }
        else{
            Node<T> temp = head;
            head = head.next;
            data = temp.data;
            temp = null; //deleting top element
            size--;
        }
        return data;
    }

    public boolean isEmpty(){
        return (head == null);
    }

    public int size(){
        return this.size;
    }

}
