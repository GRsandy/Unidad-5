package practica2.metodos;
//Sandy GR
public class Practica2Metodos {

    public static int suma(int numeroUno, int numeroDos) {
        return numeroUno + numeroDos;
    }

    public static int resta(int numeroUno, int numeroDos) {
        return numeroUno - numeroDos;
    }

    public static int multiplicacion(int numeroUno, int numeroDos) {
        return numeroUno * numeroDos;
    }
    
    

    public static int division(int numeroUno, int numeroDos) {
        return numeroUno / numeroDos;
    }

    public static void main(String[] args) {
        int resultadoSuma = Practica2Metodos.suma(15, 20);
        System.out.println("El resultado de la suma es: " + resultadoSuma);
        
        int resultadoResta = Practica2Metodos.resta(20, 12);
        System.out.println("El resultado de la resta es: " + resultadoResta);
        
        int resultadoMultiplicacion = Practica2Metodos.multiplicacion(12, 4);
        System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);

        int resultadoDivision = Practica2Metodos.division(88, 2);
        System.out.println("El resultado de la division es: " + resultadoDivision);
        
        System.out.println("Sandy");
    }
}

