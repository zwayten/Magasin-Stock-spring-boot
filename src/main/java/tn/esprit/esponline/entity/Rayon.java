package tn.esprit.esponline.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rayon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rayon implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "idRayon")
	private Long idRayon;
	
	@Column(name = "codeRayon", nullable = false)
	private String codeRayon;
	
	@Column(name = "libelleRayon", nullable = false)
	private String libelleRayon;

	@OneToMany(mappedBy="rayons")
	private Set<Produit> produits;
	
	
	
}
