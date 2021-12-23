package tn.esprit.esponline.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fournisseur")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fournisseur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "idFournisseur")
	private Long idFournisseur;
	
	@Column(name = "codeFournisseur", nullable = false)
	private String codeFournisseur;
	
	@Column(name = "libelleFournisseur", nullable = false)
	private String libelleFournisseur;


	
}
