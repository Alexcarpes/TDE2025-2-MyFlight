package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorVoos {
    private List<Voo> voos;

    public GerenciadorVoos() {
        voos = new ArrayList<>();
    }

    public void adiciona(Voo voo) {
        voos.add(voo);
    }

    public List<Voo> listaTodos() {
        return new ArrayList<>(voos);
    }
}
