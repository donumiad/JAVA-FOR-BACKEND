public class TempMedia {
    public String mes;
    public double temperaturaMedia;


    public TempMedia(String mes, double d) {
        this.mes = mes;
        this.temperaturaMedia = d;
    }
    public String getMes() {
        return mes;
    }
    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }
    @Override
    public String toString() {
        return "[mes=" + mes + ", temperaturaMedia=" + temperaturaMedia + "]";
    }
    

    
}
