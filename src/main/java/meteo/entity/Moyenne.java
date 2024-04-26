package meteo.entity;

//La classe Moyenne
public class Moyenne implements Observer
{
    public static final int MAX_TEMP = 50;

    public Moyenne() {}

    //Redefinie la methode react pour calculer la moyenne
    public void react(MeteoData data)
    {
        System.out.println("La moyenne = " + (data.getTemperature() + MAX_TEMP) / 2);
    }
}
