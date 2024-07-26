package Ex12;

public class Invoker {

    private Command turnBack;

    public Invoker(Command undo){
        this.turnBack = undo;
    }

    public void turnUndo(){
        turnBack.undo();
    }

}
