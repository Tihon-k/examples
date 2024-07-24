package Ex12;

import java.util.ArrayList;
import java.util.List;

public class Ex12StringBuilder {

    public static void main(String[] args) {
        Text text = new Text();
        StringBuilder sb = new StringBuilder();

        text.builder(sb,"abra-cadabra");
        text.builder(sb,"la-la-la");
        text.builder(sb,"13213");

        text.undo(sb);
        text.undo(sb);

        System.out.println(sb);


    }

}

