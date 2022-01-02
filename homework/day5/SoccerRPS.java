package homework;
//축구 - 팀 - 사람 의 구조로 상속 가능한 객체지향 코드를 작성하고
//가위바위보 방식으로 팀별 승리팀을 출력하는 코드를 작성하시오.(승리 조건 및 클래스의 속성/메소드는 자유)

public class SoccerRPS {
    public static void main(String[] args) {
        Soccer soccer = new Soccer();
        Player player1 = new Player("토트넘", "손흥민");
        Player player2 = new Player("리버풀","헨더슨");

        soccer.play(player1.playerName, player2.playerName);
        // System.out.println(team1.num);   // 상속 확인

    }
}
class Soccer {
    int num = 11;
    int defense = 0;
    int goal = 1;
    int noAction = 2;

    int rock = 0;
    int paper = 1;
    int scissors = 2;

    void play(String player1, String player2) {
        int p1 = (int) (Math.random() * 3);
        int p2 = (int) (Math.random() * 3);

        if (p1 == 0) {
            System.out.println(player1 + ": 주먹");
        } else if (p1 == 1) {
            System.out.println(player1 + ": 보");
        } else {
            System.out.println(player1 + ": 가위");
        }

        if (p2 == 0) {
            System.out.println(player2 + ": 주먹");
        } else if (p2 == 1) {
            System.out.println(player2 + ": 보");
        } else {
            System.out.println(player2 + ": 가위");
        }

        if (p1 == 0 && p2 == 2 || p1 == 1 && p2 == 0 || p1 == 2 && p2 == 1) {
            System.out.println(player1 + "이 이겼습니다.");
        } else if (p1 == 0 && p2 == 1 || p1 == 1 && p2 == 2 || p1 == 2 && p2 == 0) {
            System.out.println(player2 + "이 이겼습니다.");
        } else {
            System.out.println("비겼습니다.");
        }
    }
}

class Team extends Soccer {
    String teamName;
    
    public Team(String teamName) {
        super();
        this.teamName = teamName;
    }
}

class Player extends Team {
    String playerName;

    public Player(String teamName, String playerName) {
        super(teamName);
        this.playerName = playerName;
    }

}