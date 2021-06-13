package day52_inheritance.DiscordUsers;

public class Admin extends User{


    public Admin(String name, int id){
        super("Admin", name, id); //we're calling parent class constructor
        System.out.println("Admin class 2 args constructor");
    }


    public Admin(){
        super(); //call super class/User class no-args constructor
        System.out.println("Admin class constructor");
    }


    @Override
    public String toString() {
        return "Admin{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }



}
