//Galindo Salinas Mat'ias Alejandro
import java.util.Scanner;
import java.util.Calendar;
import java.util.Locale;
import java.util.Date;

public class Ejercicio1{

    private String strNombre;
    private String strPaterno;
    private String strMaterno;
    private int intAno;
    private int intMes;
    private int intDia;

    public void setNombre(String nombre){
        strNombre = nombre;
    }    

    public void setPaterno(String paterno){
        strPaterno = paterno;
    }    

    public void setMaterno(String materno){
        strMaterno = materno;
    }    

    public void setAno(int ano){
        intAno = ano;
    }

    public void setMes(int mes){
        intMes = mes;
    }

    public void setDia(int dia){
        intDia = dia;
    }

    public void leerDatos(Scanner entrada){
        System.out.println("------- Introduzca los datos de la persona:");
        System.out.print("Nombre : ");
        setNombre (entrada.next());
        System.out.print("Ap. Paterno : ");
        setPaterno (entrada.next());
        System.out.print("Ap. Materno : ");
        setMaterno (entrada.next());
        System.out.print("Ano de Nacimiento (yyyy): ");
        setAno (Integer.parseInt(entrada.next()));
        System.out.print("Mes de Nacimiento (mm)  : ");
        setMes (Integer.parseInt(entrada.next()));
        System.out.print("Dia de Nacimiento (dd)  : ");
        setDia (Integer.parseInt(entrada.next()));
/*
        System.out.println("------- Datos leidos:");
        System.out.println("Nombre: "+strNombre);
        System.out.println("Paterno: "+strPaterno);
        System.out.println("Materno: "+strMaterno);
        System.out.println("Ano: "+intAno);
        System.out.println("Mes: "+intMes);
        System.out.println("Dia: "+intDia);
*/
        calcularEdad();
    }

    public void calcularEdad(){
        Calendar calendarNacimiento = Calendar.getInstance();
        Calendar calendarHoy = Calendar.getInstance();
        int intEdad;
        calendarNacimiento.set(intAno, intMes-1, intDia,0,0);
//        calendarHoy.set(2020, 4-1, 21,0,0);
        intEdad = calendarHoy.get(Calendar.YEAR) - calendarNacimiento.get(Calendar.YEAR);
        if (calendarNacimiento.get(Calendar.MONTH)>calendarHoy.get(Calendar.MONTH) ||
            (calendarNacimiento.get(Calendar.MONTH)==calendarHoy.get(Calendar.MONTH) && calendarNacimiento.get(Calendar.DATE)>calendarHoy.get(Calendar.DATE))
        ) {
            intEdad--;
        }

        System.out.println("La Edad de la Persona es: "+ intEdad);

    }

    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.leerDatos(entrada);

    }

}