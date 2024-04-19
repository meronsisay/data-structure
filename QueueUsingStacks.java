
import java.util.Stack;

public class QueueUsingStacks {

    private Stack<Integer> inputStack; 
    private Stack<Integer> outputStack; 
    public QueueUsingStacks() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void enqueue(int data) {
        inputStack.push(data);
    }

    public int dequeue() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        if (!outputStack.isEmpty()) {
            return outputStack.pop();
        } else {
            // If both stacks are empty, queue is empty
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // or throw an exception
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    // Method to get the size of the queue
    public int size() {
        return inputStack.size() + outputStack.size();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Dequeued: " + queue.dequeue()); // Dequeued: 10
        System.out.println("Dequeued: " + queue.dequeue()); // Dequeued: 20

        queue.enqueue(50);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
        // Output should be: Dequeued: 30, Dequeued: 40, Dequeued: 50
    }
}
