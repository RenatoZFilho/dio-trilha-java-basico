public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarTv(){
        System.out.println();
        if (ligada == true) {
            System.out.println("TV Já esta ligada!");
        }
        else {
            ligada = true;
            System.out.println("TV acaba de ser ligada!");
        }
    }

    public void desligarTv(){
        System.out.println();
        if (ligada == false) {
            System.out.println("TV Já está desligada!");
        }
        else {
            ligada = false;
            System.out.println("TV acaba de ser desligada!");
        }

    }

    public void aumentarVolume(){
        System.out.println();
        if (ligada == true){
            System.out.println("Volume aumentado de " + volume + " para " + ++volume);
        }
        else {
            System.out.println("A TV está desligada, não é possível aumentar o volume.");
        }
    }

    public void diminuirVolume(){
        System.out.println();
        if (ligada == true){
            System.out.println("Volume diminuido de " + volume + " para " + --volume);
        }
        else {
            System.out.println("A TV está desligada, não é possível diminuir o volume.");
        }
    }

    public void avancarCanal(){
        System.out.println();
        if (ligada == true){
            System.out.println("Canal alterado de " + canal + " para " + ++canal);
        }
        else {
            System.out.println("A TV está desligada, não é possível alterar o canal.");
        }
    }

    public void voltarCanal(){
        System.out.println();
        if (ligada == true){
            System.out.println("Canal alterado de " + canal + " para " + --canal);
        }
        else {
            System.out.println("A TV está desligada, não é possível alterar o canal.");
        }
    }

    public void mudarCanal(int numeroCanal){
        System.out.println();
        if (ligada == true){
            System.out.println("Canal alterado de " + canal + " para " + numeroCanal);
            canal = numeroCanal;
        }
        else {
            System.out.println("A TV está desligada, não é possível alterar o canal.");
        }
    }



}
