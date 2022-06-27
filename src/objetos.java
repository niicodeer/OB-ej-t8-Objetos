public class objetos {
    public static void main(String[] args){
        Persona persona1 = new Persona();

        persona1.setEdad(25);
        persona1.setNombre("Eduardo");
        persona1.setTelefono(555666777);

        System.out.println("El nombre es: " + persona1.getNombre());
        System.out.println("La edad es: " + persona1.getEdad());
        System.out.println("El teléfono es: " + persona1.getTelefono());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}