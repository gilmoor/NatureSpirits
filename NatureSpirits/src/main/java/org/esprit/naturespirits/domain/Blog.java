package org.esprit.naturespirits.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Blog
 *
 */
@Entity

public class Blog implements Serializable {

	   
	@Id
	private int id_blog;
	private String content;
	private static final long serialVersionUID = 1L;

	public Blog() {
		super();
	}   
	public int getId_blog() {
		return this.id_blog;
	}

	public void setId_blog(int id_blog) {
		this.id_blog = id_blog;
	}   
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}
   
}
