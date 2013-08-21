
package com.joshlong.cms.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.util.ObjectUtils;

/**
 * Represents a customer record.
 *
 * @author Josh Long
 * @author Phillip Webb
 */
@Entity
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private Date signupDate = new Date();

	private String firstName;

	private String lastName;

	@ManyToOne
	private User user;

	Customer() {
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
			return ObjectUtils.nullSafeEquals(this.id, ((Customer) obj).id);
		}
		return false;
	}

	public Long getId() {
		return id;
	}

	public Date getSignupDate() {
		return signupDate;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
