package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("ayta", "yandex");
        buildEmail("John Ward III", "Verizon");
    }
    public static void buildEmail(String name, String domain) {
        System.out.println("Email: " + name.replace(" ", "_").toLowerCase() + "@" + domain.toLowerCase() + ".com");
    }
}
