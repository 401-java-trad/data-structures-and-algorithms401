package stack.and.queue;



public class PseudoQueue<T> implements QueueInterface<T> {
    private Stack<T> firstStack;
    private Stack<T> secondStack;

    public PseudoQueue() {
        firstStack = new Stack<>();
        secondStack = new Stack<>();
    }


    @Override
    public void enqueue(T value) {
        while (secondStack.peek()!=null){
            firstStack.push(secondStack.pop());
        }
        firstStack.push(value);
    }

    @Override
    public T dequeue() {
        while (firstStack.peek()!=null){
            secondStack.push(firstStack.pop());
        }
        return secondStack.pop();
    }
}
