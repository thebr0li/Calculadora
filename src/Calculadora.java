import java.util.Scanner;

public class Calculadora {
    private final Scanner sc = new Scanner(System.in);
    private float number1;
    private float number2;

    public Calculadora() {
        this.number1 = 0;
        this.number2 = 0;
    }
    private float suma(){
        return this.number1 + this.number2;
    }

    private float resta(){
        return this.number1 - this.number2;
    }

    private float multiplicacion(){
        return this.number1 * this.number2;
    }

    private float division(){
        if (this.number2 == 0) {
            return 0;
        }
        return this.number1 / this.number2;
    }

    public void run(){

        System.out.println("Ingrese numero 1");
        this.number1 = this.sc.nextFloat();

        System.out.println("Ingrese numero 2");
        this.number2 = this.sc.nextFloat();

        float resultado = 0;

        int operacion = 0;

        do {
            System.out.println("¿Que operación quieres realizar?");
            System.out.println(" 1- sumar\n 2- restar\n 3- multiplicar\n 4- dividir");
            operacion = this.sc.nextInt();
            switch (operacion) {
                case 1 -> resultado = this.suma();
                case 2 -> resultado = this.resta();
                case 3 -> resultado = this.multiplicacion();
                case 4 -> resultado = this.division();
                default -> System.out.println("¿que pija hiciste?");
            }
        } while (operacion >= 5 || operacion <= 0);
        System.out.println("El resultado es: " + resultado);
    }
}
