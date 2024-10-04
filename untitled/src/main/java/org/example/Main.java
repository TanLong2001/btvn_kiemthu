package org.example;


public class Main {

    public static boolean isAvailable(int age) {
        return age >= 18;
    }
    public static void CheckAge() {
        // Bảng quyết định
        assert isAvailable(17) == false : "Test case 1 failed";
        assert isAvailable(18) == true  : "Test case 2 failed";
        assert isAvailable(19) == true  : "Test case 3 failed";
        assert isAvailable(-1) == false : "Test case 5 failed";
        assert isAvailable(100) == true  : "Test case 6 failed";
        assert isAvailable(1)   == false : "Test case 7 failed";

        System.out.println("Test success!");
    }
    public static void main(String[] args) {
        CheckAge();
    }
}