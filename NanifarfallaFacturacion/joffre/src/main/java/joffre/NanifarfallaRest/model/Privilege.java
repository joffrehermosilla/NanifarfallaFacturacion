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

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "privilege")
@EntityListeners(AuditingEntityListener.class)
public class Privilege {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_privilege;
	String nombre_privilege;
	Date version;
	@OneToMany(mappedBy = "mPrivilege")
	private Collection<RoleHasPrivileges> roleHasPrivileges = new ArrayList<>();

	public Privilege() {

	}

	public int getCodigo_privilege() {
		return codigo_privilege;
	}

	public void setCodigo_privilege(int codigo_privilege) {
		this.codigo_privilege = codigo_privilege;
	}

	public String getNombre_privilege() {
		return nombre_privilege;
	}

	public void setNombre_privilege(String nombre_privilege) {
		this.nombre_privilege = nombre_privilege;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public Collection<RoleHasPrivileges> getRoleHasPrivileges() {
		return roleHasPrivileges;
	}

	public void setRoleHasPrivileges(Collection<RoleHasPrivileges> roleHasPrivileges) {
		this.roleHasPrivileges = roleHasPrivileges;
	}

}
