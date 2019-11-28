package ExercicioUsuario;

import java.util.Objects;

// criando a classe de um usuario
public class Usuario {

    // criando o id do usuario
    private int id;
    // criando o username dele
    private String userName;
    // criando a senha do usuario
    private String password;
    // criando o nome do usario
    private String name;

    //----------------------------------------- Construtor ----------------------------------------- //
        //dizendo que pode haver um new usuario sem parametro nenhum que nao faz nada
        public Usuario() {
        }

        // criando um outro construtor que precise da passagem dos parametros
        public Usuario(int id, String userName, String password, String name) {
            this.id = id;
            this.userName = userName;
            this.password = password;
            this.name = name;
        }
    //----------------------------------------- FIM Construtor ----------------------------------------- //
    //----------------------------------------- GET E SET  ----------------------------------------- //
        public int getId() {
            return this.id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUserName() {
            return this.userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return this.password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    //----------------------------------------- FIM GET E SET  ----------------------------------------- //
    // ----------------------------------------- metodos --------------------------------------------- //
        // sobrescrevendo o metodo equals quando se passa um objeto, dizendo que ele vai ter retorno booleano (true ou false)
        @Override
        public boolean equals(Object o) {
            // se o objeto passado for um usuario e não seja igual ao atual

            // se o objeto passado for igual ao objeto chamado
            if (o == this){
                return true;
            }
            // verifica se o objeto passado Não é do tipo Usuario para retornal falso
            if (!(o instanceof Usuario)) {
                return false;
            }
            //instancia um novo usuario com base no objeto passado
            Usuario usuario = (Usuario) o;
            
            //retorna o id do usuario criado
            return id == usuario.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, userName, password, name);
        }

        @Override
        public String toString() {
            return "{" +
                " id='" + getId() + "'" +
                ", userName='" + getUserName() + "'" +
                ", password='" + getPassword() + "'" +
                ", name='" + getName() + "'" +
                "}";
        }
    // ----------------------------------------- fim metodos --------------------------------------------- //
}