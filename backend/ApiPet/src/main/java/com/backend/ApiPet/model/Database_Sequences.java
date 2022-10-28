package com.backend.ApiPet.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "datanase_sequences")
public class Database_Sequences {
	
	private String id;
	
	private long seq;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}
	
	
	

}
