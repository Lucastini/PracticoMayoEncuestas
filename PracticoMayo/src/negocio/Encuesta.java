
package negocio;

import java.util.LinkedList;

public class Encuesta {
    private int codigo;
    private static int cod=1;
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private LinkedList<String> carreras;
    private String maximoNivelEducacionAlcanzado;
    
    public Encuesta(String nom, String ape, int ed, String gen, LinkedList carr, String nivel){
        codigo=cod;
        cod++;
        nombre=nom;
        apellido=ape;
        edad=ed;
        genero=gen;
        carreras=carr;
        maximoNivelEducacionAlcanzado=nivel;
    }

    public static int getCod() {
        return cod;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LinkedList<String> getCarreras() {
        return carreras;
    }
    public void setCarreras(LinkedList<String> carreras) {
        this.carreras = carreras;
    }

    public String getMaximoNivelEducacionAlcanzado() {
        return maximoNivelEducacionAlcanzado;
    }
    public void setMaximoNivelEducacionAlcanzado(String maximoNivelEducacionAlcanzado) {
        this.maximoNivelEducacionAlcanzado = maximoNivelEducacionAlcanzado;
    }
   
    public String toString(){
        String car="";
        for(String iter:carreras){
            if(car.isEmpty())
                car+=iter;
            else
                car+=", "+iter;
        }
        car+=".";
        return "Cod.: "+codigo+", "+apellido+", "+nombre+", "+edad+" años, "+genero+", Carreras que estudio: "+car+" Maximo nivel de estudio alcanzado: "+maximoNivelEducacionAlcanzado+".";
    }
    
}
