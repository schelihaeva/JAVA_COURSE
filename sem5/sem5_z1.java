// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

// 123456 Иванов

// 321456 Васильев

// 234561 Петрова

// 234432 Иванов

// 654321 Петрова

// 345678 Иванов

// Вывести данные по сотрудникам с фамилией Иванов.


public class sem5_z1 {
    public static void main(String[] ags){
        task0();
    }

private static void task0() {
    
Passport Passport = new Passport();
Passport. add(pussNum:"123456", LastName:"Иванов");
Passport. add(pussNum:"321456", LastName:"Васильев");
Passport. add(pussNum:"234561", LastName:"Петрова");
Passport. add(pussNum:"234432", LastName:"Иванов");
Passport. add(pussNum:"654321", LastName:"Петрова");
Passport. add(pussNum:"345678", LastName:"Иванов");
System.out.println(passport.getAll());
System.out.println(passport.getByPassNum("321456"));
System.out.println(passport.getbylastname("Васильев"));
}
}