package cofre.model;

public class Euro extends Moeda{
    public Euro(double valor){
        super.valor = valor;

    }

    public void info(){
        System.out.println("Euro: €"+super.valor);
    }

    public double converter(){
        return valor * 6.0;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Euro d = (Euro) obj;
        return this.valor == d.valor;
    }

}