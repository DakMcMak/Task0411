public class Main {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if(month <= 2 || month == 12){
            System.out.println("Зима");
        }
        if(month >= 3 && month <= 5){
            System.out.println("Весна");
        }
        if(month >= 5 && month <= 8){
            System.out.println("Лето");
        }
        if(month >= 8 && month <= 11){
            System.out.println("Осень");
        }
    }
}
