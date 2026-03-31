package cofre;

import cofre.model.Moeda;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private List<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda moeda){
        this.listaMoedas.add(moeda);
    }

    public void remover(Moeda moeda) {
        boolean removido = listaMoedas.remove(moeda);
        if (!removido) {
            System.out.println("Moeda não encontrada.");
        }
    }

    public void listagemMoedas(){
        for (int i = 0; i < listaMoedas.size(); i++){
            System.out.print(i + " - ");
            listaMoedas.get(i).info();
        }
    }

    public double totalConvertido(){
        double total = 0;

        for (Moeda m : listaMoedas){
            total += m.converter();
        }

        return total;
    }

}
