import java.util.ArrayList;
import java.util.List;

public class LavaCar {
    private List<Cliente> clientes;
    private List<Servico> servicos;
    private List<RegistroServico> registros;

    public LavaCar() {
        this.clientes = new ArrayList<>();
        this.servicos = new ArrayList<>();
        this.registros = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public void registrarServico(Cliente cliente, Servico servico) {
        RegistroServico registro = new RegistroServico(cliente, servico);
        registros.add(registro);
    }

    public List<RegistroServico> getHistoricoServicos() {
        return registros;
    }

    public static void main(String[] args) {
        LavaCar lavaCar = new LavaCar();

        Cliente cliente1 = new Cliente("Davi");
        Cliente cliente2 = new Cliente("Kwon");

        lavaCar.adicionarCliente(cliente1);
        lavaCar.adicionarCliente(cliente2);

        Servico servico1 = new Servico("Lavagem Simples", 20.0);
        Servico servico2 = new Servico("Lavagem Completa", 50.0);

        lavaCar.adicionarServico(servico1);
        lavaCar.adicionarServico(servico2);

        lavaCar.registrarServico(cliente1, servico1);
        lavaCar.registrarServico(cliente2, servico2);

        for (RegistroServico registro : lavaCar.getHistoricoServicos()) {
            System.out.println(registro);
        }
    }
}
