package Enum;

public class MainEnum {
    public static void main(String[] args) {
        VideoGames deportivos= VideoGames.DEPORTIVOS;
        VideoGames estrategia= VideoGames.ESTRATEGIA;
        VideoGames musicales= VideoGames.MUSICALES;
        VideoGames aventura= VideoGames.AVENTURA;
        VideoGames simulacion= VideoGames.SIMULACION;

        System.out.println("DEPORTIVOS\n");
        deportivos.Servicio();
        deportivos.showPositionRanking();
        deportivos.buyCoins();
        System.out.println("________________________________________");

        System.out.println("ESTRATEGIA\n");
        estrategia.Servicio();
        estrategia.showPositionRanking();
        estrategia.buyCoins();
        System.out.println("________________________________________");

        System.out.println("MUSICALES\n");
        musicales.Servicio();
        musicales.showPositionRanking();
        musicales.buyCoins();
        System.out.println("________________________________________");

        System.out.println("AVENTURA\n");
        aventura.Servicio();
        aventura.showPositionRanking();
        aventura.buyCoins();
        System.out.println("________________________________________");

        System.out.println("SIMULACION\n");
        simulacion.Servicio();
        simulacion.showPositionRanking();
        simulacion.buyCoins();
        System.out.println("________________________________________");
    }
}
