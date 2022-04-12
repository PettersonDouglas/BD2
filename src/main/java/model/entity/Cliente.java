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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long id;

    @Column(name = "NOME", nullable = false, length = 45)
    private String nome;

    @Column(name = "cpf", nullable = false, length = 45)
    private String cpf;

    @Column(name = "cnpj", nullable = false, length = 45)
    private String cnpj;

    @Column(name = "tipo_cliente", nullable = false, length = 45)
    private String tipo_cliente;


}
