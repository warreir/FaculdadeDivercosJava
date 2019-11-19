package AulasJavaNovembro;

class Usuario{

    private int id;
    private String userName;
    private String psw;
    private String nome;
    // ----------------------------------- CONSTRUTOR ----------------------------------//
        Usuario(int id,String userName,String psw,String nome){
            this.id=id;
            this.userName=userName;
            this.psw=psw;
            this.nome=nome;
        }
    // ----------------------------------- FIM CONSTRUTOR ----------------------------------//
     // -----------------------------------GET SET ----------------------------------//
        public String getNome(){
            return this.nome;
        }
        public int getId() {
            return this.id;
        }
        public String getPsw() {
            return this.psw;
        }
        public String getUserName() {
            return this.userName;
        }
        /**
         * @param userName the userName to set
         */
        public void setUserName(String userName) {
            this.userName = userName;
        }/**
        * @param psw the psw to set
        */
        public void setPsw(String psw) {
            this.psw = psw;
        }/**
        * @param nome the nome to set
        */
        public void setNome(String nome) {
            this.nome = nome;
        }/**
        * @param id the id to set
        */
        public void setId(int id) {
            this.id = id;
        }
    // -----------------------------------FIM GET SET ----------------------------------//
    // ----------------------------------- FUNÇÕES ----------------------------------//
        public String toString() {
            return "Nome: "+this.getNome()+"\nLogin: "+this.getUserName()+"\nSenha: "+this.getPsw();
        }
    // ----------------------------------- FUNÇÕES ----------------------------------//
}