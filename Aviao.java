package checkPointPoo_II;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aviao extends MeioDeTransporte implements Funcao {

    private int quantPassageiros;

    //**************ArrayList**********************
    private List<CiaAerea> listaCias;

    public Aviao(int quantPassageiros, int distancia) {
        super.setTipoTransporte("AirBus");
        this.quantPassageiros = quantPassageiros;
        super.setDistanciaViagem(distancia);
        listaCias = new ArrayList<>();
    }

    public int getQuantPassageiros() {
        return quantPassageiros;
    }

    //****************************Adicionar Cia Aérea**************************
    public void addCiaAerea(CiaAerea ciaA){
        listaCias.add(ciaA);
    }

    public List<CiaAerea> getListaCias() {
        return listaCias;
    }

    //***************Informações sobre tarifas***************
    public void infoTarifas() {
        Collections.sort(listaCias);

        for (CiaAerea ciaAerea : listaCias) {
            if (ciaAerea.getTarifa().equals("light")) {
                if (super.getDistanciaViagem() <= 2000) {
                    ciaAerea.setValorBilhete(500.00);
                } else {
                    ciaAerea.setValorBilhete(700.00);
                }
                System.out.println("A taxa de remarcação da " + ciaAerea.getNome() + " na tarifa " + ciaAerea.getTarifa() + " não disponibiliza remarcação.");
                System.out.println("Valor do bilhete: R$" + ciaAerea.getValorBilhete());
                System.out.println("_____________________________________________________________");
                System.out.println(" ");
            }
            else if (ciaAerea.getTarifa().equals("plus")) {
                if (super.getDistanciaViagem() <= 2000) {
                    ciaAerea.setValorBilhete(750.00);
                } else {
                    ciaAerea.setValorBilhete(970.00);
                }
                System.out.println("A taxa de remarcação da " + ciaAerea.getNome() + " na tarifa " + ciaAerea.getTarifa() + " tem desconto de 30% do valor do bilhete.");
                System.out.println("Valor do bilhete: R$" + ciaAerea.getValorBilhete());
                System.out.println("Valor da remarcação: R$" + ciaAerea.getValorBilhete() * 0.7);
                System.out.println("_____________________________________________________________");
                System.out.println(" ");
            }
            else if (ciaAerea.getTarifa().equals("top")) {
                if (super.getDistanciaViagem() <= 2000) {
                    ciaAerea.setValorBilhete(800.00);
                } else {
                    ciaAerea.setValorBilhete(1300.00);
                }
                System.out.println("A taxa de remarcação da " + ciaAerea.getNome() + " na tarifa " + ciaAerea.getTarifa() + " tem desconto de 60% do valor do bilhete.");
                System.out.println("Valor do bilhete: R$" + ciaAerea.getValorBilhete());
                System.out.println("Valor da remarcação: R$" + ciaAerea.getValorBilhete() * 0.6);
                System.out.println("_____________________________________________________________");
                System.out.println(" ");
            }
        }
    }

    //Método da interface Funcão com as condições para validar a viagem
    // de Avião e o tratamento de Exceções em caso de viagem não permitida.
    @Override
    public void levarPassageiro() throws Exception {

        if (getQuantPassageiros() <=585 && getQuantPassageiros() > 50){
            System.out.println("Viagem ideal para avião");
        }
        else if(getQuantPassageiros() > 585){
            throw new RuntimeException("A quantidade de passageiros ultrapassa o limite permitido");
        }

        else if(getQuantPassageiros() < 50 && getQuantPassageiros() > 5){
            throw new RuntimeException("A viagem não é recomendada para Avião, a melhor opção é ir de Onibus");
        }
        else {
            throw new RuntimeException("Melhor é ir de carro ");
        }
    }
}
