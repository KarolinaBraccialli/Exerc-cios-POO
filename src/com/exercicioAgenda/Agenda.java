package com.exercicioAgenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Agenda {

    private List<Pessoa> agenda = new ArrayList<>(10);
    private String nomeAgenda;

    public List<Pessoa> getAgenda() {
        return agenda;
    }

    public void setAgenda(List<Pessoa> agenda) {
        this.agenda = agenda;
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    void armazenaPessoa(String nome, int idade, float altura){
        Pessoa contato = new Pessoa();
        contato.setNome(nome);
        contato.setIdade(idade);
        contato.setAltura(altura);
        this.agenda.add(contato);
    }

    void removePessoa(String nome){
        this.agenda.removeIf(contato -> Objects.equals(contato.getNome(), nome));
    }

    int buscarPessoa(String nome){
        for (Pessoa contato : this.agenda) {
            if (Objects.equals(contato.getNome(), nome)) return this.agenda.indexOf(contato);
        }
        return -1;
    }

    void imprimeAgenda(){
        for (Pessoa contato: agenda) {
            System.out.println(contato);
        }
    }
    void imprimePessoa(int index){
        System.out.println(this.agenda.get(index));
    }


}
