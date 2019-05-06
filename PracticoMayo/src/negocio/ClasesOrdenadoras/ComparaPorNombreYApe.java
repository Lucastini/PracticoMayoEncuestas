
package negocio.ClasesOrdenadoras;

import java.util.Comparator;
import negocio.Encuesta;

public class ComparaPorNombreYApe implements Comparator<Encuesta> {

    @Override
    public int compare(Encuesta e1, Encuesta e2) {
        int res=e1.getApellido().compareToIgnoreCase(e2.getApellido());
        if(res==0)
            res=e1.getNombre().compareToIgnoreCase(e2.getNombre());
        return res;
    }
    
}
