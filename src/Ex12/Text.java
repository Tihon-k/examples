package Ex12;

import java.util.ArrayList;
import java.util.List;

public class Text {
    String str;

    public StringBuilder builder(StringBuilder sb, String str){
        this.str = str;
        return sb.append(this.str);
    }

    public StringBuilder undo(StringBuilder sb){
        List historyList = new ArrayList();
        historyList.add(this.str);


        int last = historyList.size();

        String lastStr = (String) historyList.get(last-1);

        historyList.remove(last-1);

        sb.delete(sb.indexOf(lastStr), sb.indexOf(lastStr) + lastStr.length());
        return sb;
    }
}
