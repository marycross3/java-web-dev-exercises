package exercises.technology;
import java.util.concurrent.atomic.AtomicReference;
public class AbstractEntity{
    private static int id=0;

    public AbstractEntity(){
        this.id = id;
    }

    public int getId() {
        id ++;
        return id;
    }
}
