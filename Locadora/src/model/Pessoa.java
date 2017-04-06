package model;
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String rg;
    private Endereco end;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void setEndLogradouro(String logradouro){
        this.end.setLogradouro(logradouro);
    }
    public String getEndLogradouro(){
        return this.end.getLogradouro();
    }
    public String getEndNome() {
        return this.end.getNome();
    }

    public void setEndNome(String nome) {
        this.end.setNome(nome);
    }

    public String getEndComplemento() {
        return this.end.getComplemento();
    }

    public void setEndComplemento(String complemento) {
        this.end.setComplemento(complemento);
    }

    public String getEndBairro() {
        return this.end.getBairro();
    }

    public void setBairro(String bairro) {
        this.end.setBairro(bairro);
    }

    public String getEndCep() {
        return this.end.getCep();
    }

    public void setEndCep(String cep) {
        this.end.setCep(cep);
    }

    public int getEndNumero() {
        return this.end.getNumero();
    }

    public void setNumero(int numero) {
        this.end.setNumero(numero);
    }
}
