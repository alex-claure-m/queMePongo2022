package Prenda;

import javafx.scene.paint.Material;

public class Borrador {
    //paso previo al Builder
    private Tipo tipoPrenda;
    private Material material;
    private Color colorPirmario;
    private Color colorSecundario;
    private Tela tela;

    /*
    * aclara de que debe tener obligatoriamente tipoPrenda, coloPrimario
    * */
    public Borrador(Tipo tipoPrenda, Color colorPirmario) {
        this.tipoPrenda = tipoPrenda;
        this.colorPirmario = colorPirmario;
    }
    public void materialDeLaPrenda(Material unMaterial) {
        this.validarQueNoSeaNulo(unMaterial);
        this.material = unMaterial;
    }
    public void colorSecundarioDeLaPrenda(Color colorSecundario){
        this.validarColorSecundario(colorSecundario);
        this.colorSecundario = colorSecundario;
    }
    public void telaDeLaPrenda(Tela unaTela){
        this.validarTela(tela);
        this.tela=tela;
    }
    public boolean validarQueNoSeaNulo(Material unMaterial) {
        return unMaterial != null;
        }
    public boolean validarColorSecundario(Color colorSecu){
        return colorSecu != null;
    }
    public boolean validarTela(Tela unaTela){
        return unaTela != null;
    }

    public Prenda crearPrenda(){
        return new Prenda(tipoPrenda,material,colorPirmario,colorSecundario,tela);
        }
    }


