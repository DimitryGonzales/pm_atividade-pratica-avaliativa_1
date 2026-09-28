import java.time.LocalDate;

public class OrdemServico {
    private String codigo;
    private String clienteNome;
    private String veiculoModelo;
    private String veiculoPlaca;
    private LocalDate data;
    private String status;
    private double valorEstimado;
    private Servico servico;

    public OrdemServico(String codigo, String clienteNome, String veiculoModelo, String veiculoPlaca, LocalDate data, String status, double valorEstimado, Servico servico) {
        this.setCodigo(codigo);
        this.setClienteNome(clienteNome);
        this.setVeiculoModelo(veiculoModelo);
        this.setVeiculoPlaca(veiculoPlaca);
        this.setData(data);
        this.setStatus(status);
        this.setValorEstimado(valorEstimado);
        this.setServico(servico);
    }

    public void checarStatus() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getVeiculoModelo() {
        return veiculoModelo;
    }

    public void setVeiculoModelo(String veiculoModelo) {
        this.veiculoModelo = veiculoModelo;
    }

    public String getVeiculoPlaca() {
        return veiculoPlaca;
    }

    public void setVeiculoPlaca(String veiculoPlaca) {
        this.veiculoPlaca = veiculoPlaca;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
}
