public class Usuario {

    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        
        smartTv.diminuirVolume();  
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(33);
        System.out.println("Canal atual: " + smartTv.canal);

        
    }
}
