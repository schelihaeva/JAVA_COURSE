import java.util.*;
import java.util.Map.Entry;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        addContact(phoneBook, "Грачева", "925-274");
        addContact(phoneBook, "Симонов", "589-123");
        addContact(phoneBook, "Онегин", "247-963");
        addContact(phoneBook, "Ишакова", "897-111");
        addContact(phoneBook, "Крупин", "852-478");

        printPhoneBook(phoneBook);
    }

    private static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        // Если имя уже существует в книге, добавляем телефон к существующему списку
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }

    private static void printPhoneBook(Map<String, List<String>> phoneBook) {

        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(PhoneBook.entrySet());

        entries.sort(Comparator.comparingInt(entry -> ((Entry<String, List<String>>) entry).getValue().size()));

        for (int i = entries.size() - 1; i >= 0; i--) {
            Map.Entry<String, List<String>> entry = entries.get(i);
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();

            System.out.println(name + ": " + phoneNumbers);
        }
    }

    private static Object entrySet() {
        return null;
    }
}
