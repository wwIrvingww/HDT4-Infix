import java.util.Vector;

public class Vectorr <T> {
        private Vector<T> stack;

        public Vectorr() {
            stack = new Vector<T>();
        }

        public void push(T value) {
            stack.add(value);
        }

        public T pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return stack.remove(size() - 1);
        }

        public T peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return stack.get(size() - 1);
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }

        public int size() {
            return stack.size();
        }
    }

