package tn.esprit.esponline.entity;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "facture")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "idFacture")
	private Long idFacture;
	
	@Column(name = "montantRemise", nullable = false)
	private Float montantRemise;
	
	@Column(name = "montantFacture", nullable = false)
	private Float montantFacture;
	
	@Column(name = "dateFacture", nullable = false)
	private Date dateFacture;
	
	@Column(name = "active", nullable = false)
	private Boolean active;
	
	@ManyToOne
	@JsonIgnore
	Client clients;
	
	@OneToMany(mappedBy="factures")
	private Set<DetailFacture> detailFactures;

	
}
