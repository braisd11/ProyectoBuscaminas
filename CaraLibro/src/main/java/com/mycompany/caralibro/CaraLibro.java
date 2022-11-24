/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.caralibro;

/**
 *
 * @author a22braisdr
 */
public class CaraLibro {

    public static void main(String[] args) {
        CaraLibroBD base=new CaraLibroBD();
        Perfil paco=new Perfil ("Paco","hola");
        Perfil jaime=new Perfil ("Jaime","hola");
        base.engadirPerfil(paco);
        base.engadirPerfil(jaime);
        paco.engadirAmigo(jaime);
        paco.engadirSolicitudeDeAmizade(jaime);
        
        
    }
}
