import java.util.Scanner;

public class qz$$$ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];

        for(int i=0; i<a.length; i++) {
            a[i] = s.nextInt();
        }

        for(int i=0; i<a.length-1; i++) {
            for(int k=0; k<a.length-1-i; k++) {
                if(a[k] < a[k+1]) {
                    int c = a[k];
                    a[k] = a[k+1];
                    a[k+1] = c;
                }
            }
        }
        // for(int i =1; i<a.length; i++) {
        //  int key = a[i];
        //  int j = i - 1;
        //  while(j>=0 && a[j] > key) {
        //      a[j+1] = a[j];
        //      j = j + 1;
        //  }
        //  a[j+1] = key;
        // }
        // 삽입정렬 코드

        // for(int i = 0; i<a.length-1; i++) {
        //  int min_idx = i;
        //      for(int j = i + 1; j < a.length; j++) {
        //          if(a[j] < a[min_idx]) {
        //              min_idx = j;
        //          }
        //      }
        //      int temp = a[min_idx];
        //      a[min_idx] = a[i];
        //      a[i] = temp;
        // }
        // 선택정렬 코드

        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
