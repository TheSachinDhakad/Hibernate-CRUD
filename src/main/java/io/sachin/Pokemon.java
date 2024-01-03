package io.sachin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pokemon {
	@Id
	@Column
	private String name;
	
	@Column
	private String type;
	
	@Column
	private int power;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", type=" + type + ", power=" + power + "]";
	}
	
	
	
}
