package br.edu.fescfafic.biblioteca.Model;

public class Atendente extends Colaboradores{

    public Atendente(String nome, String _cpf, String _rg){
        super(nome, _cpf, _rg);
    }
    @Override
    public String toString (){
        return "Atendente{" +
                "nome='" + nome + '\'' +
                "cpf='" + _cpf + '\'' +
                "rg='" + _rg + '\'' +
                '}';
    }
}
