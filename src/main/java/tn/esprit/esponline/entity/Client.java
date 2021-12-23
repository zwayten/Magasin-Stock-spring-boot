package tn.esprit.esponline.entity;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "client")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "idClient")
	private Long idClient;
	
	@Column(name = "nom", nullable = false)
	private String nom;
	
	@Column(name = "prenom", nullable = false)
	private String prenom;
	
	@Column(name = "dateNaissance", nullable = false)
	private Date dateNaissance;

	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	private CategorieClient categorieClient;
	
	@Enumerated(EnumType.STRING)
	private Profession profession;
	
	@OneToMany(mappedBy="clients")
	private Set<Facture> factures;
	
	
	
	
}
