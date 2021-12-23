package tn.esprit.esponline.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detailProduit")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailProduit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "idDetailProduit")
	private Long idDetailProduit;
	
	@Column(name = "dateCreation", nullable = false)
	private Date dateCreation;
	
	@Column(name = "dateDerniereModification", nullable = false)
	private String dateDerniereModification;
	
	@Enumerated(EnumType.STRING)
	private CategorieProduit categorieProduit;
	
	@OneToOne
	private Produit produit;

		
	
}
