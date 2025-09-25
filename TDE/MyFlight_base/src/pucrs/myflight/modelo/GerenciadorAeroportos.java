package pucrs.myflight.modelo;

import java.util.ArrayList; //visto em alest 1
import java.util.List; //docs.oracle.com

public class GerenciadorAeroportos {
    private List<Aeroporto> aeroportos;

    public GerenciadorAeroportos() {
        aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aeroporto) {
        aeroportos.add(aeroporto);
    }

    public List<Aeroporto> listarTodos() {
        return new ArrayList<>(aeroportos);
    }

    public Aeroporto buscarPorCodigo(String codigo) {
        for (Aeroporto aeroporto : aeroportos) {
            if (aeroporto.getCodigo().equalsIgnoreCase(codigo)) {
                return aeroporto;
            }
        }
        return null;
    }
}
