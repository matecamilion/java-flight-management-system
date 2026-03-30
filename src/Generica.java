import java.util.ArrayList;
import java.util.List;

public class Generica <T> {
    private List<T> elementos = new ArrayList<>();
    private int tope;

    private Generica(int tope){
        this.tope = tope;
    }


        public boolean agregarelementos(T t){
        if(tope < elementos.size()){
            elementos.add(t);
            return true;
        }
        return false;
        }

}
