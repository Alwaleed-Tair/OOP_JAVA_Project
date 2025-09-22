import java.util.*;

public class User {
    protected int userID;
    protected String password;
    protected String name;
    protected boolean loginStatus;

    public User(int userID, String password, String name) {
        this.userID = userID;
        this.password = password;
        this.name = name;
        this.loginStatus = false;
    }

    public boolean login(String password) {
        if (this.password.equals(password)) {
            loginStatus = true;
            System.out.println(Main.GREEN_COLOR + "Login successful." + Main.ENDC);
            return true;
        }
        System.out.println(Main.RED_COLOR + "Login failed. Incorrect password." + Main.ENDC);
        return false;
    }

    public void logout() {
        loginStatus = false;
        System.out.println(Main.GREEN_COLOR + "Logged out successfully." + Main.ENDC);
    }

    public void updateProfile(String newName, String newPassword) {
        this.name = newName;
        this.password = newPassword;
        System.out.println(Main.GREEN_COLOR + "Profile updated successfully." + Main.ENDC);
    }

    public void viewAllEvents(List<Event> events) {
        System.out.println(Main.RED_COLOR + "All Events:" + Main.ENDC);
        for (Event event : events) {
            System.out.println(event.getEventDetails());
        }
    }

    public void myProfile() {
        System.out.println(Main.CYAN_COLOR + "User Profile:" + Main.ENDC);
        System.out.println(Main.CYAN_COLOR + "User ID: " + Main.ENDC + userID);
        System.out.println(Main.CYAN_COLOR + "Name: " + Main.ENDC + name);
        System.out.println(Main.CYAN_COLOR + "Login Status: " + (loginStatus ? "Logged In" : "Logged Out" + Main.ENDC));
    }
}