package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekStudent", "abc123");///positive test
        loginVoid("cybertek", "abc");//negative test, rainy days scenario
        loginVoid("","");
        //System.out.println(loginVoid("cybertekStudent", "abc123"));ERROR-VOID no return value


        System.out.println(login("cybertekStudent", "abc123"));
        if(login("cybertekStudent", "abc123")) {
            System.out.println("login successfull, welcome to Canvas");
            System.out.println("select the course to continue");
        } else {
            System.out.println("Login failed");
        }


        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);


        if(login("nadir", "mountain")) {
            System.out.println("Welcome to Canvas, select course or calendar");
        } else {
            System.out.println("Something wrong with your credentials");
        }


    }

    public static void loginVoid (String username, String password) {
                if(username.equals("cybertekStudent") && password.equals("abc123")) {
            System.out.println("Login Successful, welcome cybertekStudent");
        } else {
            System.out.println("Incorrect username or password");
        }
    }


    public static boolean login(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        if(userName.equalsIgnoreCase(secretUserName) && password.equalsIgnoreCase(secretPassword)) {
             return true;
    }
             return false;

    }


}
