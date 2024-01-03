import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

            try {
                System.out.println("" + operacao(n1, n2));
            } catch (IllegalArgumentException a){
                System.out.println("Houve um erro ao executar a operação: " + a);
            }
    }
    public static int operacao(int n1, int n2){
            int result;
            if (n2 == 0) {
                throw new IllegalArgumentException("o valor não pode ser dividido por 0.");
            } else {
                result = n1/n2;
            }
            return result;
    }
}
