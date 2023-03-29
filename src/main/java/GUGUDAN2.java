public class GUGUDAN2 {
    public static void main(String[] args) {
        int i, k;
        for(i=1; i<10; i++) {
            for(k=2; k<10; k++) {
                System.out.printf("%2d X %d = %2d  ", i, k, i*k);
            }
            System.out.printf("\n");
        }
    }
}
// 첫번째 for문은 구구단 앞자리 수의 반복을 나타내고 두번째 for문은 구구단 뒷자리 수의 반복을 나타냄
// 2d를 넣는 이유는 가독성을 높이기 위해서 보여지는 자릿수를 통일한 것이다. 2d 는 두자릿수로 나타내는데 값이없으면 공백으로 나타냄