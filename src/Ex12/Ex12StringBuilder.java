package Ex12;

public class Ex12StringBuilder {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abra-cadabra");
        stringBuilder.append(" bla-bla");
        stringBuilder.append(" da-da");

        Invoker invoker = new Invoker(stringBuilder);

        invoker.undo();
        System.out.println(stringBuilder.sb);

        invoker.undo();
        System.out.println(stringBuilder.sb);

        invoker.undo();
        System.out.println(stringBuilder.sb + "---");
    }

}

