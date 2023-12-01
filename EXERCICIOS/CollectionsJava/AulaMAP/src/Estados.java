public class Estados {
    private String estado;
    private double populacao;    

    public Estados(String estado, double populacao) {
        this.estado = estado;
        this.populacao = populacao;
    }

    public String getEstado() {
        return estado;
    }

    public double getPopulacao() {
        return populacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        long temp;
        temp = Double.doubleToLongBits(populacao);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Estados other = (Estados) obj;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (Double.doubleToLongBits(populacao) != Double.doubleToLongBits(other.populacao))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Estados [estado=" + estado + ", populacao=" + populacao + "]";
    }

    
    
}
