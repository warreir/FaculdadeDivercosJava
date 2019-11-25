package Passado.classeSolicitada;

class Aljava {
    private int flexas;
    /**
     * @return the flexas
     */
    public int getFlexas() {
        return flexas;
    }
    /**
     * @param flexas the flexas to set
     */
    public void setFlexas(int flexas) {
        this.flexas = flexas;
    }
    Aljava(int flexas){
        this.setFlexas(flexas);
    }
    public void recarregar(){
        if(this.flexas>0){
            System.out.println("Ainda tem "+this.getFlexas()+" flexa(s) para atirar.");
        }else{
            this.setFlexas(20);
            System.out.println("Aljara recarregada.");
        }
    }

}