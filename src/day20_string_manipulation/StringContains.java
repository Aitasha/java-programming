package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));

        if(company.contains(" ")) {
            System.out.println("multiple words company name");
        } else {
            System.out.println("single word company name");
        }
        System.out.println(company.contains("j"));

        String etsyTitle = "Wooden spoon | Etsy";
        if (etsyTitle.contentEquals(" | ")) {
            System.out.println("Pass - title check passed");
        } else {
            System.out.println("Fail - title check failed");
        }

        String firstName = "Ahmed";
        if (firstName.contains("A") && firstName.contains("e")) {
            System.out.println("Name contains A & e");
        }


        String email = "altmana@yandex.ru";
        if (email.contains("@") && email.endsWith(".com")){
            System.out.println("valid email");
        } else {
            System.out.println("invalid email");
        }


        if(email.toLowerCase().contains("d")){
            System.out.println("d is present");
        } else {
            System.out.println("d is not present");
        }
    }
}
