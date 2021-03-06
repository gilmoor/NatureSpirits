package org.esprit.naturespirits.domain;

import java.io.Serializable;




public class InvitationId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id_member;
	private int id_alert;
	public int getId_member() {
		return id_member;
	}
	public void setId_member(int id_member) {
		this.id_member = id_member;
	}
	public int getId_invitation() {
		return id_alert;
	}
	public void setId_invitation(int id_invitation) {
		this.id_alert = id_invitation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_alert;
		result = prime * result + id_member;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvitationId other = (InvitationId) obj;
		if (id_alert != other.id_alert)
			return false;
		if (id_member != other.id_member)
			return false;
		return true;
	}
	
	

}
