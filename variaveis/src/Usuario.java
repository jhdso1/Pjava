public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        //ligando a TV
        smartTv.ligar();
        System.out.println("Novo status? " + smartTv.ligada);

        //aumentando o volume
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        //mudando o canal
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
    }
   
}