/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasdeprogramacion;

import java.util.Random;
/**
 *
 * @author utku35
 */
public class Persona {
//creamos atributos
        private String name;
        private String lastName;        
        private String dni;
        private int age;
        private float height;
        private float weight;
        private Mascota miMascota;
        
        
//metodo
        public void pasearMascota (Mascota miMascota){
        }
        
        public int elegirNum (int numeMax){
        int numerito = random (numeMax);
        return numerito;
        }
        
        
        
        
    public Persona(String name, String lastName, String dni, int age, float height, float weight) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.age = age;
        this.height = height;
        this.weight = weight;
        
    }
    

    public String getpasearMascota(){
        String paseo= "la mascota se está paseando.";
        return paseo;
    }
    
    public Mascota setpasearMascota (){
            Mascota pasearMascota = null;
        return pasearMascota;
    }
    
    public Mascota getMiMascota() {
        return miMascota;
    }
        
               
    public String getName(){
        return name;
    }

    public String getLastName() {
        return lastName;
    }
        
    public String getDni() {
        return dni;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    /*public void setName(String name){
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) >= 48 && name.charAt(i) <= 57){
                this.name = null;
                break;
            } else {
                if (name.charAt(0)>= 97 && name.charAt(0)<=122){
            int asciiValue =name.charAt(0);
            asciiValue = asciiValue - 32;
            char caracter=(char)asciiValue;
            char[] tempCharArray = name.toCharArray();
            tempCharArray[0]= caracter;
            name= String.valueOf (tempCharArray);
            
                this.name = name;
            }           
        }
        
        
            
            
            //asciiValue = (String) asciiValue;
         
            //name.charAt(0)=name.charAt(0)-32;
            //name.charAt(0)= (string) name.charAt(0);
        //name.substring(0, 1).toUpperCase() + name.substring(1);
        }
                //string.toUpperCase()
    }
*/
    public void setName(String name){
     
       this.name=  mayusculizar (name);
       /*for (int i=0;i<name.length();i++){
            if (name.charAt(i)>=48 && name.charAt(i)<=57){
                this.name = null;
                return;
            }
        }
           String primera=name.substring(0, 1);
           primera=primera.toUpperCase();
           String segunda=name.substring(1);
           segunda=segunda.toLowerCase();
           //name=primera+segunda;
           name=primera.concat(segunda);
           this.name=name;
        */
           
    }       
    
    private String mayusculizar (String palabra){
        
        for (int i=0;i<palabra.length();i++){
            if (palabra.charAt(i)>=48 && palabra.charAt(i)<=57){
                palabra = null;
                return null;
            }
        }
           String primera=palabra.substring(0, 1);
           primera=primera.toUpperCase();
           String segunda=palabra.substring(1);
           segunda=segunda.toLowerCase();
           palabra=primera.concat(segunda);
           return palabra;
        
    }
                        
    
    public void setLastName(String lastName) {
        this.lastName= mayusculizar(lastName);

    }

    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setMiMascota(Mascota miMascota) {
        this.miMascota = miMascota;
    }

    private int random(int numeMax) {
      return   Random(numeMax);
    }

    
    
}