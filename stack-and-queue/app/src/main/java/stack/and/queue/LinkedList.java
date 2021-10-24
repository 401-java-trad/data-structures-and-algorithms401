package stack.and.queue;

 public class LinkedList<T> {
     Node<T> head;

     public void insert(T value) {
         Node<T> newNode = new Node<T>(value);
         newNode.setNext(head);
         head = newNode;

     }

     public boolean addAfter(T newValue, T valueToAddAfter) {
         Node<T> currentNode = head;
         if (currentNode == null) {
             return false;
         }
         while (currentNode != null){
             if(currentNode.getValue().equals(valueToAddAfter)){
                 Node<T> newNode = new Node<T>(newValue);
                 newNode.setNext(currentNode.getNext());
                 currentNode.setNext(newNode);
                 return true;
             }
             currentNode = currentNode.getNext();
         }
 return false;
     }

     public boolean addBefore(T newValue, T valueToAddBefore) {
         Node<T> currentNode = head;
         if (currentNode == null) {
             return false;
         }
         while (currentNode.getNext() != null){
             if(currentNode.getNext().getValue().equals(valueToAddBefore)){
                 Node<T> newNode = new Node<T>(newValue);
                 newNode.setNext(currentNode.getNext());
                 currentNode.setNext(newNode);
                 return true;
             }
             currentNode = currentNode.getNext();
         }
 return false;
     }

     public boolean include(T value) {
         Node<T> currentNode = head;
         while (currentNode != null) {
             if (currentNode.getValue().equals(value)) {

                 return true;

             }
             currentNode = currentNode.getNext();
         }
         return false;
     }
    public T kthFromEnd(int kth){
         Node<T> current = head;
         int length =0;
         while (current!=null){
             length++;
             current = current.getNext();
         }
   if(kth<=length){
       current = head;

       int i =0;
       while (current!=null){
           i++;
           if(i == (length-kth)){
               return current.getValue();
           }
           current = current.getNext();
       }
   }


         return null;
    }
     @Override
     public String toString() {
         Node<T> currentNode = head;
         String str = "";
         while (currentNode != null) {
             str += "{" + currentNode.getValue() + "}->";
             currentNode = currentNode.getNext();
         }
         str += "NULL";
         return str;
     }
 }

