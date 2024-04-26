package meteo.entity;

//La class AfficherMeteo
public class AfficherMeteo implements Observer
{
    public AfficherMeteo() {
    }

    //Redefinie la methode react pour afficher l'objet MeteoData
    public void react(MeteoData meteoData)
    {
        System.out.println(meteoData);
    }

}
