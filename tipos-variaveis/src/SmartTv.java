public class SmartTv {

        boolean ligada = false;
        int canal = 1;
        int volume = 25;

        public void ligar(){
            ligada = true;
        }
        public void desligar(){
            ligada = false;
        }
    
        public void aumentarVolume(){
            volume++;
        }
        public void dimunuirVolume(){
            volume--;
        }
        public void aumentarCanal(){
            canal++;
        }
        public void diminuirCanal(){
            canal--;
        }
        public void escolherCanal(int c){
            canal = c;
        }
        public String estadoTv(){
            String estado = System.out.println("A tv está" + ligada);
            return estado;
        }
}

