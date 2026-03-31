package cofre.model;

public class Dolar extends Moeda{

    public Dolar(double valor){
        super.valor = valor;

    }

    public void info(){
        System.out.println("Dolar: $"+super.valor);
    }

    public double converter(){
        return valor * 5.0; // exemplo
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Dolar d = (Dolar) obj;
        return this.valor == d.valor;
    }

}
