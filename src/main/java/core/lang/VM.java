package core.lang;

@SuppressWarnings("all")
public class VM {

    private final int MAX_STACK_SIZE = 100;
    private final int MAX_HEAP_SIZE = 100;

    private final int stackPointer = 0;
    private final int heapPointer = 0;

    private final int[] stack = new int[MAX_STACK_SIZE];
    private final int[] heap = new int[MAX_HEAP_SIZE];
    private final int[] code = new int[MAX_HEAP_SIZE];
    private final int[] data = new int[MAX_HEAP_SIZE];
    private final int[] codePointer = new int[MAX_HEAP_SIZE];
    private final int[] dataPointer = new int[MAX_HEAP_SIZE];

    public VM() {
        for (int i = 0; i < MAX_STACK_SIZE; i++) {
            stack[i] = 0;
        }
        for (int i = 0; i < MAX_HEAP_SIZE; i++) {
            heap[i] = 0;
            code[i] = 0;
            data[i] = 0;
            codePointer[i] = 0;
            dataPointer[i] = 0;
        }
    }

    public void run() {

    }

}
