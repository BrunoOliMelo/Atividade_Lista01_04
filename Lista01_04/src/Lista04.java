import java.util.Scanner;

public class Lista04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.print("Digite a nota do primeiro bimestre: ");
        nota1 = entrada.nextDouble();

        System.out.print("Digite a nota do segundo bimestre: ");
        nota2 = entrada.nextDouble();

        System.out.print("Digite a nota do terceiro bimestre: ");
        nota3 = entrada.nextDouble();

        System.out.print("Digite a nota do quarto bimestre: ");
        nota4 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média final é: " + media);
        entrada.close();
    }
}
