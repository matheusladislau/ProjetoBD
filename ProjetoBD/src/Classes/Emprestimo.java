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
public class Emprestimo{
    private int idEmprestimo;
    private int idPessoa;
    private String dataEmprestimo;
    private String dataDevolucao;
    private boolean devolvido;
    public Emprestimo(int idEmprestimo,int idPessoa,String dataEmprestimo,String dataDevolucao,boolean devolvido){
        this.idEmprestimo=idEmprestimo;
        this.idPessoa=idPessoa;
        this.dataEmprestimo=dataEmprestimo;
        this.dataDevolucao=dataDevolucao;
        this.devolvido=devolvido;
    }
    public int getIdEmprestimo(){
        return this.idEmprestimo;
    }
    public int getIdPessoa(){
        return this.idPessoa;
    }
    public String getDataEmprestimo(){
        return this.dataEmprestimo;
    }
    public String getDataDevolucao(){
        return this.dataDevolucao;
    }
    public boolean isDevolvido(){
        return this.devolvido;
    }
}

