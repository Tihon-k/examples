package Ex11;

import java.util.ArrayList;
import java.util.List;

public class BaseConverter {

    //1-й способ

    //Можно сделать и с помощью обычного массива, тогда
    //можно будет обращаться к конкретному элементу
    //и получать его значения
    public List converter (double t) {
        List temperature = new ArrayList();
        temperature.add("По Цельсию - " + t);
        double k = t+273;
        temperature.add("По Кельвину - " +k);
        double f = 1.8 * t + 32;
        temperature.add("По Фаренгейту - " +f);
        return temperature;
    }
}

    //2-й способ

class Celsius implements Converter {
    @Override
    public double getConverter(double t) {
        return t;
    }
}

class Kelvin implements Converter {
    @Override
    public double getConverter(double t) {
        return t + 273;
    }
}

class Fahrenheit implements Converter{
    @Override
    public double getConverter(double t) {
        return 1.8 * t + 32;
    }
}