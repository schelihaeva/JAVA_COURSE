
// import java.util.HashMap;
// import java.util.Map;
// import java.util.map;


//     public class passport {
//             private Map<String,String> map = new HashMap<>(); // создаем метод map
//     public void add(string pussNum, string LastName){//передаем строку паспотрта с номерои и фамилией
//              map.put (pussNum, LastName); //задаем значение паспорта, имя
//     }   
// public string getbylastname(string LastName){// ищем по фамилии
//            StringBuilder stringBuilder = new StringBuilder(); //облегчаем операцию сложения строк
//            for(var entry : map.entrySet()) {//перебираем все элементы map с помощью var ,entrySet возвращает значеие из map
//                if(entry.getValue().equals(LastName))  //если имя совпадает с заданным значением, то
//               stringBuilder.append(entry.getKey())
//               .append(" : ")
//               .append(entry.getValue())
//               .append( " \n" );
//            }         
//     } 
//             return stringBuilder.toString();
// }
//     public String getByPassNum(String passNum){
//        return passNum +" : " + map.get(passNum);
//     }
//    public String getAll()  {
//        return map.toString();
//       }    
// }
import java.util.HashMap;
import java.util.Map;

public class Passports {
private Map<String, String> map = new HashMap<>();

public void add(String passNum, String lastName){
map.put(passNum, lastName);
}

public String getByLastName(String lastName){
StringBuilder stringBuilder = new StringBuilder();
for(var entry : map.entrySet()){
if(entry.getValue().equals(lastName)){
stringBuilder.append(entry.getKey())
.append(" : ")
.append(entry.getValue())
.append("\n");
}
}
return stringBuilder.toString();
}

public String getByPassNum(String passNum){
return passNum + " : " + map.get(passNum);
}

public String getAll(){
return map.toString();
}
}
