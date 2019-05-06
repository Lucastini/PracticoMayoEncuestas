
package negocio;

import java.util.Comparator;
import java.util.LinkedList;

public class GestorEncuestas {
    private LinkedList<Encuesta> encuestas;

    public GestorEncuestas(){
        encuestas=new LinkedList();
    }

    public LinkedList<Encuesta> getEncuestas() {
        return encuestas;
    }
    
    public boolean addEncuesta(Encuesta en){
        return encuestas.add(en);
    }
    
    private Encuesta buscarEncuesta(int codigo){
        Encuesta enc=null;
        for(Encuesta iter:encuestas)
            if(iter.getCodigo()==codigo)
                enc=iter;
        return enc;
    }
    
    public boolean eliminarEncuesta(int codigo){
        boolean res=false;
        Encuesta enc=buscarEncuesta(codigo);
        if (enc!=null)
            res=encuestas.remove(enc);
        return res;  
    }
    
    public void ordenarColeccion(Comparator objOrdenador){
        encuestas.sort(objOrdenador);
    }
    
    public float calculoEdadPromedio(){
        float res=0f;
        int acuEdad=0;
        int cant=encuestas.size();
        for(Encuesta iter: encuestas)
            acuEdad+=iter.getEdad();
        if(cant!=0)
            res=acuEdad/(float)cant;
        return ((int)(res*100))/100f;
    }
    
    public String mostrarEncuestas(){
        String enc="Encuestas:";
        String aux=enc;
        for(Encuesta iter:encuestas)
            enc+="\n"+iter.toString();
        if(enc.equals(aux))
            enc+="\nAun no hay encuestas cargadas";
        return enc;
    }
    
}
