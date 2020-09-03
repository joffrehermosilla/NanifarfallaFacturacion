package joffre.NanifarfallaRest.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "role")
@EntityListeners(AuditingEntityListener.class)
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_role;
	@NotBlank
	String name;
	@NotBlank
	Date version;
	@OneToMany(mappedBy = "mRole")
	@JsonBackReference
	private Collection<RoleHasPrivileges> roleHasPrivileges = new ArrayList<>();

	public Role() {

	}

	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Collection<RoleHasPrivileges> getRoleHasPrivileges() {
		return roleHasPrivileges;
	}




	public void setRoleHasPrivileges(Collection<RoleHasPrivileges> roleHasPrivileges) {
		this.roleHasPrivileges = roleHasPrivileges;
	}




	public int getCodigo_role() {
		return codigo_role;
	}

	public void setCodigo_role(int codigo_role) {
		this.codigo_role = codigo_role;
	}



	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

}
