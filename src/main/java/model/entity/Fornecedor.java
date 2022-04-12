package model.entity;

import javax.persistence.*;

@Entity
@Table(name = "FORNECEDOR")
public class Fornecedor {
    public Fornecedor() {
    }

    public Fornecedor(Integer idFornecedor, String nome) {
        this.idFornecedor = idFornecedor;
        this.nome = nome;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FORNECEDOR")
    private Integer idFornecedor;

    @Column(name = "NOME", nullable = false, length = 45)
    private String nome;

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
