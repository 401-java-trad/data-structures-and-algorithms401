package stack.and.queue;

public class Queue <T>{
    private Node<T> front;
    private Node<T> rear;

    public void enqueue(T value){
        Node<T> newNode = new Node<T>(value);
        if(isEmpty()){
            front = newNode;
        }else{
            rear.setNext(newNode);
        }
        rear = newNode;
    }
    public T dequeue(){
        if(!isEmpty()){
        Node<T> node  = front;
        front = front.getNext();
        node.setNext(null);
        return node.getValue();
        }else{
            System.out.println("Queue is empty");
        }
        return  null;
    }

    public T peek(){
        if(!isEmpty()){
            return front.getValue();
        }else{
            System.out.println("Queue is empty");
        }
        return  null;
    }
    public boolean isEmpty(){
        return rear == null;
    }
}
