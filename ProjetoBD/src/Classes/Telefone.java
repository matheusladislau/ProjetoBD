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
    public class Telefone{
    int idTelefone;
    int idPessoa;
    String numero;
    public Telefone(int idTelefone,int idPessoa,String numero){
        this.idTelefone=idTelefone;
        this.idPessoa=idPessoa;
        this.numero=numero;
    }
    public int getIdTelefone(){
        return this.idTelefone;
    }
    public int getIdPessoa(){
        return this.idPessoa;
    }
    public String getNumero(){
        return this.numero;
    }
}
