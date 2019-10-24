package classeSolicitada;

class Arco{
    private String dono;
    private float nivelUtilidade;
    private int flexasAtiradas;
    private boolean mira;
    private boolean carregado;
    private int acertos;
    /**
     * @return the mira
     */
    public boolean getMira() {
        return mira;
    }
    /**
     * @return the carregado
     */
    public boolean getCarregado() {
        return carregado;
    }
     /**
     * @return the acertos
     */
    public int getAcertos() {
        return acertos;
    }
    /**
     * @return the dono
     */
    public String getDono() {
        return dono;
    }
    /**
     * @return the flexasAtiradas
     */
    public int getFlexasAtiradas() {
        return flexasAtiradas;
    }
    /**
     * @return the nivelUtilidade
     */
    public float getNivelUtilidade() {
        return nivelUtilidade;
    }
    /**
     * @param mira the mira to set
     */
    public void setMira(boolean mira) {
        this.mira = mira;
    }

    /**
     * @param carregado the carregado to set
     */
    public void setCarregado(boolean carregado) {
        this.carregado = carregado;
    }
    /**
     * @param acertos the acerto to set
     */
    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }
    /**
     * @param dono the dono to set
     */
    public void setDono(String dono) {
        this.dono = dono;
    }
    /**
     * @param flexasAtiradas the flexasAtiradas to set
     */
    public void setFlexasAtiradas(int flexasAtiradas) {
        this.flexasAtiradas = flexasAtiradas;
    }
    /**
     * @param nivelUtilidade the nivelUtilidade to set
     */
    public void setNivelUtilidade(float nivelUtilidade) {
        this.nivelUtilidade = nivelUtilidade;
    }
    Arco(String dono){
        this.setFlexasAtiradas(0);
        this.setDono(dono);
        this.setMira(false);
        this.setCarregado(false);
        this.setNivelUtilidade(100);
        this.setAcertos(0);
    }
    Aljava aljava = new Aljava(20);

    public void carregarFlexa(){
        if(this.getCarregado()){
            System.out.println("Já carregado;");
        }else{
            if(this.getNivelUtilidade()>0){
                //ira carregar um flexa caso a aljava tenha uma flexa
                if(aljava.getFlexas()>0){
                    this.setCarregado(true);
                    System.out.println("Arco carregado.");
                    //descontará uma flexa da aljava
                    aljava.setFlexas(aljava.getFlexas()-1);
                }else{
                    System.out.println("Sem flexas, favor recarregar aljava.");
                }
            }else{
                System.out.println("Arco Estragado!");
            }
        }
    }
    public void mirar(){
        if(this.getCarregado()){
            if(!this.getMira()){
                this.setMira(true);
                this.setNivelUtilidade(this.getNivelUtilidade()-1);
                System.out.println("Mirado!");
            }else{
                System.out.println("Já mirou!");
            }
        }else{
            System.out.println("Favor carregar para mirar;");
        }
    }
    public void tirarMira(){
        if(this.getMira()){
            this.setMira(false);
        }else{
            System.out.println("Não está mirando!");
        }
    }
    public void atirarFlexa(){
        
        if(getMira()){
            this.setFlexasAtiradas(this.getFlexasAtiradas()+1);
            this.setNivelUtilidade(this.getNivelUtilidade()-2);
            if(this.getNivelUtilidade()>50){
                // Ira ter de mirar antes de atirar a flexa
                System.out.println("Flexa atirada, alvo atingido.");
                this.setAcertos(this.getAcertos()+1);
            }else{
                //caso a utilidade do arco esteja menor ue 50 ele pode erras mesmo se mirar
                System.out.println("Número aleatório:" + Math.random ());
            }
        }else if(this.getCarregado()){
            this.setFlexasAtiradas(this.getFlexasAtiradas()+1);
            this.setNivelUtilidade(this.getNivelUtilidade()-2);
            System.out.println("Flexa atirada, alvo não atingido; Experimente mirar na próxima.");
        }else{
            System.out.println("Favor carregar!");
        }
        this.setMira(false);
        this.setCarregado(false);
    }
    public void arrumarArco(){
        if(!this.getCarregado()){
            if(this.getNivelUtilidade()==100){
                System.out.println("Está em ótimo estado!");
            }else{
                this.setNivelUtilidade(100);
            }
        }else{
            System.out.println("Está carregado! Favor, mirar e atirar.");
        }
        
    }
    public void status(){
        System.out.println("-------------- Status ---------------");
        System.out.println("Caro "+this.getDono()+" seu status é:");
        System.out.println("Acertou: "+this.getAcertos()+" de "+this.getFlexasAtiradas()+" flexas atiradas");
        System.out.println("Possui "+aljava.getFlexas()+" flexas: ");
        System.out.println("A utilidado do arco esta em "+this.getNivelUtilidade()+"%");
        System.out.println("-------------- ------ ---------------");
        if(this.getCarregado()){
            System.out.println("Arco está carregado!");
        }
    }
}