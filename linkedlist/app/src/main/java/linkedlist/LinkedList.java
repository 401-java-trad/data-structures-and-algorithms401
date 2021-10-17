// package linkedlist;

// public class LinkedList<T> {
//     Node<T> head;

//     public void insert(T value) {
//         Node<T> newNode = new Node<T>(value);
//         newNode.next = head;
//         head = newNode;

//     }

//     public boolean addAfter(T newValue, T valueToAddAfter) {
//         Node<T> currentNode = head;
//         if (currentNode == null) {
//             return false;
//         }
//         while (currentNode != null){
//             if(currentNode.value.equals(valueToAddAfter)){
//                 Node<T> newNode = new Node<T>(newValue);
//                 newNode.next = currentNode.next;
//                 currentNode.next = newNode;
//                 return true;
//             }
//             currentNode = currentNode.next;
//         }
// return false;
//     }

//     public boolean addBefore(T newValue, T valueToAddBefore) {
//         Node<T> currentNode = head;
//         if (currentNode == null) {
//             return false;
//         }
//         while (currentNode.next != null){
//             if(currentNode.next.value.equals(valueToAddBefore)){
//                 Node<T> newNode = new Node<T>(newValue);
//                 newNode.next = currentNode.next;
//                 currentNode.next = newNode;
//                 return true;
//             }
//             currentNode = currentNode.next;
//         }
// return false;
//     }

//     public boolean include(T value) {
//         Node<T> currentNode = head;
//         while (currentNode != null) {
//             if (currentNode.value.equals(value)) {

//                 return true;

//             }
//             currentNode = currentNode.next;
//         }
//         return false;
//     }

//     @Override
//     public String toString() {
//         Node<T> currentNode = head;
//         String str = "";
//         while (currentNode != null) {
//             str += "{" + currentNode.value + "}->";
//             currentNode = currentNode.next;
//         }
//         str += "NULL";
//         return str;
//     }
// }
