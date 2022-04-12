package model.entity;

import javax.persistence.*;

@Entity
@Table(name = "FORNECEDOR")
public class Fornecedor {
    public Fornecedor() {
    }

    public Fornecedor(Integer id_fornecedor, String nome) {
        this.id_fornecedor = id_fornecedor;
        this.nome = nome;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FORNECEDOR")
    private Integer id_fornecedor;

    @Column(name = "NOME", nullable = false, length = 45)
    private String nome;

    public Integer getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(Integer id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
