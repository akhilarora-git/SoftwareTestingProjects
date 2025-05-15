package ex_18_IIB;

import java.time.LocalDateTime;

public class Lab083_IIB_RealTimeEx {
    public static void main(String[] args) {
        UserSession session1 = new UserSession("Akaal");
    }
}

class UserSession {
    String username;
    LocalDateTime loginTime;

    // IIB: Automatically executes before constructor
    {
        loginTime = LocalDateTime.now(); // Record login time
        System.out.println("IIB: Login timestamp recorded at: " + loginTime);

        // Simulate loading user preferences
        System.out.println("IIB: Loading user preferences...");

        // Simulate writing to audit trail
        System.out.println("IIB: Writing login event to audit log...");
    }

    // Constructor: receives username
    UserSession(String username) {
        System.out.println("Constructor: Assigning username for..." + username);
        this.username = username;
    }
}