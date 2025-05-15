package ex_20_Enums;

public class Lab090_Enum_Calling {
        public static void main(String[] args) {

            // ✅ Calling enum constants from APIUrls and using the getUrl() method to fetch stored URLs
            System.out.println(APIUrls.google.getUrl());     // prints: https://google.com
            System.out.println(APIUrls.vwo.getUrl());        // prints: https://app.vwo.com
            System.out.println(APIUrls.katalon.getUrl());    // prints: https://katalon.com

            System.out.println(" -- ");

            // ✅ Calling enum constants from Colors and using getHexCode() to get color hex codes
            System.out.println(Colors.RED.getHexCode());     // prints: #FF0000
            System.out.println(Colors.GREEN.getHexCode());   // prints: #61FF33

            System.out.println("----");

            // ✅ Calling enum constants from Locators to get the UI locator values (e.g. ID or XPath)
            System.out.println(Locators.page_button.getLocators()); // prints: #btn
            System.out.println(Locators.page_input.getLocators());  // prints: #input1
        }
    }