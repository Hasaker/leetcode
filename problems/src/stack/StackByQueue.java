package stack;

import java.util.LinkedList;
import java.util.Queue;

class StackByQueue {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private int size;

    /** Initialize your data structure here. */
    public StackByQueue() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
        this.size = 0;
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (queue1.isEmpty()) {
            queue1.offer(x);
        } else {
            queue1.offer(x);
        }
        size++;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (size == 0) {
            return -1;
        }
        int res = 0;
        if (queue1.isEmpty()) {
            for (int i = 0; i < size - 1; i++) {
                queue1.offer(queue2.poll());
            }
            res = queue2.poll();
        } else {
            for (int i = 0; i < size - 1; i++) {
                queue2.offer(queue1.poll());
            }
            res = queue1.poll();
        }
        size--;
        return res;
    }

    /** Get the top element. */
    public int top() {
        if (size == 0) {
            return -1;
        }
        int top = pop();
        if (queue1.isEmpty()) {
            queue2.offer(top);
        } else {
            queue1.offer(top);
        }

        size++;
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return size == 0;
    }
}

