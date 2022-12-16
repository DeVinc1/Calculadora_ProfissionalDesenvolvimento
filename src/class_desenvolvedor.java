public class class_desenvolvedor {
    
    private String nome;
    private int horasDisponiveisDia;
    private int horasTrabalhadasPorMes;
    private double valorMensalDesejado;

    public double calcularValorHora(){
        return valorMensalDesejado / (20 * horasDisponiveisDia);
    }

    public int calcularHorasTrabalhadas(){
        /* 
         * Retorna arredondamento para cima à medida que somente horas trabalhadas completas
         * são levadas em consideração no cálculo salarial.
         */
        return (int) Math.ceil(valorMensalDesejado / calcularValorHora());
    }

    /* Getters */
    public String getNome() {
        return nome;
    }
    public int getHorasDisponiveisDia() {
        return horasDisponiveisDia;
    }
    public int getHorasTrabalhadasPorMes() {
        return horasTrabalhadasPorMes;
    }
    public double getValorMensalDesejado() {
        return valorMensalDesejado;
    }
    
    /* Setters */
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setHorasDisponiveisDia(int horasDisponiveisDia) {
        this.horasDisponiveisDia = horasDisponiveisDia;
    }
    public void setHorasTrabalhadasPorMes(int horasTrabalhadasPorMes) {
        this.horasTrabalhadasPorMes = horasTrabalhadasPorMes;
    }
    public void setValorMensalDesejado(double valorMensalDesejado) {
        this.valorMensalDesejado = valorMensalDesejado;
    }



}
