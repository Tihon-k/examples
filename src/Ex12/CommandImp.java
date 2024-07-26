package Ex12;

public class CommandImp implements Command{
    private Reciver theReciver;

    public CommandImp (Reciver reciver){
        this.theReciver = reciver;
    }



    @Override
    public void undo() {
    theReciver.deleteLast();
    }
}
