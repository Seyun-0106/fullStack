package homework.day9;

//1. Runnable 인터페이스를 상속받은 Human 클래스를 만드시오
public class Homework1 {
    public static void main(String[] args) {
        Human human = new Human();
        human.run();
    }
}

class Human implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable 추상 메소드 run() 실행");
    }
}
