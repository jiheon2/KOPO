import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for(int i=0; i<6; i++) {
            System.out.print("입력값 : ");
            list.add(s.nextInt());
            list.get(i);
        }

        Collections.sort(list);

        list.forEach(i -> System.out.println("출력 값: " + list.get(i-1)));
    }
}
