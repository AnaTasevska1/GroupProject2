package GroupProject2;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("yahoo")) {
            this.email = email;
        } else {
            System.out.println("Invalid email! Please provide a Yahoo email.");
        }
    }

    public void setUserName(String userName) {
        if (userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username! Username should be at least 7 characters long.");
        }
    }

    public void setPassword(String password) {
        if (password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid password! Password should be at least 7 characters long " +
                    "and should not contain the username.");
        }
    }

    public static void main(String[] args) {
        Registration registration = new Registration();

        registration.setEmail("test@yahoo.com");
        registration.setUserName("username");
        registration.setPassword("password123");

        System.out.println("Email: " + registration.email);
        System.out.println("Username: " + registration.userName);
        System.out.println("Password: " + registration.password);
    }
}

/*
Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain userName.
 */
