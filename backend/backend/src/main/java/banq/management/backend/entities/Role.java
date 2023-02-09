package banq.management.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
public class Role {
	 @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	  private Long id;
	
	 @Column(unique = true)
	 private String code;
	 private String label ;
	
	 public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", code=" + code + ", label=" + label + "]";
	}
	 

		
	    

}
