package onde.digitalinovation;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Pegeout")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault"))); //se não conseguir adicionar ele retorna false.
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); //pega o objeto da fila mas não remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); //pega o objeto da fila e remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty()); //verifica se a fila está vazia
        System.out.println(queueCarros);

    }
}
