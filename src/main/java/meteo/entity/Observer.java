package meteo.entity;

// L'interface Observer
public interface Observer
{
    //La methode de reactions prend en parametres notre objet MeteoData
    void react(MeteoData meteoData);
}
