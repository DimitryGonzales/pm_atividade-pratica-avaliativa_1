import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mecanico mecanico1 = new Mecanico(
                "Alberto", "11111111111", "trocaOleo", "5531111111111");
        Mecanico mecanico2 = new Mecanico(
                "Felipe", "22222222222", "solda", "5531222222222");
        Mecanico mecanico3 = new Mecanico(
                "Pedro", "33333333333", "trocaFreio", "5531333333333");

        Box box1 = new Box(1, "trocaÓleo", 5, 1);
        Box box2 = new Box(2, "solda", 2, 2);
        Box box3 = new Box(3, "trocaFreio", 3, 3);

        ArrayList<OrdemServico> ordensServico = new ArrayList<>();

        int menuOpcao;
        do {
            System.out.println("Funcionalidades do sistema:");
            System.out.println("\t1 - Cadastrar ordem de serviço\n" +
                    "\t2 - Associar um mecânico a um box\n" +
                    "\t3 - Atribuir ordem de serviço a um box\n" +
                    "\t4 - Exibir todas as ordens atribuídas a um box específico\n" +
                    "\t5 - Informar a quantidade total de ordens finalizadas por cada box\n" +
                    "\t6 - Buscar ordens por status\n" +
                    "\t7 - Exibir os detalhes completos de uma ordem específica" +
                    "\t8 - Encerrar");
            System.out.print("\t> ");
            menuOpcao = sc.nextInt();

            switch (menuOpcao) {
                case 1:
                    System.out.println("\nCadastrar ordem de serviço:");

                    System.out.print("\tCódigo: ");
                    String ordemServicoCodigo = sc.next();

                    System.out.print("\tNome do cliente: ");
                    String ordemServicoClienteNome = sc.next();

                    System.out.print("\tModelo do veículo: ");
                    String ordemServicoVeiculoModelo = sc.next();

                    System.out.print("\tPlaca do veículo: ");
                    String ordemServicoVeiculoPlaca = sc.next();

                    System.out.print("\tValor estimado: R$");
                    double ordemServicoValorEstimado = sc.nextDouble();

                    System.out.println("\tServiço: ");

                    System.out.print("\t\tNome: ");
                    String servicoNome = sc.next();

                    System.out.print("\t\tTempo estimado(s): ");
                    int servicoTempoEstimado = sc.nextInt();

                    System.out.print("\t\tValor: R$");
                    double servicoValor = sc.nextDouble();

                    String servicoCategoria = "";
                    int servicoCategoriaOpcao;
                    do {
                        System.out.println("\t\tCategoria:");
                        System.out.println("\t\t\t1 - Troca de óleo\n" +
                                "\t\t\t2 - Solda\n" +
                                "\t\t\t3 - Troca de freio");
                        System.out.print("\t\t\t> ");
                        servicoCategoriaOpcao = sc.nextInt();

                        switch (servicoCategoriaOpcao) {
                            case 1:
                                servicoCategoria = "trocaOleo";

                                break;
                            case 2:
                                servicoCategoria = "solda";

                                break;
                            case 3:
                                servicoCategoria = "trocaFreio";

                                break;
                            default:
                                break;
                        }
                    } while (servicoCategoriaOpcao < 1 || servicoCategoriaOpcao > 3);

                    Servico servico = new Servico(servicoNome, servicoTempoEstimado, servicoValor, servicoCategoria);
                    OrdemServico ordemServico = new OrdemServico(
                            ordemServicoCodigo,
                            ordemServicoClienteNome,
                            ordemServicoVeiculoModelo,
                            ordemServicoVeiculoPlaca,
                            LocalDate.now(),
                            "aberta",
                            ordemServicoValorEstimado,
                            servico);

                    ordensServico.add(ordemServico);
            }
        } while (menuOpcao != 8);
    }
}
