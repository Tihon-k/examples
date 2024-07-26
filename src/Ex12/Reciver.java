package Ex12;

import java.util.ArrayList;
import java.util.List;

public class Reciver {

    List historyList = new ArrayList();

    StringBuilder sb = new StringBuilder();
    public void builder(StringBuilder sb, String str){
        sb.append(str);
        this.sb = sb;
        historyList.add(str);
        int i = historyList.lastIndexOf(str);

    }

    public void deleteLast() {
        int size;
        String last = (String) historyList.getLast();
        size = last.length();

        sb.delete(sb.length()-size, sb.length());

        int i = historyList.size()-1;
        historyList.remove(i);
    }

}
