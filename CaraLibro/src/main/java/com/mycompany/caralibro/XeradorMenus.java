/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibro;

/**
 *
 * @author a22noellr
 */
import java.util.Scanner;

public class XeradorMenus {
    
    public void mostrarMenuInicial() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1-Crear un novo perfil");
        System.out.println("2-Iniciar sesión");
        System.out.print("Seleccione unha opción->");
        int n=entrada.nextInt();
        while (n<1 || n>2) {
            System.out.println("Opción no válida, seleccione de novo:");
            n=entrada.nextInt();
        }
    }
    
    public void mostrarMenuPrincipal(Perfil p) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1-Crear un novo perfil");
        System.out.println("2-Iniciar sesión");
        System.out.print("Seleccione unha opción->");
        int n=entrada.nextInt();
        while (n<1 || n>6) {
            System.out.println("Opción no válida, seleccione de novo:");
            n=entrada.nextInt();
        }
        //Estado
        //Biografía
        //Solicitudes de Amizade
        //Lista de Amigos
        //Mensaxes
        //Pechar a sesión
    }
    
    public void mostrarBiografía(Perfil p) {
        for (int i = 0; i < p.publicacions.size(); i++) {
            System.out.println(p.publicacions.get(i).getTexto);
        }
    }
    
    public void mostrarSolicitudesAmizade(Perfil p) {
        for (int i = 0; i < p.solicitudes.size(); i++) {
            System.out.println(p.solicitudes.get(i).getNome);
        }
    }
    
    public void mostrarListaAmigos(Perfil p) {
        for (int i = 0; i < p.amigos.size(); i++) {
            System.out.println(p.amigos.get(i).getNome);
        }
    }
    
    public void mostrarMensaxes(Perfil p) {
        for (int i = 0; i < p.mensaxes.size(); i++) {
            System.out.println(p.mensaxes.get(i).getTexto + "de" + p.mensaxes.get(i).getRemitente);
        }
    }
    
    public void pecharSesión() {
        mostrarMenuInicial();
    }
    
}
