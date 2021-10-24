package stack.and.queue;

public class Stack <T>{
    private Node<T> top;
    public T pop(){
       if (!isEmpty()){
           Node<T> node = top;
           top = top.getNext();
           node.setNext(null);
           return node.getValue();
       }else{
           System.out.println("the stack is empty");
       }
       return null;
    }
    public void push(T value){
        Node<T> newNode = new Node<>(value);
        newNode.setNext(top);
        top=newNode;

    }
    public boolean isEmpty(){
        return top == null;
    }
    public T peek(){
        if (!isEmpty()){
            return top.getValue();
        }else {
            System.out.println("the stack is empty");
        }
        return null;
    }

    public Node<T> getTop() {
        return top;
    }

//    public void setTop(Node<T> top) {
//        this.top = top;
//    }
}
