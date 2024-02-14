// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).


    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
    
    System.out.print("Введите строку: ");
    String input = scanner.nextLine();
    
    boolean isPalindrome = isPalindrome(input.toLowerCase());
     System.out.Println("Is Palindrome: " + isPalindrome);
    }
    

