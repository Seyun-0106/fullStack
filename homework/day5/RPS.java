package homework;

//객체지향 방식으로 가위바위보를 하는데 두명의 선수가 무작위로 가위 바위 보를 낸 다음 승부를 출력하시오.
//Rock paper scissors

public class RPS {
    public static void main(String[] args) {
        Play play = new Play();
        play.gameStart();
    }
}

class Play {
    int rock = 0;
    int paper = 1;
    int scissors = 2;
    
    void gameStart() {
        int player1 = (int) (Math.random() * 3);
        int player2 = (int) (Math.random() * 3);

        if (player1 == 0) {
            System.out.println("Player1: 주먹");
        } else if (player1 == 1) {
            System.out.println("Player1: 보");
        } else {
            System.out.println("Player1: 가위");
        }

        if (player2 == 0) {
            System.out.println("Player2: 주먹");
        } else if (player2 == 1) {
            System.out.println("Player2: 보");
        } else {
            System.out.println("Player2: 가위");
        }


        if (player1==0&&player2==2 || player1==1&&player2==0||player1==2&&player2==1) {
            System.out.println("Player1이 이겼습니다.");
        } else if(player1 == 0 && player2 == 1 || player1 == 1 && player2 == 2 || player1 == 2 && player2 == 0) {
            System.out.println("Player2가 이겼습니다.");
        } else {
            System.out.println("비겼습니다.");
        }
    }
}

// Math.random 괄호 안 해줘서 계속 0만 나옴