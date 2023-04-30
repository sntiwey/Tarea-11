import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caja<String> miCaja = new Caja<>(new String[10]);

        miCaja.add(0, "McClovin");
        miCaja.add(1, "adios");
        miCaja.add(2, "McClovinnnn");
        System.out.println(miCaja);

        String temp = miCaja.get(0);

        System.out.println("----SIN GENERICOS----");
        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0, "Hellow");
        cajaSin.add(1, "No lo se ");
        cajaSin.add(2, "WIII");
        System.out.println(cajaSin);

        String temp2 = (String)cajaSin.get(0);

        System.out.println("----COMIDA----");

        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("Ramen", true));
        System.out.println(cajaComida.get(0));
        System.out.println("----------");

        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Platano", false));
        comidas.add(new Comida("Platano", false));
        comidas.add(new Comida("Platano", false));
        comidas.add(new Comida("Platano", false));
        comidas.add(new Comida("Pescado", false));
        comidas.add(new Comida("Platano", false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(5));

        ArrayList<Comida> comida2 = new ArrayList<>();
        comida2.add(new Comida("Pepino", false));
        comida2.add(new Comida("Huarache", true));
        comida2.add(new Comida("Lasaña", true));
        comida2.add(new Comida("Biteck", false));
        comida2.add(new Comida("Melon", false));

        System.out.println(comida2.get(3));
        comida2.set(3, new Comida("Pera", false));
        comida2.add(3, new Comida("Naranja", false));

        System.out.println("El final es this");
        for (Comida comida : comida2) {
            System.out.println(comida);
            
        }
    }
}