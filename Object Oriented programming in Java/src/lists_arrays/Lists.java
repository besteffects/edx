package lists_arrays;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("text1");
        myList.add("text2");
        myList.add("text3");
        myList.add("text4");
        System.out.println("Before removal: " + myList);
        for (int i = 0; i < myList.size(); i++) {
            myList.remove(i);
        }
        System.out.println("After removal: " + myList);
    }
}
