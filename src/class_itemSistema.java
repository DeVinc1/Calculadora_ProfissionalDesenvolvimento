public class class_itemSistema {
    
    private String projetoPai;
    private String nomeComponente;
    private String tipoComponente;
    private int dificuldade;
    private int horasGastas;
    /*
     * fatorHora se refere à quantidade de horas utilizadas para
     * desenvolver o componente de dificuldade 1 (ele varia conforme o tipo).
     */
    private int fatorHora;
    /*
     * horasTotaisGastas refere-se às horas que serão gastas para
     * desenvolver todos os componentes do projeto
     */
    private int horasTotaisGastas;

    /*
     * Métodos da classe itemJava
     */

    public void encontrarFatorHora(){
        switch (tipoComponente) {
            case "a":
                fatorHora = 8;
                break;
            case "b":
                fatorHora = 4;
                break;
            case "c":
                fatorHora = 16;
                break;
            case "d":
                fatorHora = 32;
                break;
            default:
                System.out.println("Valor informado não identificado. \nValor padrão atribuído (fatorHora = 8)");
                fatorHora = 8;
                break;
        }
    }

    public void calculaHorasGastas(){
        switch (dificuldade) {
            case 1:
                horasGastas = fatorHora;                
                break;
            case 2:
                horasGastas = (int) (fatorHora * 1.5);                
                break;
            case 3:
                horasGastas = fatorHora * 2;                
                break;
            default:
                System.out.println("Nível de dificuldade não identificado. \nValor padrão atribuído (horasGastas = fatorHora).");
                horasGastas = fatorHora;
                break;
        }

        horasTotaisGastas += horasGastas;
    }

    /* Getters */
    public String getProjetoPai() {
        return projetoPai;
    }
    public String getNomeComponente() {
        return nomeComponente;
    }
    public String getTipoComponente() {
        return tipoComponente;
    }
    public int getDificuldade() {
        return dificuldade;
    }
    public int getHorasGastas() {
        return horasGastas;
    }
    public int getFatorHora() {
        return fatorHora;
    }
    public int getHorasTotaisGastas() {
        return horasTotaisGastas;
    }

    /* Setters */
    public void setProjetoPai(String projetoPai) {
        this.projetoPai = projetoPai;
    }
    public void setNomeComponente(String nomeComponente) {
        this.nomeComponente = nomeComponente;
    }
    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }
    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
    
}
