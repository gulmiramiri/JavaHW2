package q10;

import java.util.Arrays;
import java.util.Scanner;

public class Queue {
    private int[] elements;
    private int size;

    public Queue() {
        this.elements = new int[8];  // Default initial capacity of the queue
        this.size = 0;  // Initialize the count to zero
    }

    public void enqueue(int v) {
        if (size == elements.length) {
            increaseArraySize();
        }
        elements[size++] = v;  // Add the element to the end of the array
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = elements[0];  // Get the first element in the queue
        shiftElementsLeft();  // Shift all elements one position to the left
        size--;  // Decrease the count of elements
        return value;  // Return the removed element
    }

    public boolean isEmpty() {
        return size == 0;  // Check if the queue is empty
    }

    public int getSize() {
        return size;  // Get the current size of the queue
    }

    private void increaseArraySize() {
        int[] newElements = new int[size * 2];  // Create a new array with double the current size
        System.arraycopy(elements, 0, newElements, 0, size);  // Copy elements from the old array to the new array
        elements = newElements;  // Update the elements array with the new larger array
    }

    private void shiftElementsLeft() {
        for (int i = 1; i < size; i++) {
            elements[i - 1] = elements[i];  // Shift all elements one position to the left
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Queue queue = new Queue();

            System.out.println("Enter 20 numbers from 1 to 20 into the queue:");
            for (int i = 0; i < 20; i++) {
                int number = i + 1;
                queue.enqueue(number);
            }

            System.out.println("Queue contents:");
            for (int i = 0; i < queue.getSize(); i++) {
                System.out.print(queue.dequeue() + " ");
            }
        }
    }
}