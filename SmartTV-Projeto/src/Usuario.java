public class Usuario {
  public static void main(String[] args) throws Exception {
    smartTV SmartTV = new smartTV();

    SmartTV.ligar();
    System.out.println("Novo Status-> ligada ?" + SmartTV.ligada);

    SmartTV.volumeAumentar();
    SmartTV.volumeAumentar();
    System.out.println("Novo Status-> volume aumentado ?" + SmartTV.volume);

    SmartTV.mudarcanal(12);

    SmartTV.volumeDiminuir();
    System.out.println("Novo Status-> volume diminuido ?" + SmartTV.volume);
    
    SmartTV.mudarcanal(9);
    SmartTV.desligar();
    System.out.println("Novo Status-> ligada ?" + SmartTV.ligada);
  }
}
