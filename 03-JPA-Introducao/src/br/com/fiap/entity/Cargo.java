package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="") //anotação não obrigatória
@SequenceGenerator(name="cargo",sequenceName="SQ_T_CARGO", allocationSize=1)
public class Cargo {

	@Id
	@Column(name="cd_cargo")
	@GeneratedValue(generator="cargo", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="vl_salario", nullable = false)
	private float salario;
	
	@Column(name="ds_nivel")
	private Nivel nivel;
	
	@Column(name="ds_cargo", length = 300)
	private String descricao;
	
	@Column(name="dt_cadastro", updatable = false, nullable = false)
	private Calendar dataCadastro;
	
	
}
