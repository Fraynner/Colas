package Colas;

public class ObjFastFood {
    int NumOrden ;
    String TipoComida;
    Double Precio;
    int Cantidad;
   
    public int getNumOrden() {
        return NumOrden;
    }

    public void setNumOrden(int numOrden) {
        NumOrden = numOrden;
    }

    public String getTipoComida() {
        return TipoComida;
    }

    public void setTipoComida(String tipoComida) {
        TipoComida = tipoComida;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public ObjFastFood(ObjFastFood o) {
        this.NumOrden = o.NumOrden;
        this.TipoComida = o.TipoComida;
        this.Precio = o.Precio;
        this.Cantidad = o.Cantidad;
    }


}