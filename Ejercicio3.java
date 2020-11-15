//Galindo Salinas Mat'ias Alejandro
import java.util.Scanner;

public class Ejercicio3{
    private String stringNumeroCelular;
    private float floatCredito;
    private int intLocalesNacionales;
    private int intLocalesInternacionales;
    private int intCelulares;

    private static final float COSTO_LOCALES_NACIONALES = 0.5f;
    private static final float COSTO_LOCALES_INTERNACIONALES = 0.6f;
    private static final float COSTO_CELULARES = 0.2f;

    public void setNumeroCelular(String numeroCelular){
        stringNumeroCelular = numeroCelular;
    }
    
    public void setCredito(float credito){
        floatCredito = credito;
    }

    public void leerInicio(Scanner entrada){
        System.out.println("Introduzca el n'umero de celular: ");
        setNumeroCelular(entrada.next());
        System.out.println("Introduzca el cr'edito inicial: ");
        setCredito(Float.parseFloat(entrada.next()));
        char charOpcion=' ';
        while (charOpcion!='s'){
            charOpcion = leerOpcion(entrada);
        }
    }

    public void consultarEstatus(Scanner entrada){
        System.out.println("--------------- No. Celular: " + stringNumeroCelular);
        System.out.println("--------------- Cr'edito   : " + floatCredito);
        System.out.println(" * " + intLocalesNacionales + " llamadas locales nacionales = $" + (intLocalesNacionales*COSTO_LOCALES_NACIONALES)+ ".");
        System.out.println(" * " + intLocalesInternacionales + " llamadas locales internacionales = $" + (intLocalesInternacionales*COSTO_LOCALES_INTERNACIONALES)+ ".");
        System.out.println(" * " + intCelulares + " llamadas a Celular = $" + (intCelulares*COSTO_CELULARES)+ ".");
        System.out.println("-----------------------------");
    }

    public void realizarLlamadaLocalNacional(Scanner entrada){
        System.out.println("---------------");
        if (floatCredito<COSTO_LOCALES_NACIONALES){
            System.out.println("No alcanza el credito para hacer la llamada.");
            System.out.println("---------------");
            return;
        }
        System.out.print("Realizando llamada local Nacional..... ");
        intLocalesNacionales++;
        floatCredito= floatCredito-COSTO_LOCALES_NACIONALES;
        try {
            Thread.sleep(1000);
        } catch (Exception exception){
            exception.printStackTrace();
        }
        System.out.println("ok.");
        System.out.println("---------------");
    }

    public void realizarLlamadaLocalInternacional(Scanner entrada){
        System.out.println("---------------");
        if (floatCredito<COSTO_LOCALES_INTERNACIONALES){
            System.out.println("No alcanza el credito para hacer la llamada.");
            System.out.println("---------------");
            return;
        }
        System.out.print("Realizando llamada local Internacional..... ");
        intLocalesInternacionales++;
        floatCredito= floatCredito-COSTO_LOCALES_INTERNACIONALES;
        try {
            Thread.sleep(1000);
        } catch (Exception exception){
            exception.printStackTrace();
        }
        System.out.println("ok.");
        System.out.println("---------------");
    }

    public void realizarLlamadaCelular(Scanner entrada){
        System.out.println("---------------");
        if (floatCredito<COSTO_CELULARES){
            System.out.println("No alcanza el credito para hacer la llamada.");
            System.out.println("---------------");
            return;
        }
        System.out.print("Realizando llamada a Celular ..... ");
        intCelulares++;
        floatCredito= floatCredito-COSTO_CELULARES;
        try {
            Thread.sleep(1000);
        } catch (Exception exception){
            exception.printStackTrace();
        }
        System.out.println("ok.");
        System.out.println("---------------");
    }

    public void ingresarCredito(Scanner entrada){
        System.out.println("Introduzca el cr'edito a ingresar: ");
        setCredito(floatCredito + Float.parseFloat(entrada.next()));
        System.out.print("Ingresando cr'edito ..... ");
        try {
            Thread.sleep(1000);
        } catch (Exception exception){
            exception.printStackTrace();
        }
        System.out.println("ok.");
        System.out.println("---------------");
    }

    public char leerOpcion(Scanner entrada){
        System.out.println("----- men'u:");
        System.out.println("A.- consultar estatus.");
        System.out.println("B.- realizar llamada local nacional.");
        System.out.println("C.- realizar llamada local internacional.");
        System.out.println("D.- realizar llamada a celular.");
        System.out.println("E.- ingresar cr'edito.");
        System.out.println("S.- salir.");

        char charOpcion;
        charOpcion = entrada.next().charAt(0);
        switch (charOpcion){
            //Estatus;
            case 'A':
            case 'a':
                consultarEstatus(entrada);
                break; 
            case 'B':
            case 'b':
                realizarLlamadaLocalNacional(entrada);
                break;
            case 'C':
            case 'c':
                realizarLlamadaLocalInternacional(entrada);
                break;
            case 'D':
            case 'd':
                realizarLlamadaCelular(entrada);
                break;
            case 'E':
            case 'e':
                ingresarCredito(entrada);
                break;
            case 'S':
            case 's':
                return 's';
            default :
                System.out.println("Elija una opci'on correcta, por favor.");
                return leerOpcion(entrada);
           
       }
       return charOpcion;
    }





    public static void main (String[] args){
        
        Ejercicio3 ejercicio3 = new Ejercicio3();
        Scanner entrada = new Scanner(System.in);
        try {
            ejercicio3.leerInicio(entrada);
        } catch (Exception exception){
            exception.printStackTrace();
        }

 
    }

}