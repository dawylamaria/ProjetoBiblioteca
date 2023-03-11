package br.edu.fescfafic.biblioteca.Model;

public class Leitor {

    public String nome;

    protected String _rg;
    private  String _cpf;

    public int quantDeObrasEmPosse = 0;

    public Leitor(String nome, String _rg, String _cpf, int quantDeobrasEmPosse){
        this.nome = nome;
        this._rg = _rg;
        this._cpf = _cpf;
        this.quantDeObrasEmPosse = quantDeObrasEmPosse;
    }
    public String ToString(){
        return "Leitor{" +
                "nome='" + nome + '\'' +
                "rg='" + _rg + '\'' +
                "cpf'" + _cpf + '\'' +
                "quantidadeDeObrasEmPosse='" + quantDeObrasEmPosse + '\'' +
                '}';
    }


}
