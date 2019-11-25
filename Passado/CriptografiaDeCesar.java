package Passado;
class CriptografiaDeCesar{
    private String criptografado, inicial;
    CriptografiaDeCesar(String texto, int chave) {
        this.inicial = texto;
        int i, n = texto.length();
        String saux = "";
        for (i=0; i<n; i++) {
            saux = saux + (char)(texto.charAt(i) + chave);
        }
        this.criptografado = saux.replace("#", " ");
    }
    /**
     * @return the inicial
     */
    public String getInicial() {
        return inicial;
    }
    /**
     * @return the criptografado
     */
    public String getCriptografado() {
        return criptografado;
    }
}