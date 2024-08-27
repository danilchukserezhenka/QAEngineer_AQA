import java.util.ArrayList;
import java.util.List;

public class Convert {
    public static <T> List <T> convertArrayToList(T array[]) {
        List<T> list = new ArrayList<>();
        for (T t : array) {
            list.add(t);
        }
        return list;
    }
}
