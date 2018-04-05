/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasdeprogramacion;

/**
 *
 * @author utku35
 */
public class Mascota {
    
    private String name;
    private String type;
    private String age;
    
    public Mascota(String name, String type, String age){
        this.name = name;
        this.age = age;
        this.type = type;
}

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
