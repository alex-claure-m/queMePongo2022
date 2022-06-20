package Prenda;

import javafx.scene.paint.Material;

public class Prenda {
    private Tipo tipoPrenda;
    private Categoria categoria;
    private Tela tela;
    private Color colorPrimario;
    private Color colorSecundario;

    public Prenda(Tipo tipoPrenda, Material material, Color colorPirmario, Color colorSecundario, Tela tela) {
        
    }

    private boolean chequeoCategoriaCorrectaConSuTipo(){
        return tipoPrenda.equals(categoria);
    }
}
