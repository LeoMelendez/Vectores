/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
public class PVectores {
   public static void main (String [] args){
       
       
       
       
       int i ;
       int [] vecnumeros ={11,-22,33,-44,55,-66,77,-88,99};
       int [] vecpositivos = new int [10];
       int indicePositivo = 0;
       
       for (i=0;i<vecnumeros.length;i++){
        System.out.print(vecnumeros[i]+" ");
   }
      
       
       for (i=0  ; i<vecnumeros.length ; i++){
       
           
           if (vecnumeros[i]>0){
           vecpositivos[indicePositivo]=vecnumeros[i];
           indicePositivo++;
           }
       }
       System.out.println(" ");
       System.out.println("hay "+indicePositivo+" numeros positivos");
       
       for (i=0;i<vecpositivos.length;i++){
           
        System.out.print(vecpositivos[i]+" ");
   }
       
       }
       
       
       
       
       
       
   } 

