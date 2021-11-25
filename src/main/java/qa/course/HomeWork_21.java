package qa.course;

public class HomeWork_21 {

    public static void main(String[] args) {

        BiggestNumber(25, 40, 1);
        Rectangle(30, 60);
        Number(48684);
        WeekDays(1);

    }

    public static void BiggestNumber(int a, int b, int c) {
        if (a <= b) {
            if (b <= c) {
                System.out.println(c + " C number");
            } else System.out.println(b + " B number");
        } else if (a <= c) {
            System.out.println(c + " C number");
        } else System.out.println(a + " A number");

    }

    public static void Rectangle(int a, int b) {
        System.out.println(a * b + " S Rectangle");
        System.out.println(a * 2 + b * 2 + " P Rectangle");
    }

    public static void Number(int a) {
        if (a % 2 == 0) {
            System.out.println("an even number");
        } else {
            System.out.println("odd number");
        }

    }

    public static void WeekDays(int a) {
        switch (a) {
            case 1:
                System.out.println("You have selected " + a + ". Day of the week is Monday");
                break;
            case 2:
                System.out.println("You have selected " + a + ". Day of the week is Tuesday");
                break;
            case 3:
                System.out.println("You have selected " + a + ". Day of the week is Wednesday");
                break;
            case 4:
                System.out.println("You have selected " + a + ". Day of the week is Thursday");
                break;
            case 5:
                System.out.println("You have selected " + a + ". Day of the week is Friday");
                break;
            case 6:
                System.out.println("You have selected " + a + ". Day of the week is Saturday");
                break;
            case 7:
                System.out.println("You have selected " + a + ". Day of the week is Sunday");
                break;

            default:
                System.out.println("Wrong Day");

        }
    }
}
