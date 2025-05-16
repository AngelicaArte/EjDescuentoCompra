import java.util.Scanner;
//Importar Scanner
//Esto nos permite leer datos del usuario.

//Creo una clase y el método main
public class DescuentoCompra {
    public static void main(String[] args) {
//Creo el objeto Scanner (new)
        Scanner scanner = new Scanner(System.in);

        System.out.println("********************************");
//Pedir el valor de la compra al usuario
        System.out.println("Ingrese el valor de la compra: ");
//nextDouble() es un método que lee lo que el usuario escribe
// y lo convierte en un valor decimal de tipo double.
//y scanner.nextDouble(): Lee un número decimal (como 120.50) desde el teclado.
        double valorCompra = scanner.nextDouble(); // Leer un número decimal

// Condición para aplicar el descuento
    if(valorCompra >= 100){
        double descuento = valorCompra * 0.10; // 10% de descuento
        double nuevoValor = valorCompra - descuento;  // Valor con descuento

        System.out.println("¡Descuento 10% aplicado!");
        System.out.println("Nuevo valor: $" + nuevoValor);
    } else {
        System.out.println("Descuento no aplicado, el valor total es: $ " + valorCompra);
    }
// Cerramos el scanner
    scanner.close();
    }
}
