package elementoMultimediale;

class Audio extends ElementoMultimediale implements IRiproducibile, IRegolaVolume{

    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume){

        super(titolo);
        this.durata=durata;
        this.volume=volume;
    }

    @Override
    public void alzaVolume(){
        volume++;
    }

    @Override
    public void abbassaVolume(){
        if(volume > 0) volume--;
    }

    @Override
    public void play(){
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + "!".repeat(volume));
        }
    }

    @Override
    public void show() {
        play();
    }
}
