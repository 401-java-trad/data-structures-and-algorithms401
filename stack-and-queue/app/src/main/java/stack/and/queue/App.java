/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

public class App {


    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
        ZipListsClass<Integer> zipListsClass = new ZipListsClass<>();
        linkedList.insert(5);
        linkedList.insert(4);
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);
        linkedList2.insert(6);
        linkedList2.insert(7);
        linkedList2.insert(8);
        linkedList2.insert(9);
        linkedList2.insert(10);
//        System.out.println(zipListsClass.zipLists(linkedList,linkedList2));
        System.out.println("llll "+linkedList.kthFromEnd(5));
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(8);
        stack.push(5);
        stack.push(3);
        stack.push(8);
        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        System.out.println(queue.peek());

        PseudoQueue<String> pseudoQueue = new PseudoQueue<>();
        pseudoQueue.enqueue("Ali");
        pseudoQueue.enqueue("Azo");
        pseudoQueue.enqueue("yosef");
        pseudoQueue.enqueue("hatem");
        pseudoQueue.enqueue("hatemmmmmm");
        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.dequeue());


    }
}
