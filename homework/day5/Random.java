package homework;
// 객체지향 방식으로 로또 번호 추천기를 만드시오

public class Random {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();

        for (int i = 65; i < 70; i++) {
            System.out.print((char) i + " ");
            lotto.random();
        }
    }
}

class Lotto {
    int[] num = new int[6];

    void random() {
        for (int i = 0; i < 6; i++) {
            num[i] = (int) (Math.random() * 45 + 1);
        }
        // 중복 제거
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                if (num[i] == num[j]) {
                    num[i] = (int) (Math.random() * 45 + 1);
                }
            }
            System.out.print(num[i] + " ");
        }
        System.out.println("");
    }
}