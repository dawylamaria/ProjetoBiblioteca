package br.edu.fescfafic.biblioteca.Model;

public class Bibliotecaria extends Colaboradores {

    public String crb;

    public Bibliotecaria(String nome, String _cpf, String _rg, String crb){
        super(nome, _cpf, _rg);
        this.crb = crb;
    }
    public String getCrb(){
        return crb;
    }
    public void setCrb(String crb){
        this.crb = crb;
    }

   @Override
    public String toString(){
        return "Bibliote{" +
                "nome='" + nome + '\'' +
                ",cpf='" + _cpf + '\'' +
                ",rg='" + _rg + '\'' +
                ",crb='" + crb + '\''+
                '}';

    }


}
