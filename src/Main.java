import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StaticStack<Integer> stack = new StaticStack<>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Elementos na pilha: " + Arrays.toString(stack.getData()));

        try {
            stack.push(60);
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Elemento removido: " + stack.pop());
        System.out.println("Elemento removido: " + stack.pop());

        System.out.println("Elementos na pilha após remoção: " + Arrays.toString(stack.getData()));

        stack.clear();
        System.out.println("Pilha após limpeza: " + Arrays.toString(stack.getData()));

        if (stack.isEmpty()) {
            System.out.println("A pilha está vazia.");
        }
    }
}
