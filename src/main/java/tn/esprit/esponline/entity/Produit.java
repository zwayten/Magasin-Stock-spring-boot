package tn.esprit.esponline.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "produit")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "idProduit")
	private Long idProduit;
	
	@Column(name = "codeProduit", nullable = false)
	private String codeProduit;
	
	@Column(name = "libelleProduit", nullable = false)
	private String libelleProduit;
	
	@Column(name = "prixUnitaire", nullable = false)
	private Float prixUnitaire;

	@ManyToOne
	private Rayon rayons;
	
	@ManyToOne
	private Stock stocks;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Fournisseur> fournisseurs;
	
	@OneToOne(mappedBy="produit")
	private DetailProduit detailProduit;
	
	@OneToMany(mappedBy="produits")
	private Set<DetailFacture> detailFactures;
	
}
