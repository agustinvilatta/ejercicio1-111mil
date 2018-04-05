/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizarreglos;

/**
 *
 * @author steve-urbit
 */
public class Ahorcado {
    public static char[] resultadoJugada(char[] palabraOriginal, char letra){
        char [] nuevoArreglo=new char [palabraOriginal.length];
        for(int i = 0; i<palabraOriginal.length; i++){
            if(palabraOriginal[i]==letra){
              nuevoArreglo[i]=letra;
                
            }
            else{
               nuevoArreglo[i]= '_';
            }
            
        }
        return nuevoArreglo;
    }
    public static boolean validarJugada(char[] jugadasAnteriores, char[] nuevaJugada){
        boolean acierto=false;
        for (int i = 0; i <jugadasAnteriores.length; i++) {
          //  for (int j = 0; j < nuevaJugada.length; j++) {//
                if(jugadasAnteriores[i]!=nuevaJugada [i] && nuevaJugada[i]!= '_'){
                 return true;
             }
                else{
                acierto = false;
                
            }
        }
        return acierto;
    }
}


            
            
                
            
            
            
        
        
        
    

