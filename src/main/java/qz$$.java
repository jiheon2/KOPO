import java.util.Scanner;

public class qz$$ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 5개의 값을 입력받기 위해 스캐너 선언
        int a[] = new int[5]; // 값을 입력 받기 위한 배열 출력
        int b[] = new int[a.length]; // 중복된 값을 제거하고 남은 값을 저장하기 위해 배열 b선언
        int i, k, c, f; // 정수형 변수를 선언

        System.out.print("입력값 : ");
        for(i=0; i<a.length; i++) { // i가 0부터 시작해서 a배열의 길이보다 작을 때 i++
            a[i] = s.nextInt(); // 입력값은 a배열의 i번째값
        }
// a배열의 0번쨰 값부터 4번째까지 값을 입력받음

        for(i=0; i<a.length; i++) { //i부터 a배열의 길이까지 i++
            c = a[i]; //a배열의 i번째 값을 b배열에 저장하기 위해 정수형 변수 c에 대입
            for(k=0; k<i; k++) { //k가 0부터 시작해서 i보다 작을 때 k++
                if(c==a[k]) { // a배열의 i번째값이 a배열의 k번째 값과 같을 때
                    break; // for문을 빠져나감(a배열의 값을 b배열에 저장하지 않음)
                }
            }
            if(i==k) { //i와 k가 같을 때 즉 break문이 실행이 안되었을 때
                b[i] = c; // b배열의 i번째 값에 a의 i번째 값을 저장함
            }
        }
// 중복 검사를 한 뒤 중복이면 저장을 하지 않고 중복이 아닐 때 a배열의 값을 b배열에 저장하는 코드

        for(i=0; i<b.length-1; i++) { // i가 0부터 b배열의 -1번쨰 즉 인덱스의 끝값까지 i++
            for(k=0; k<b.length-1-i; k++) { // k가 0부터 b배열의 -1번째 값에 i값을 뺀 값 즉 순차적으로(i++) k++
                if(b[k] > b[k+1]) { //k번째 값이 k+1번째 값보다 클 때
                    f = b[k];
                    b[k] = b[k+1];
                    b[k+1] = f;
                    }
                }
            }
// 버블 정렬 알고리즘 첫번째 for문은 정렬을 반복할 횟수, 두번째 for문은 숫자를 비교하고 순서를 바꾸는 역할임
        System.out.print("저장된 값은");
        for(i=0; i<b.length; i++) {
            if (b[i] != 0) { //b배열에 저장하지 않은 값은 컴퓨터에서 0으로 저장했기 때문에 0을 제외하고 출력하기 위한 조건문
                System.out.print(b[i]);
            }
        }
        System.out.print("입니다.");
    }
}
// a배열에 값을 입력하고 b배열에 저장한 후 b배열을 오름차순으로 출력하는 코드를 짤 것임
//1. a배열에 값을 입력하기 위한 코드 2.중복검사를 한 후 b배열에 값을 저장하는 코드 3.버블정렬 알고리즘을 사용하여 오름차순으로 정렬
