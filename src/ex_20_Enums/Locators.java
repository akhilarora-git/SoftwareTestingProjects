package ex_20_Enums;

// ✅ Enum to define fixed UI locators (like CSS selectors or XPath)
public enum Locators {

    // 1️⃣ Enum constants (each assigned a specific locator value)
    page_button("#btn"),
    page_input("#input1");

    // 2️⃣ Private variable to store the locator value
    private String locators;

    // 3️⃣ Constructor for the enum (runs once per constant)
    //    This assigns the value passed (e.g., "#btn") to the private variable
    Locators(String locators) {
        this.locators = locators;
    }

    // 4️⃣ Public method to get the locator value
    //    Used in main class to access the locator
    public String getLocators() {
        return this.locators;
    }
}
