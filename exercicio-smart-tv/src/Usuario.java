
public class Usuario {


    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligarTv();
        smartTv.ligarTv();
        smartTv.desligarTv();
        smartTv.desligarTv();
        smartTv.aumentarVolume();
        smartTv.ligarTv();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.desligarTv();
        smartTv.diminuirVolume();
        smartTv.ligarTv();
        smartTv.avancarCanal();
        smartTv.avancarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();
        smartTv.mudarCanal(50);
        smartTv.avancarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();

    }
}