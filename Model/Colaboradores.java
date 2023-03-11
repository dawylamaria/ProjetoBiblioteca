package br.edu.fescfafic.biblioteca.Model;

abstract class Colaboradores {

    public String nome;

    protected String _cpf;

    protected String _rg;

    Colaboradores(String nome, String _cpf, String _rg){
        this.nome = nome;
        this._cpf = _cpf;
        this._rg = _rg;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Colaboradores{" +
                "nome='" + nome + '\'' +
                ",cpf='" + _cpf + '\'' +
                ",rg+'" + _rg + '\'' +
                '}';
    }
}

