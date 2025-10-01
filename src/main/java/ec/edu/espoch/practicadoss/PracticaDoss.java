
package ec.edu.espoch.practicadoss;

public class PracticaDoss {

    public static void main(String[] args) {
        Estudiantes estudianteUno=new Estudiantes (); //primer objeto
        estudianteUno.nombre="Flor";
        estudianteUno.identificacion=225003703; //String al momento de escrivir es entre ""
        System.out.println("nombre"+estudianteUno.nombre);
        System.out.println("identificacion"+estudianteUno.identificacion);
        
        Estudiantes estudianteDos=new Estudiantes (); //primer objeto
        estudianteDos.nombre="Angela";
        estudianteDos.identificacion=22605489; //String al momento de escrivir es entre ""
        System.out.println("nombre"+estudianteDos.nombre);
        System.out.println("identificacion"+estudianteDos.identificacion);
    }
}
