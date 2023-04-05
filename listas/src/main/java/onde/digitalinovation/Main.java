package onde.digitalinovation;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Pegeot"));

        System.out.println(listaCarros.contains(new Carro("Ford")));

        System.out.println(listaCarros.get(2));

        System.out.println(listaCarros.indexOf(new Carro("Fiat")));

        System.out.println(listaCarros.remove(2));

        System.out.println(listaCarros);


    }
}
