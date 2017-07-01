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
    private String nome;
    public Pessoa(int idPessoa,String nome){
        this.idPessoa=idPessoa;
        this.nome=nome;
    }
    public String getNome() {
        return this.nome;
    }
    public int getIdPessoa() {
        return this.idPessoa;
    }
}