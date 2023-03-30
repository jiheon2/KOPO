public class GUGUDAN4 {
    public static void main(String[] args) {
        int k=2;
        int i;

        for(i=1; i<10; i++) {
        switch(k) {
            case 2: System.out.printf("%d X %d = %d \n", k, i, k * i); break;
            case 3: System.out.printf("%d X %d = %d \n", k, i, k * i); break;
            case 4: System.out.printf("%d X %d = %d \n", k, i, k * i); break;
            case 5: System.out.printf("%d X %d = %d \n", k, i, k * i); break;
            case 6: System.out.printf("%d X %d = %d \n", k, i, k * i); break;
            case 7: System.out.printf("%d X %d = %d \n", k, i, k * i); break;
            case 8: System.out.printf("%d X %d = %d \n", k, i, k * i); break;
            case 9: System.out.printf("%d X %d = %d \n", k, i, k * i); break;
        }
            if(i==9) { i = 0; k++;
                if(k==10) { break; }
                }
            }
        }
    }

// i = 0으로 선언하는 이유 : for문에 i가 0이 아닐 경우 X1이 표시가 안되기 때문
// k==10 조건을 걸어주는 이유 : 무한으로 반복이 되기 떄문에 끊어주기 위해서