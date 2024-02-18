// Написать программу, определяющую правильность расстановки скобок в выражении.

// Пример 1: a+(d*3) - истина

// Пример 2: [a+(1*3) - ложь

// Пример 3: [6+(3*3)] - истина

// Пример 4: {a}[+]{(d*3)} - истина

// Пример 5: <{a}+{(d*3)}> - истина

// Пример 6: {a+]}{(d*3)} - ложь


public class sem5_z3 {
    static boolean task2AnyBracket(String str){
        Map<Character, Character> map = new HashMap<>();
        map.put('<','>');
        map.put('[',']');
        map.put('{','}');
        map.put('(',')');
        char[] c = str.toCharArray();
        Stack<Character> stack = new Stack<>();//(2/4(1*9)(3-3)) -> (({< >
        for (int i = 0; i < c.length; i++) {
        if(map.containsKey(c[i])) stack.push(c[i]);
        if(map.containsValue(c[i])){
        if(stack.isEmpty() || map.get(stack.pop()) != c[i]) return false;
        }
}
