package persona;

public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public Persona() {
    }

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(17);
        persona.setNombre("Jhoan");
        persona.setTelefono("3107255406");

        System.out.println("El nombre de la persona es: "+persona.getNombre()+", tiene una edad de: "+ persona.getEdad()
        +" y el numero de telefono es de: "+persona.getTelefono());
    }
}
