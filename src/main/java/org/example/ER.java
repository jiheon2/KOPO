package org.example;

import java.util.Scanner;

public class ER {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        int i, k, j;
        String p;
        boolean team1[] = new boolean[5];
        boolean team2[] = new boolean[5];
        int score1 = 0, score2 = 0;

        System.out.printf("코인토스 선공후공 결정하기\n");
        System.out.printf("코인을 던지시겠습니까? Y/N ");
        p = m.nextLine();
        if (p.equals("N")) {
            return;
        }

        int z = (int) (Math.random() * 2);
        if (z + 1 == 2) {
            System.out.printf("선공입니다\n");
        } else {
            System.out.printf("후공입니다\n");
        }
        System.out.printf("<1> 왼쪽 | <2> 가운데 | <3>오른쪽\n");

        int count1 = 0;
        int count2 = 0;

        for (i = z; i < 10 + z; i++) {
            System.out.println();
            int a = (int) (Math.random() * 3);
            int b = (int) (Math.random() * 4);

            if (!(i % 2 == 0)) {
                System.out.print((count1 + 1) + "번선수\n");
                System.out.printf("슛 방향 ");
                k = s.nextInt();
                System.out.printf("막은 방향 %d\n", a);
                if (k == a) {
                    System.out.printf("No Goal\n");
                    team1[count1++] = false;
                } else if (k > 2) {
                    System.out.printf("골대를 벗어났습니다\n");
                    team1[count1++] = false;
                } else {
                    System.out.printf("Goal!\n");
                    team1[count1++] = true;
                }

            } else {
                System.out.printf("골키퍼\n");
                System.out.printf("막을 방향 ");
                j = n.nextInt();
                System.out.printf("슛 방향 %d\n", b);
                if (b == j) {
                    System.out.printf("No Goal\n");
                    team2[count2++] = false;
                } else if (b > 3) {
                    System.out.printf("골대를 벗어났습니다\n");
                    team2[count2++] = false;
                } else {
                    System.out.printf("Goal!\n");
                    team2[count2++] = true;
                }
            }
        }
        System.out.printf("\n");
        System.out.printf("경기 결과\n");
        System.out.printf("TEAM1 ");
        for (int y = 0; y < 5; y++) {
            if (team1[y])
                System.out.printf("O");
            else
                System.out.printf("X");
        }
        System.out.printf("\n");
        System.out.printf("TEAM2 ");
        for (int y = 0; y < 5; y++) {
            if (team2[y])
                System.out.printf("O");
            else
                System.out.printf("X");

            for (int q = 0; q < team1.length; q++) {
                if (team1[q] == true)
                    score1++;
                if (team2[q] == true)
                    score2++;
            }
        }
        System.out.printf("\n");
        if (score1 > score2) {
            System.out.printf("TEAM1이 승리");
        } else if (score1 < score2) {
            System.out.printf("TEAM2이 승리");
        } else if (score1 == score2) {
            System.out.printf("무승부입니다");
        }

    }
}


