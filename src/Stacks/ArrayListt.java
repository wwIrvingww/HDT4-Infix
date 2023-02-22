import java.util.ArrayList;

public class  ArrayListt <T> {

        //Atributos
        private ArrayList<T> stack;

        //Constructor
        public ArrayListt() {
            stack = new ArrayList<T>();
        }

        //Funciones

        public void push(T value) {
            stack.add(value);
        }

        public void pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            int lastIndex = stack.size() - 1;
            stack.remove(lastIndex);
        }

        public <T> T peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return (T) stack.get(stack.size() - 1);
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }

        public int size() {
            return stack.size();
        }

        public void clear() {
            stack.clear();
        }

}



