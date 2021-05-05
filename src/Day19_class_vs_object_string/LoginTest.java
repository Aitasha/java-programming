package Day19_class_vs_object_string;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "abc123";

        String userName = "CYBERTEK";
        String password = "Abc123";

        if(userName.equalsIgnoreCase(expUserName) && password.equals(expPassword)){
            System.out.println("Pass - user successfully logged in");
    } else {
            if(!userName.equalsIgnoreCase(expUserName)){
                System.out.println("Incorrect Username");
            } else {
                System.out.println("Incorrect password");
            }
        }


    }

}
