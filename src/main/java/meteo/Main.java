package meteo;

import meteo.entity.AfficherMeteo;
import meteo.entity.MeteoData;
import meteo.entity.Moyenne;

public class Main {
    public static void main(String[] args)
    {
        //Creation des objets meteos
        MeteoData lome = new MeteoData(25, 30, 10);
        MeteoData kara = new MeteoData(15, 20, 12);

        //Observateur pour afficher
        AfficherMeteo meteo = new AfficherMeteo();
        //Observateur pour calculer la moyenne
        Moyenne moyenne = new Moyenne();

        //On affiche pour voir
        meteo.react(lome);
        meteo.react(kara);

        System.out.println();

        //On ajoute les obervateurs sur lomé
        lome.add(meteo);
        lome.add(moyenne);

        //On ajoute l'observateur pour afficher sur kara
        kara.add(meteo);

        //On modifie pour voir le patron(Patter Observer) en action
        lome.setHumidite(77);
        kara.setTemperature(32);
        lome.setTemperature(80);
    }
}
