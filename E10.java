import java.util.Scanner;
public class E10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cv;
        double watios;
        System.out.print("Teclee los CV: ");
        cv=leer.nextInt();
        watios=cv*0.735499;
        System.out.print("Equivalen a  "+ watios + " kw");
    }
}