package classe.equalshashcode;

import java.util.Objects;

public class Usuario {
    String nome;
    String email;

    public boolean equals(Object objeto) {
        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;
            boolean emailIgual = outro.email.equals(this.email);
            boolean nomeIgual = outro.nome.equals(this.nome);
            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }
// gerado automaticamento pelo intelliJ
   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return nome.equals(usuario.nome) && email.equals(usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }*/
}
