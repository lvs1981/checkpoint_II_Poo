package checkPointPoo_II;

public class CiaAerea implements Comparable<CiaAerea>{
    private String nome;
    private String tarifa;
    private double valorBilhete;
    public CiaAerea(String nome, String tarifa) {
        this.nome = nome;
        this.tarifa = tarifa;

    }


    public String getTarifa() {
        return tarifa;
    }

    public void setValorBilhete(double valorBilhete) {
        this.valorBilhete = valorBilhete;
    }

    public double getValorBilhete() {
        return valorBilhete;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(CiaAerea cia) {
        if(cia.valorBilhete == this.valorBilhete) {
            return 0;
        }
        if(cia.valorBilhete < this.valorBilhete){
            return 1;
        }
        return  -1;
    }
}
