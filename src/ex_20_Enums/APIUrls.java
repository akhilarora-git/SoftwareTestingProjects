package ex_20_Enums;

// Define an Enum called APIUrls to represent a fixed set of URLs (used often in API testing, config, etc.)
public enum APIUrls {

    // These are enum constants (like predefined objects of the enum class)
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    // 🟡 This is a private instance variable associated with each enum constant
    private String url;

    // 🔵 Constructor for the enum (called automatically for each constant above)
    // Note: Enum constructors are implicitly private
    APIUrls(String url) {
        this.url = url;
    }

    // 🟣 A method to access the private `url` field — just like a getter in classes
    String getUrl() {
        return this.url;
    }
}
