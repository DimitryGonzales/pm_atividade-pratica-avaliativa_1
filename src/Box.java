import java.util.ArrayList;

public class Box {
    private int numero;
    private String servicoTipo;
    private int capacidadeMaxima;
    private int localizacao;
    private ArrayList<OrdemServico> ordensServico;

    public Box(int numero, String servicoTipo, int capacidadeMaxima, int localizacao) {
        this.setNumero(numero);
        this.setServicoTipo(servicoTipo);
        this.setCapacidadeMaxima(capacidadeMaxima);
        this.setLocalizacao(localizacao);
        this.ordensServico = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getServicoTipo() {
        return servicoTipo;
    }

    public void setServicoTipo(String servicoTipo) {
        this.servicoTipo = servicoTipo;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }

    public ArrayList<OrdemServico> getOrdensServico() {
        return ordensServico;
    }

    public void setOrdensServico(ArrayList<OrdemServico> ordensServico) {
        this.ordensServico = ordensServico;
    }
}
