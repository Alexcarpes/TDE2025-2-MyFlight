
package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.List;


public class GerenciadorRotas {
    private List<Rota> rotas;

    public GerenciadorRotas() {
        rotas = new ArrayList<>();
    }

    public void adicionar(Rota rota) {
        rotas.add(rota);
    }

    public List<Rota> listarTodas() {
        return new ArrayList<>(rotas);
    }
}
