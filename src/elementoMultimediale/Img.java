package elementoMultimediale;

public class Img extends ElementoMultimediale{

    private int luminosita;

    public Img (String titolo, int luminosita){
        super(titolo);
        this.luminosita=luminosita;
    }

    public void aumentaLuminosita(){
        luminosita++;
    }

    public void diminuisciLuminosita(){
        if(luminosita>0) luminosita--;
    }

    @Override
    public void show() {
        System.out.println(getTitolo() + " " + "*".repeat(luminosita));
    }

}
