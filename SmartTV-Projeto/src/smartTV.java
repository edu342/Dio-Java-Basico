public class smartTV {
   boolean ligada = false;
   int canal = 1;
   int volume = 10;  
   public void ligar(){
        ligada = true;
    }
     public void desligar(){
        ligada = false;
    }
    public void volumeAumentar(){
      volume++;
      System.out.println("aumentando o volume para:"+ volume);
    }
    public void volumeDiminuir(){
      volume--;
      System.out.println("Diminuindo volume para:"+ volume);
    }
    public void mudarcanal(int canalAtual){
      canal = canalAtual;
      System.out.println("Mudando para o canal:"+ canal);
    }
}
