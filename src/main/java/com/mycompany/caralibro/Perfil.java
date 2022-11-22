/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibro;

import java.util.HashMap;

/**
 *
 * @author brais
 */
public class Perfil {
    public String nome;
    public String contrasinal;
    public String estado;
    
    public Perfil (String nome, String contrasinal){
        this.nome=nome;
        this.contrasinal=contrasinal;
    }

    
    //GETTER E SETTER
    public String getNome() {
        return nome;
    }

    public String getContrasinal() {
        return contrasinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContrasinal(String contrasinal) {
        this.contrasinal = contrasinal;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    //MÉTODOS
    
    //Engade os datos do nome e o contrassinal ao HashMap
    public void Perfil (String nome, String contrasinal){
        HashMap <String, String> Perfil=new HashMap<String, String>();
        Perfil.put(nome, contrasinal);
    }
    
    
}