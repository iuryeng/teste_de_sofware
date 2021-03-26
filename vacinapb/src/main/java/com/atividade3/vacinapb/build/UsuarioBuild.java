package com.atividade3.vacinapb.build;

import com.atividade3.vacinapb.dominio.Usuario;


public class UsuarioBuild {

   private String CPF_1 = "74190577022";
   private String DATA_NASCIMENTO_1 = "15-09-1989";

    private String CPF_2 = "84150500022";
    private String DATA_NASCIMENTO_2= "24-03-1991";

   public Usuario ConstruirUsuario1(){
       Usuario usuario1 = new Usuario();
       usuario1.setNome("Iury Anderson Fernandes Coelho");
       usuario1.setCPF(CPF_1);
       usuario1.setDataNascimento(DATA_NASCIMENTO_1);
       usuario1.setGrupoPrioritario("Faixa Etária");
       return usuario1;
   }

    public Usuario ConstruirUsuario2(){
        Usuario usuario1 = new Usuario();
        usuario1.setNome("José Italo Rocha Castro");
        usuario1.setCPF(CPF_2);
        usuario1.setDataNascimento(DATA_NASCIMENTO_2);
        usuario1.setGrupoPrioritario("Profissional da Saúde");
        return usuario1;
    }
}
