package joffre.NanifarfallaRest.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.JoinColumn;

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
	private Collection<UserRoles> userRoles = new ArrayList<>();
	@OneToMany(mappedBy = "mRole")
	@JsonBackReference
	private Collection<RoleHasPrivileges> roleHasPrivileges = new ArrayList<>();

	@OneToMany(mappedBy = "mRole")
	@JsonBackReference
	private Collection<MenuRoles> menuRoles = new ArrayList<>();
	@ManyToMany(mappedBy = "roles")
	private Collection<Usuario> users;
	@ManyToMany
	@JoinTable(name = "rolehasprivilege", joinColumns = @JoinColumn(name = "fkcodigo_role", referencedColumnName = "codigo_role"), inverseJoinColumns = @JoinColumn(name = "fkcodigo_privilege", referencedColumnName = "codigo_privilege"))
	private Collection<Privilege> privileges;

	public Role() {

	}

	public Role(final String name) {
		super();
		this.name = name;
	}

	public Collection<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Collection<Privilege> privileges) {
		this.privileges = privileges;
	}

	public Collection<MenuRoles> getMenuRoles() {
		return menuRoles;
	}

	public void setMenuRoles(Collection<MenuRoles> menuRoles) {
		this.menuRoles = menuRoles;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Role role = (Role) obj;
		if (!getName().equals(role.getName())) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Role [nombre_role=").append(name).append("]").append("[codigo_role=").append(codigo_role)
				.append("]");
		return builder.toString();
	}

}
