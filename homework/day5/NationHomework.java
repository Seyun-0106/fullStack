package homework;

//Class Nation 을 만들고 나라이름, 면적, 인구수를 멤버 변수로 만들고
//나라이름변경(), 면적변경(), 인구수변경() 메소드를 만드시오.

public class NationHomework {
    public static void main(String[] args) {
        Korea korea = new Korea();
        Japan japan = new Japan();
        Australia australia = new Australia();

        korea.food = "김치";
        korea.population = 51840000;
        japan.celebrity = "카사구치 켄타로";
        japan.area = 37790000;
        australia.weather = "비";

        System.out.println("한국 음식: " + korea.food);
        System.out.println("한국 인구 수: " + korea.population);
        System.out.println("일본 유명인: " + japan.celebrity);
        System.out.println("일본 면적: " + japan.area);
        System.out.println("호주 날씨: " + australia.weather);
        System.out.println("호주가 속한 행성: " + australia.planet);
    }
}

class Nation {
    private String name;
    public int area;
    public int population;
    static String planet = "Earth";

    void changeName(String name) { this.name = name;}
    void changeArea(int area) {this.area = area;}
    void changePopulation(int population) {this.population = population;}
}

class Korea extends Nation {
    String food;
    void changeFood(String food) {this.food = food;}
}

class Japan extends Nation {
    String celebrity;
    Nation nation = new Nation();
    void changeCelebrity(String celebrity) {this.celebrity = celebrity;}
}

class Australia extends Nation {
    String weather;
    Nation nation = new Nation();
    void changeWeather(String weather) {this.weather = weather;}
}
