package Ex12;

public class Ex12StringBuilder {

    public static void main(String[] args) {

        UndoableStringBuilder undoableStringBuilder = new UndoableStringBuilder();
        undoableStringBuilder.append("abra-cadabra");
        undoableStringBuilder.append(" bla-bla");
        undoableStringBuilder.append(" da-da");



        undoableStringBuilder.undo();
        System.out.println(undoableStringBuilder.sb);

        undoableStringBuilder.undo();
        System.out.println(undoableStringBuilder.sb);

        undoableStringBuilder.undo();
        System.out.println(undoableStringBuilder.sb + "---");
    }

}

