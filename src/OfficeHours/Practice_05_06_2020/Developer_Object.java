package OfficeHours.Practice_05_06_2020;

public class Developer_Object {

    public static void main(String[] args) {

        Developer developer1 = new Developer();
        developer1.setInfo("Baha","Game Developer",250000,1241);

        System.out.println(developer1);

        developer1.coding();

        Developer developer2 = new Developer();
        developer2.setInfo("Boomer", "Senior Developer", 160_000,18121993);

        developer2.fixing();
    }
}
