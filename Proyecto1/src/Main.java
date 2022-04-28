
public class Main {
    public static void main(String[] args) {

        int resultado = suma(6,7,9);
        System.out.println(resultado);

        resultado = suma(3,1,-6);
        System.out.println(resultado);

        resultado = suma(1,9,15);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        System.out.println("Mi coche tiene "+ miCoche.puertas+ " puerta/s.");
    }

    public static int suma(int a, int b, int c)
    {
        int res = a+b+c;
        return res;
    }
}

class Coche{
    public int puertas =0;
    public void IncrementarPuertas(){
        this.puertas++;

    }

}