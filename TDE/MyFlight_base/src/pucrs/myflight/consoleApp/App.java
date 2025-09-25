package pucrs.myflight.consoleApp;

import java.time.Duration;
import java.time.LocalDateTime;
import pucrs.myflight.modelo.*;

public class App {
    public static void main(String[] args) {
        CiaAerea latam = new CiaAerea("LAT", "Latam Airlines");
        CiaAerea azul = new CiaAerea("AZU", "Azul Linhas Aéreas");

        //naves
        Aeronave airbus = new Aeronave("ZZZZZZZ", "Veiculo 1");
        Aeronave embraer = new Aeronave("XXXXXX", "Veiculo 2");

        //pistas
        Geo geoPOA = new Geo(-30.0, -51.0);
        Geo geoGRU = new Geo(-23.0, -46.0);
        Aeroporto poa = new Aeroporto("POA", "Salgado Filho", geoPOA);
        Aeroporto gru = new Aeroporto("GRU", "Guarulhos", geoGRU);

        //caminhos
        Rota rota1 = new Rota(latam, poa, gru, airbus);
        Rota rota2 = new Rota(azul, gru, poa, embraer);

        //voos
        LocalDateTime dh1 = LocalDateTime.of(2025, 9, 2, 8, 30);
        LocalDateTime dh2 = LocalDateTime.of(2025, 9, 2, 15, 45);
        	Duration duracao = Duration.ofMinutes(120);
				Voo voo2 = new Voo(rota2, dh2, duracao);
				Voo voo1 = new Voo(rota1, dh1, duracao);

        


        System.out.println("Voo 1: " + voo1.getRota().getCia().getNome()  + //kkkkkk não imaginei que poderia usar metodo.metodo.metodo tantasvezes
            " de " + voo1.getRota().getOrigem().getNome() +
            " para " + voo1.getRota().getDestino().getNome() + 
            " quando " + voo1.getDatahora());

        System.out.println("Voo 2: " + voo2.getRota().getCia().getNome() +
            " de " +voo2.getRota().getOrigem().getNome()+
            " para " + voo2.getRota().getDestino().getNome()+
            " quando " + voo2.getDatahora());
    }
}