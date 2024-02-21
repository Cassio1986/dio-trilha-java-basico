public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int x = 0; x <=10; x++)
        {
            if (x % 2 != 0)
            continue;
            System.out.println("Numeros pares: " + x);
        }
    }
}
