package Ex6_1;

public class IsNullFilter implements FilterInterface {


    @Override
    public boolean apply(Object object) {

        return object == null;
    }


}
