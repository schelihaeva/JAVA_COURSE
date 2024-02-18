import java.util.HashMap;
import java.util.Map;

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом

// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)

// Пример 1:

// Input: s = "foo", t = "bar"

// Output: false

// Пример 2:

// Input: s = "paper", t = "title"

// Output: true
public class sem5_z2 {
    /**
     * @param ags
     */
    public static void main(String[] ags){
        extracted();
    }
    private static void extracted() {
        System.out.println(task1("papper", "title"));
    }

    }
// public class sem5_z2 {


//   /**
//  * @param str1
//  * @param str2
//  * @return
//  */
static boolean task1(String str1, String str2){
      Map<Character, Character> map = new HashMap<>();
      if(str1.length() != str2.length()) return false; // проверка на равенство длинны, если не равны, то завершаем процесс
      char[] c1 = str1.toCharArray(); // так как 2 строки, создаем 2 массива c1  и c2, по которым будем проходиться
      char [] c2 = str2.toCharArray();
      for(int i = 0, i < c1.length; i++){
        if(map.containsKey(c1[i])){
            if(c2[i] != map.get(c1[i])) return false; //если символы не соответтсуют, то ложь
        }
      } else{
        map.put(c1[i], c2[i]); //создаем правило, записываем вместо с1 на с2 (замена символов)
      }
}

 return true;
}

