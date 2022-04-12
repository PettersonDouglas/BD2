package model.entity;

import javax.persistence.*;

@Entity
@Table(name = "PRODUTO")
public class Produto {

    public Produto() {
    }

    public Produto(Integer id_produto, String descricao, Float valor) {
        this.id_produto = id_produto;
        this.descricao = descricao;
        this.valor = valor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTO")
    private Integer id_produto;

    @Column(name = "DESCRICAO", nullable = false, length = 45)
    private String descricao;

    @Column(name = "VALOR", nullable = false, length = 45)
    private Float valor;

    public Integer getId_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
        this.id_produto = id_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
