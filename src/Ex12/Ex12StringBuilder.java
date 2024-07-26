package Ex12;

public class Ex12StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        Reciver reciver = new Reciver();
        reciver.builder(sb, "abra-cadabra");
        reciver.builder(sb, "bla-bla");
        reciver.builder(sb, "da-da");

        Command undo = new CommandImp(reciver);

        Invoker invoker = new Invoker(undo);

        invoker.turnUndo();
        System.out.println(sb);

        invoker.turnUndo();
        System.out.println(sb);

        invoker.turnUndo();
        System.out.println(sb + "---");
    }

}

