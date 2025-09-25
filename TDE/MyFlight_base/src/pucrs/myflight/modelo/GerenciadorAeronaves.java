package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorAeronaves {

    // Exemplo de implementação básica
    private List<Aeronave> aeronaves = new ArrayList<>();

    public void adicionarAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }

    public List<Aeronave> listarAeronaves() {
        return new ArrayList<>(aeronaves);
    }

    public Aeronave buscarPorCodigo(String codigo) {
        for (Aeronave a : aeronaves) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                return a;
            }
        }
        return null;
    }
}
