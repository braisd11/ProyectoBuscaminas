/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibro;

import java.util.ArrayList;

/**
 *
 * @author a22braisdr
 */
public class CaraLibroBD {
    ArrayList<Perfil> perfis= new ArrayList<>();
    
    
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

    
 
//Busca o perfil no array e devolveo. EN PRINCIPIO UTILIZAMOS ESTO PARA INICIAR SESIÓN
    public Perfil obterPerfil (String nome, String contrasinal) {
        Perfil perfilPropio=null;
        for (int cont=0; cont<perfis.size(); cont++){
            if (perfis.get(cont).getNome()==nome && perfis.get(cont).getContrasinal()==contrasinal){
               perfilPropio=perfis.get(cont);
            }
        }
        return perfilPropio;
    }
    
    
    
    
//Busca o perfil no array e devolvo o nome do perfil 
    public Perfil buscarPerfil (String nome){
        Perfil perfilBuscado=null;
        for (int cont=0; cont<perfis.size(); cont++){
            if (perfis.get(cont).getNome()==nome){
               perfilBuscado=perfis.get(cont);
            }
        }
        return perfilBuscado;
    }
    
    
    
    
//Engade o perfil ao arrayList creado               //ACABADO

    public void engadirPerfil (Perfil novoPerfil){
        perfis.add(novoPerfil);
    }
}
