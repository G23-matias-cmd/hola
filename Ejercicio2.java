//Galindo Salinas Mat'ias Alejandro
import java.util.Scanner;

public class Ejercicio2{
    int intRadio;
    int intBase;
    int intAltura;
    int intLado;

    public void setRadio(int radio){
        intRadio = radio;
    }

    public void setBase(int base){
        intBase = base;
    }

    public void setAltura(int altura){
        intAltura = altura;
    }

    public void setLado(int lado){
        intLado = lado;
    }

    public void imprimirResultado(float floatPerimetro, float floatArea){
        System.out.println("Per'imetro: " + floatPerimetro);
        System.out.println("'Area: " + floatArea);
    }

    public void leerCirculo(Scanner entrada){
        System.out.println("introduzca el radio: ");
        setRadio(Integer.parseInt(entrada.next()));
        float floatPerimetro = (float) (2 * 3.1416 * intRadio);
        float floatArea = (float) (3.1416 * intRadio * intRadio) ;
        imprimirResultado(floatPerimetro, floatArea);
    }

    public void leerRectangulo(Scanner entrada){
        System.out.println("introduzca la base");
        setBase(Integer.parseInt(entrada.next()));
        System.out.println("introduzca la altura");
        setAltura(Integer.parseInt(entrada.next()));
        float floatPerimetro = (float) (2 * intBase + 2 * intAltura) ;
        float floatArea = (float) (intBase * intAltura);
        imprimirResultado(floatPerimetro, floatArea);
    }

    public void leerCuadrado(Scanner entrada){
        System.out.println("introduzca el lado: ");
        setLado(Integer.parseInt(entrada.next()));
        float floatPerimetro = (float) (intLado + intLado + intLado + intLado);
        float floatArea = (float) (intLado * intLado) ;
        imprimirResultado(floatPerimetro, floatArea);
    }

    public void leerTriangulo(Scanner entrada){
        System.out.println("introduzca el lado");
        setLado(Integer.parseInt(entrada.next()));
        float floatPerimetro = (float) (3 * intLado ) ;
        float floatArea = (float) (intLado * intLado * 0.4330127);
        imprimirResultado(floatPerimetro, floatArea);
    }

    public char leerFigura(Scanner entrada){
        char charOpcion;
        System.out.println("Elija una figura: ");
        System.out.println("A.- Circulo");
        System.out.println("B.- Rect'angulo");
        System.out.println("C.- Cuadrado");
        System.out.println("D.- Tri'angulo Equilatero");
        charOpcion = entrada.next().charAt(0);
        switch (charOpcion){
            //Circulo;
            case 'A':
            case 'a':
                leerCirculo(entrada);
                break; 
            case 'B':
            case 'b':
                leerRectangulo(entrada);
                break;
            case 'C':
            case 'c':
                leerCuadrado(entrada);
                break;
            case 'D':
            case 'd':
                leerTriangulo(entrada);
                break;
            default :
                System.out.println("Elija una opci'on correcta, por favor.");
                return leerFigura(entrada);
           
       }
       return charOpcion;
    }

    public static void main (String[] args){
        
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Scanner entrada = new Scanner(System.in);
        ejercicio2.leerFigura(entrada);
 
    }

}