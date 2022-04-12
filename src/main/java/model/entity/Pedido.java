package model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PEDIDO")
public class Pedido {

    public Pedido() {
    }

    public Pedido(Integer id_pedido, Date data, Integer cliente_id_cliente) {
        this.id_pedido = id_pedido;
        this.data = data;
        this.cliente_id_cliente = cliente_id_cliente;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PEDIDO")
    private Integer id_pedido;

    @Column(name = "DATA", nullable = false, length = 45)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @JoinColumn(name = "CLIENTE_ID_CLIENTE", referencedColumnName = "ID_CLIENTE")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Integer cliente_id_cliente;

    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getCliente_id_cliente() {
        return cliente_id_cliente;
    }

    public void setCliente_id_cliente(Integer cliente_id_cliente) {
        this.cliente_id_cliente = cliente_id_cliente;
    }
}
