public class RegistroServico {
    private Cliente cliente;
    private Servico servico;


    public RegistroServico(Cliente cliente, Servico servico) {
        this.cliente = cliente;
        this.servico = servico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servico getServico() {
        return servico;
    }


    @Override
    public String toString() {
        return "Registro: " + cliente.getNome() + ", " + servico.getDescricao() + ", Preco: " + servico.getPreco();
    }
}