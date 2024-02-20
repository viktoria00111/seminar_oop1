package calculator;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    Calculable min(int arg);
    Calculable del(int arg);
    int getResult();
}