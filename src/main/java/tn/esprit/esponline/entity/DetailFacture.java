package tn.esprit.esponline.entity;
import java.io.Serializable;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detailFacture")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFacture implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "idDetailFacture")
	private Long idDetailFacture;
	
	@Column(name = "qte", nullable = false)
	private Integer qte;
	
	@Column(name = "prixTotal", nullable = false)
	private Float prixTotal;
	
	@Column(name = "pourcentageRemise", nullable = false)
	private Integer pourcentageRemise;
	
	@Column(name = "montantRemise", nullable = false)
	private Integer montantRemise;
	
	@ManyToOne
	Produit produits;
	
	@ManyToOne
	Facture factures;

	
	
}
