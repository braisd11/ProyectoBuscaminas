/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibro;

import java.util.ArrayList;

/**
 *
 * @author brais
 */
public class CaraLibroBD {
    ArrayList<Perfil> perfis=new ArrayList<Perfil>();
    
    
    //MÉTODO CONSTRUCTOR
    public CaraLibroBD (){
        
    }

    //GETTER E SETTER
    public ArrayList<Perfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(ArrayList<Perfil> perfis) {
        this.perfis = perfis;
    }
    
    
    
    //MÉTODOS
    
    
    //Busca o perfil e comproba se xa existe dito Perfil
    public Perfil obterPerfil (String nome, String contrasinal){
        for (int cont=0; cont<perfis.size(); cont++){
            if ()
        }
    }
    
    
    //Busca o perfil no hashmap e devolve o nome
    public Perfil buscarPerfil (String nome){
        for (int cont=0;cont<perfis.size(); cont++){
            if ()
        }
    }
    
    
    //Engadimos o perfil ao array
    //Rematado en cuestión
    public void engadirPerfil (Perfil novoPerfil){
        perfis.add(novoPerfil);
    }
}