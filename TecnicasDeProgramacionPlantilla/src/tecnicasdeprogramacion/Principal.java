package tecnicasdeprogramacion;

public class Principal extends MetodosSteve{

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan", "Vacardi" , "39777", 18, 180, 180);
               
        /*imprimir ("la persona se llama" + " " + persona1.getName());
        persona1.setName("ju4n");
        imprimir ("la persona se llama" + " " + persona1.getName());
        persona1.setLastName("walwa");
        imprimir ("la persona se apellida" + " " + persona1.getLastName());
        persona1.setLastName("wal23wa");
        imprimir ("la persona se apellida" + " " + persona1.getLastName());*/
        
        Mascota mascota1 = new Mascota("Jackson", "Perro", "22");
        persona1.setMiMascota(mascota1);
        imprimir ("la mascota de " + persona1.getName()+" se llama " + persona1.getMiMascota().getName());
        imprimir (persona1.getpasearMascota());
        int numeMax=10;
        imprimir(persona1.elegirNum(numeMax));
    }
   
        
}
