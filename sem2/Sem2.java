// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.


import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Sem2 {
    public static void main(String[] args) {
    textWriterLog(repeatStr(10, "Test"));
    
    }
static String task0(int n, char c1, char c2){
// Текст задачи:
// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.
StringBuilder stringBuilder = new StringBuilder();
for (int i = 0; i < n / 2; i++) {
stringBuilder.append(c1).append(c2);
}
return stringBuilder.toString();
}

static String task1(String str){//aaaabbbcdd.
StringBuilder stringBuilder = new StringBuilder();
char[] c = str.toCharArray();
Arrays.sort(c);
int count = 0;
for (int i = 1; i < c.length; i++) {
if(c[i] == c[i-1]) count++;
else {
stringBuilder.append(c[i-1]).append(count + 1);
count = 0;
}
}
stringBuilder.append(c[c.length-1]).append(count+1);

return stringBuilder.toString();
}

static boolean task2(String str){
StringBuilder stringBuilder = new StringBuilder(str);
return str.equals(stringBuilder.reverse().toString());
}

static String repeatStr(int n, String str){
return str.repeat(n);
}

static void textWriter(String str){
try {
FileWriter fileWriter = new FileWriter("text.txt", true);
fileWriter.write(str);
fileWriter.write("\n");
fileWriter.flush();
} catch (IOException e) {
e.printStackTrace();

}
}

static void textWriterLog(String str){

Logger logger = Logger.getAnonymousLogger();
try {
FileHandler fileHandler = new FileHandler("log.txt", true);
logger.addHandler(fileHandler);
SimpleFormatter simpleFormatter = new SimpleFormatter();
fileHandler.setFormatter(simpleFormatter);
} catch (IOException e) {
throw new RuntimeException(e);
}

try (FileWriter fileWriter = new FileWriter("/n/n/n/n/n/text.txt", true)){
fileWriter.write(str);
fileWriter.write("\n");
fileWriter.flush();
} catch (IOException e) {
e.printStackTrace();
logger.log(Level.INFO, e.getMessage());
}
}
}
