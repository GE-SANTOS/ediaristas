package br.com.treinaweb.ediaristas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Diarista {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false, length = 100)
private String nomeCompleto;

@Column(nullable = false, unique = true, length = 11)
private String cpf;

@Column(nullable = false, unique = true)
private String email;

@Column(nullable = false, length = 11)
private String telefone;

@Column(nullable = false)
private String logradouro;

@Column(nullable = false)
private String numero;

@Column(nullable = false)
private String bairro;

@Column(nullable = true)
private String complemento;

@Column(nullable = false, length = 8)
private String cep;

@Column(nullable = false)
private String cidade;

@Column(nullable = false, length = 2)
private String estado;

@Column(nullable = false)
private String codigoIbge;
    
}
