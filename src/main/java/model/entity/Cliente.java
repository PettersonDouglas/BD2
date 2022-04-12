package model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 3387642521978418140L;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String cpf, String cnpj, String tipoCliente) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.tipoCliente = tipoCliente;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long id;

    @Column(name = "NOME", nullable = false, length = 45)
    private String nome;

    @Column(name = "CPF", nullable = false, length = 45)
    private String cpf;

    @Column(name = "CNPJ", nullable = false, length = 45)
    private String cnpj;

    @Column(name = "TIPO_CLIENTE", nullable = false, length = 45)
    private String tipoCliente;

    private Carteira carteiraCliente;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Carteira getCarteiraCliente() {
        return carteiraCliente;
    }

    public void setCarteiraCliente(Carteira carteiraCliente) {
        this.carteiraCliente = carteiraCliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
