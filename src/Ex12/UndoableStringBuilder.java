package Ex12;

import java.util.ArrayList;
import java.util.List;

public class UndoableStringBuilder {

    List<String> historyList = new ArrayList();

    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    public void append(String str){
        sb.append(str);
        historyList.add(str);

    }

    public void undo() {
        int size;
        String lastPoint = historyList.getLast();
        size = lastPoint.length();

        sb.delete(sb.length()-size, sb.length());

        historyList.removeLast();
    }

}
