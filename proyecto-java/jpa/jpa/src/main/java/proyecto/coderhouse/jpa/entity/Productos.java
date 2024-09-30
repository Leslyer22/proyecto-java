package proyecto.coderhouse.jpa.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "PRODUCTOS")
public class Productos {

    public Productos() {}

    public Productos(String descripcion, String codigo , double precio, int stock) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "CODIGO")
    private String codigo;

    @Column(name = "PRECIO")
    private double precio;

    @Column(name = "STOCK")
    private int stock;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
