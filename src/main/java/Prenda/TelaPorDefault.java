package Prenda;

public class TelaPorDefault {
    private Tela unaTela;

    public TelaPorDefault(Tela unaTela) {
        this.unaTela = unaTela;
    }
    //Patron
    public TelaPorDefault(){
        this.unaTela=Tela.ALGODON;
    }
}
