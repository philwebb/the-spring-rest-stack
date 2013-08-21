
package com.joshlong.cms.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.util.ObjectUtils;

/**
 * Simple object that administers all customer data. This user is the one on whose behalf
 * modifications to {@link Customer customer data} are made.
 *
 * @author Josh Long
 */
@Entity
public class User implements Serializable {

	private static final int MAX_PHOTO_SIZE = 5 * 1024 * 1024;

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String username;

	private String password;

	private boolean enabled;

	private String firstName;

	private String lastName;

	private Date signupDate;

	@Column(length = MAX_PHOTO_SIZE)
	private byte[] photo;

	private String photoMediaType;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Customer> customers = new HashSet<Customer>();

	User() {
	}

	@Override
	public int hashCode() {
		return ObjectUtils.nullSafeHashCode(this.id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() == obj.getClass()) {
			return ObjectUtils.nullSafeEquals(this.id, ((User) obj).id);
		}
		return false;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getSignupDate() {
		return signupDate;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getPhotoMediaType() {
		return photoMediaType;
	}

	public void setPhotoMediaType(String photoMediaType) {
		this.photoMediaType = photoMediaType;
	}
}
