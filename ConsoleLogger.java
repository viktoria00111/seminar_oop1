package calculator;

import java.lang.System.Logger;

public class ConsoleLogger implements Loggable{
    public void log(String messege){
        System.out.println("LOG" + messege);
    }
}