/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
/**
 *
 * @author Matheus
 */
    public class Pessoa{
    private int idPessoa;
    private String nomePessoa;
    private String email;
    private String endereco;
    private String bairro;

    public Pessoa(int idPessoa,String nomePessoa,String email,String endereco,String bairro){
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.email = email;
        this.endereco = endereco;
        this.bairro = bairro;
    }
    public int getIdPessoa(){
        return this.idPessoa;
    }
    public String getNomePessoa(){
        return this.nomePessoa;
    }
    public String getEmail(){
        return this.email;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getBairro(){
        return this.bairro;
    }
}