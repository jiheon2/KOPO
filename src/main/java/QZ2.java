import java.util.Scanner;

public class QZ2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 정수 5개를 입력받기 위해 스캐너 사용
        int i; //for문을 돌리기 위해서 변수 i 선언
        int hap = 0; //평균을 구하기 위해 입력받은 모든 값을 더한 변수 hap을 0으로 선언
        int jungsu[] = new int[5]; // 배열의 크기가 5인 정수형 배열 jungsu를 선언

        System.out.print("5개의 정수를 입력하세요 : "); // 5개의 정수값을 입력받는 출력문
        for(i=0; i<5; i++) { //배열의 index가 0~4까지 5개를 반복하기 위해 for문 사용
            int a = s.nextInt(); // 정수형 변수 a에 값을 입력하기 위해 선언
            jungsu[i] = a; // 배열 jungsu에 i값에 a를 넣기 위해 선언
            hap += jungsu[i]; // 평균을 구하기 위해서 배열의 모든값을 더함
            }

        int max = jungsu[0]; // 배열의 첫번째 값을 정수형 변수 max로 선언
        int min = jungsu[0]; // 배열의 첫번째 값을 정수형 변수 min로 선언 나중에 값을 비교하기 위해서
        for(i=0; i<5; i++) { // 배열의 값을 하나씩 비교하기 위해서 for문 사용
            if(jungsu[i] > max) { // jungsu 배열의 i값이 배열의 첫번째 값보다 클때
                max = jungsu[i]; // 가장 큰 값이 jungsu 배열의 값이다
            }
            if(jungsu[i] < min) { // jungsu 배열의 i값이 배열의 첫번째 값보다 작을때
                min = jungsu[i]; //가장 작은 값이 jungsu 배열의 값이다
            }
        }
        float average = (float) hap / 5; // 실수형 변수 average를 선언하고 그 값은 모두 더한 값을 5로 나눈 것이다

        System.out.printf("최댓값 : %d\n", max); // 최댓값을 출력하는 문구
        System.out.printf("최솟값 : %d\n", min); // 최솟값을 출력하는 문구
        System.out.printf("평균값 : %f\n", average); // 평균값을 출력하는 문구
    }
}
