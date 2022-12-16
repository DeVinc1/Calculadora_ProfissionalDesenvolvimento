public class class_orcamento {
    
    private String dadosProjeto;
    private String dadosDesenvolvedor;
    private int horasGastasNoProjeto;
    private double custoTotalDoProjeto;

    /* Getters */
    public String getDadosProjeto() {
        return dadosProjeto;
    }
    public String getDadosDesenvolvedor() {
        return dadosDesenvolvedor;
    }
    public int getHorasGastasNoProjeto() {
        return horasGastasNoProjeto;
    }
    public double getCustoTotalDoProjeto() {
        return custoTotalDoProjeto;
    }

    /* Setters */
    public void setDadosProjeto(String dadosProjeto) {
        this.dadosProjeto = dadosProjeto;
    }
    public void setDadosDesenvolvedor(String dadosDesenvolvedor) {
        this.dadosDesenvolvedor = dadosDesenvolvedor;
    }
    public void setHorasGastasNoProjeto(int horasGastasNoProjeto) {
        this.horasGastasNoProjeto = horasGastasNoProjeto;
    }
    public void setCustoTotalDoProjeto(double custoTotalDoProjeto) {
        this.custoTotalDoProjeto = custoTotalDoProjeto;
    }
}
