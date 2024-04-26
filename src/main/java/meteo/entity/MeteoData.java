package meteo.entity;

import java.util.ArrayList;
import java.util.List;

public class MeteoData
{
    private double humidite;
    private double temperature;
    private double pluie;

    //La liste des observateurs
    private List<Observer> observers;

    public MeteoData() {
        //On initialise la liste
        observers = new ArrayList<>();
    }

    public MeteoData(double humidite, double temperature, double pluie) {
        //On initialise la liste
        observers = new ArrayList<>();

        this.humidite = humidite;
        this.temperature = temperature;
        this.pluie = pluie;
    }


    /**
     * Ajoute dans la liste des observateurs
     * @param observer toutes les classes implementant l'interface
     * Observer
     */
    public void add(Observer observer)
    {
        
        this.observers.add(observer);
    }

    /**
     * Fais reagir tous les observateurs
     */
    private void informer()
    {
        observers.forEach(observer -> observer.react(this));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("humidite = ").append(humidite).append(" %");
        sb.append(", temperature = ").append(temperature).append(" °C");
        sb.append(", pluie = ").append(pluie).append(" m3");
        return sb.toString();
    }

    public double getHumidite() {
        return humidite;
    }

    public MeteoData setHumidite(double humidite) {
        this.humidite = humidite;
        //on appelle les observateurs
        informer();
        return this;
    }

    public double getTemperature() {
        return temperature;
    }

    public MeteoData setTemperature(double temperature) {
        this.temperature = temperature;
        //on appelle les observateurs
        informer();
        return this;
    }

    public double getPluie() {
        return pluie;
    }

    public MeteoData setPluie(double pluie) {
        this.pluie = pluie;
        //on appelle les observateurs
        informer();
        return this;
    }
}
