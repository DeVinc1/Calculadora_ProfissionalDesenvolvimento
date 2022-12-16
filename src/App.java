import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        /*
         * Declarando objetos
         */
        MySQL_manipulacao integracaoSQL = new MySQL_manipulacao();
        class_desenvolvedor profissional = new class_desenvolvedor();
        class_itemSistema componentesSistema = new class_itemSistema();
        class_orcamento orcamentoProjeto = new class_orcamento();
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------- CALCULADORA DE PROJETOS ----------------------- \n");

        /*
         * Obtendo dados do programador
         */
        System.out.println("Qual seu nome, programador?");
        profissional.setNome(input.nextLine());

        System.out.println("\nQuantas horas por hora você tem disponíveis para trabalhar? ");
        profissional.setHorasDisponiveisDia(input.nextInt());

        System.out.print("\nQual sua pretensão salarial por mês? \nR$");
        profissional.setValorMensalDesejado(input.nextDouble());

        System.out.println("\nSeu valor hora será de R$" + profissional.calcularValorHora()
                + ", trabalhando " + profissional.calcularHorasTrabalhadas() + " horas por mês");

        /*
         * Obtendo dados do projeto
         */
        System.out.println("\nQual será o nome do projeto que você irá trabalhar?");
        input.nextLine(); // Consumir quebra de linha (\n) do scanner anterior
        componentesSistema.setProjetoPai(input.nextLine());

        /*
         * Criando a tabela SQL com o orçamento + nome do projeto
         */
        integracaoSQL.criarTabela(componentesSistema);

        /*
         * Loop para obter os itens do sistema desenvolvido no projeto.
         */
        System.out.println("\nQuantos componentes o sistema terá?");
        int numComponentes = input.nextInt();

        for (int i = 0; i < numComponentes; i++) {

            input.nextLine(); // Consumir quebra de linha (\n) do scanner anterior
            System.out.println("\nQual o nome do componente que você irá trabalhar? ");
            componentesSistema.setNomeComponente(input.nextLine());

            System.out.println("\nEm qual das seguintes categoria o componente se enquadra? \n"
                    + "     a. Telas com entradas e saídas de dados; \n"
                    + "     b. Telas de consultas com informação de dados; \n"
                    + "     c. Gravação de dados; \n"
                    + "     d. Algoritmos com processamentos;");
            componentesSistema.setTipoComponente(input.nextLine());
            componentesSistema.encontrarFatorHora();

            System.out.println("\nQual o nível de de dificuldade do componente que você está trabalhando (de 1 a 3)?");
            componentesSistema.setDificuldade(input.nextInt());

            componentesSistema.calculaHorasGastas();
            System.out.println("\nVocê irá gastar " + componentesSistema.getHorasGastas() + " horas nesse componente, "
                    + "custando R$" + (componentesSistema.getHorasGastas() * profissional.calcularValorHora()));

            System.out.println("Adicionando itens a tabela SQL orçamentária do projeto...");
            integracaoSQL.cadastrarItem(componentesSistema, profissional);
            System.out.println("Adição realizada com sucesso. \n");
        }
        input.close();

        /* Adicionando os atributos a classe do orçamento do projeto */
        orcamentoProjeto.setDadosProjeto(componentesSistema.getProjetoPai());
        orcamentoProjeto.setDadosDesenvolvedor(profissional.getNome());
        orcamentoProjeto.setHorasGastasNoProjeto(componentesSistema.getHorasTotaisGastas());
        orcamentoProjeto.setCustoTotalDoProjeto(
                ((componentesSistema.getHorasTotaisGastas() * profissional.calcularValorHora()) * 1.3));

        System.out.println(orcamentoProjeto.getDadosDesenvolvedor() + ", você irá trabalhar "
                + orcamentoProjeto.getHorasGastasNoProjeto() + " horas no projeto " + orcamentoProjeto.getDadosProjeto()
                + ", custando um total de R$" + orcamentoProjeto.getCustoTotalDoProjeto());
    }
}
