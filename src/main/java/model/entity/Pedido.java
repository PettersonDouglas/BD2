package model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PEDIDO")
public class Pedido {

    public Pedido() {
    }

    public Pedido(Integer idPedido, Date data, Integer clienteIdCliente) {
        this.idPedido = idPedido;
        this.data = data;
        this.clienteIdCliente = clienteIdCliente;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PEDIDO")
    private Integer idPedido;

    @Column(name = "DATA", nullable = false, length = 45)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @JoinColumn(name = "CLIENTE_ID_CLIENTE", referencedColumnName = "ID_CLIENTE")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Long clienteIdCliente;

    @Column(name = "VALOR_UNIDADE", nullable = false)
    private Float valorUnidade;

    public Float getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(Float valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getClienteIdCliente() {
        return clienteIdCliente;
    }

    public void setClienteIdCliente(Long clienteIdCliente) {
        this.clienteIdCliente = clienteIdCliente;
    }
}
