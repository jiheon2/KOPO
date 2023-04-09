import java.util.Scanner;

public class QZ$ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //배열값을 입력받기위해서 스캐너 선언
        int[] aa = new int[5]; // 크기가 5인 배열 aa를 선언
        int i,k; // 정수형 변수 i와 k를 선언

        for (i = 0; i < aa.length; i++) { // i가 0부터 시작해서 aa배열의 크기까지 i++
            System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1); // 배열에 들어갈 숫자 입력받는 문구 출력
            aa[i] = s.nextInt(); // aa배열에 넣을 숫자를 입력받기, aa배열의 i값

            for (k = 0; k < i; k++) { //k가 0부터 i까지 k++
                if (aa[i] == aa[k]) { //만약 aa배열의 i값이랑 aa배열의 k값이 같을 경우
                    System.out.printf("중복된 숫자\n"); // 중복된 숫자라고 출력
                    i--; // i--를 실행해서 전으로 돌아가기, 다시 값을 입력받기위해서
                    break; // for문을 빠져나가기 위해서
                }
            }
        }

            for (i = 0; i < aa.length; i++) { //i가 0부터 aa배열크기까지 i++
                for (k = i + 1; k < aa.length; k++) { //k가 i+1부터 aa배열크기까지 k++
                    if (aa[i] > aa[k]) { //aa배열의 i값이 aa배열의 k갑보다 클 경우 >오름차순 <내림차순
                        int b = aa[i]; // 정수형 변수 b 를 선언하고 b는 aa배열의 i값과 같음
                        aa[i] = aa[k]; // aa배열의 i 값은 aa배열의 k 값과 같음
                        aa[k] = b; // aa배열의 k 값은 b와 같음
                        //정렬을 나타내는 것임
                    }
                }
            }








            System.out.printf("정렬된 숫자 : \n");
            for (i = 0; i < aa.length; i++) { //배열을 출력하기 위한 반복문
                System.out.printf("%d", aa[i]); // 배열 출력문
            }
        }
    }

