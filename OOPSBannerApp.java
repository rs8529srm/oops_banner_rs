/**
 * OOPSBannerApp UC3  OOPS Banner Application (Use Case 3)
 * Using String.join() instead of + operator
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                " * ",
                " * ",
                " *** ",
                " *** "));

        System.out.println(String.join(" ",
                "*   *",
                "*   *",
                "*   *",
                "*    "));

        System.out.println(String.join(" ",
                "*   *",
                "*   *",
                "** ",
                " * "));

        System.out.println(String.join(" ",
                "*   *",
                "*   *",
                "*    ",
                "    *"));

        System.out.println(String.join(" ",
                "*   *",
                "*   *",
                "*    ",
                "    *"));

        System.out.println(String.join(" ",
                "*   *",
                "*   *",
                "*    ",
                "*   *"));

        System.out.println(String.join(" ",
                " * ",
                " * ",
                "*    ",
                "** "));
    }
}
