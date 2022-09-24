package checkPointPoo_II;

import checkPointPoo_II.Aviao;
import checkPointPoo_II.CiaAerea;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CiaAerea c1 = new CiaAerea("Latam","light");
        CiaAerea c2 = new CiaAerea("Gol","light");
        CiaAerea c3 = new CiaAerea("Air France","plus");
        CiaAerea c4 = new CiaAerea("American Airlines","top");

        //Solicitando informações para o usuário
        Scanner veiculo = new Scanner(System.in);
        int numPassageiros;
        int distancia;

        System.out.println("Digite a quantidade de passageiros:");
        numPassageiros = veiculo.nextInt();

        System.out.println("Digite a distancia da viagem em KM:");
        distancia = veiculo.nextInt();

        Aviao aviao1 = new Aviao(numPassageiros, distancia);

            //chamando a Exception em caso de viagem não permitida
            System.out.println(" ");
            Collections.addAll(aviao1.getListaCias(), c1, c2, c3, c4);
            aviao1.infoTarifas();

            try {
                aviao1.levarPassageiro();
            }catch (Exception erro){
                System.err.println(erro);
            }

            //Exibindo informações sobre a viagem solicitada
            System.out.println("Tipo do Avião:" + aviao1.getTipoTransporte());
            System.out.println("Total de passageiros: " + aviao1.getQuantPassageiros());
            System.out.println("Distancia: " + aviao1.getDistanciaViagem() + " Km");
            System.out.println(" ");
    }
}
