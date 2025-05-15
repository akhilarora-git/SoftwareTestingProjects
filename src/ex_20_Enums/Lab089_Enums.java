package ex_20_Enums;

public class Lab089_Enums {
    public static void main(String[] args) {
        System.out.println(Days.TUESDAY);
        System.out.println(Project_URLs.google);

    }
}
enum Days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

enum Project_URLs{
    google,restassured,katalon,Vwo
}

