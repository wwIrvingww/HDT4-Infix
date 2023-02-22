public class DoubleNode <T> {
        public DoubleNode back;
        public DoubleNode next;
        public T value;

        public DoubleNode(T value) {
            this.value = value;
            this.back = null;
            this.next = null;
        }
}
