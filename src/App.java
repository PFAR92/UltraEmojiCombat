public class App {
    public static void main(String[] args) throws Exception {
        
        Lutador lutador[] = new Lutador[6]; 

        lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        lutador[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        lutador[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        lutador[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        lutador[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        lutador[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);


        Luta uec01 = new Luta();

        for(Lutador apresentacao : lutador){
            System.out.println(apresentacao);
        }

        uec01.marcarLuta(lutador[0], lutador[1]);
        uec01.lutar();
        System.out.println("=============================");

        uec01.marcarLuta(lutador[2], lutador[3]);
        uec01.lutar();
        System.out.println("=============================");

        uec01.marcarLuta(lutador[4], lutador[5]);
        uec01.lutar();
        System.out.println("=============================");
        
        for(Lutador apresentacao : lutador){
            System.out.println(apresentacao);
        }
        
        
    }
}
