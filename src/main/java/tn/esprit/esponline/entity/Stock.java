package tn.esprit.esponline.entity;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "stock")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stock implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "idStock")
	private Long idStock;
	
	@Column(name = "qteStock", nullable = false)
	private Integer qteStock;
	
	@Column(name = "qteMin", nullable = false)
	private Integer qteMin;
	
	@Column(name = "libelleStock", nullable = false)
	private String libelleStock;

	@OneToMany(mappedBy="stocks")
	private Set<Produit> produits;
	
}
