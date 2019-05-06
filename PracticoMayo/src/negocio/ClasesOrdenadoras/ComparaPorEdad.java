
package negocio.ClasesOrdenadoras;

import java.util.Comparator;
import negocio.Encuesta;

public class ComparaPorEdad implements Comparator<Encuesta>{

    @Override
    public int compare(Encuesta e1, Encuesta e2) {
        return e1.getEdad()-e2.getEdad();
    }
    
}
