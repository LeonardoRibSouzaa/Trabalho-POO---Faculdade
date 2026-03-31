package cofre.model;

public class Real extends Moeda{
    public Real(double valor){
        super.valor = valor;

    }

    public void info(){
        System.out.println("Real: R$"+super.valor);
    }

    public double converter(){
        return valor * 1.0;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Real d = (Real) obj;
        return this.valor == d.valor;
    }

}