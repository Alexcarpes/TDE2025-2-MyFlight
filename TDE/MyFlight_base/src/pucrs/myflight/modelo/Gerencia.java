package pucrs.myflight.modelo;

public class Gerencia {
    private final GerenciadorCias gerenciadorCias;
    private final GerenciadorAeronaves gerenciadorAeronaves;
    private final GerenciadorAeroportos gerenciadorAeroportos;
    private final GerenciadorRotas gerenciadorRotas;

    public Gerencia(GerenciadorCias gc, GerenciadorAeroportos ga, GerenciadorAeronaves gan, GerenciadorRotas gr) {
        this.gerenciadorCias = gc;
        this.gerenciadorAeroportos = ga;
        this.gerenciadorAeronaves = gan;
        this.gerenciadorRotas = gr;
    }

    public void cadastrarNovaRota(String codigoCia, String codigoOrigem, String codigoDestino, String codigoAeronave) {
        CiaAerea cia = gerenciadorCias.buscarPorCodigo(codigoCia);// erro? 
        Aeroporto origem = gerenciadorAeroportos.buscarPorCodigo(codigoOrigem);
        Aeroporto destino = gerenciadorAeroportos.buscarPorCodigo(codigoDestino);
        Aeronave aeronave = gerenciadorAeronaves.buscarPorCodigo(codigoAeronave);

        if (cia != null && origem != null && destino != null && aeronave != null) {
            Rota novaRota = new Rota(cia, origem, destino, aeronave);
            gerenciadorRotas.adicionar(novaRota);
            System.out.println("Rota cadastrada com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar rota: dados inválidos.");
        }
    }
    public GerenciadorCias getGerenciadorCias() {
        return gerenciadorCias;
    }

    public GerenciadorAeroportos getGerenciadorAeroportos() {
        return gerenciadorAeroportos;
    }

    public GerenciadorAeronaves getGerenciadorAeronaves() {
        return gerenciadorAeronaves;
    }

    public GerenciadorRotas getGerenciadorRotas() {
        return gerenciadorRotas;
    }

    @Override
    public String toString() {
        return "Gerencia{" + //não sei fazer toString aqui. AJuda para o Gemini.google.com/
                "gerenciadorCias=" + gerenciadorCias +
                ", gerenciadorAeronaves=" + gerenciadorAeronaves +
                ", gerenciadorAeroportos=" + gerenciadorAeroportos +
                ", gerenciadorRotas=" + gerenciadorRotas +
                '}';
    }
}