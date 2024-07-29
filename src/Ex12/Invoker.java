package Ex12;

public class Invoker implements Command {

    private StringBuilder theStringBuilder;

    public Invoker(StringBuilder stringBuilder){
        this.theStringBuilder = stringBuilder;
    }

    @Override
    public void undo() {
        theStringBuilder.undo();
    }
}
