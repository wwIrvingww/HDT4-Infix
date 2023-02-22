public class ArrayList {

    public class Stack {

        private ArrayList<Integer> stack;

        public Stack() {
            stack = new ArrayList<Integer>();
        }

        public void push(int value) {
            stack.add(value);
        }

        public int pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            int lastIndex = stack.size() - 1;
            int lastValue = stack.get(lastIndex);
            stack.remove(lastIndex);
            return lastValue;
        }

        public int peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return stack.get(stack.size() - 1);
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


}
