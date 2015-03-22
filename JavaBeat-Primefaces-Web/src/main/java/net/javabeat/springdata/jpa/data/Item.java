package net.javabeat.springdata.jpa.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="items")
public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 511077661904187466L;

	@Id
	private String _id;
	
	private BigDecimal id;
	private String name;
	private String icon;
	private ArrayList<Object> flags;
	private ArrayList<Object> restrictions;
	private ArrayList<Object> gameTypes;
	private String rarity;
	private String type;
	private int defaultSkin;
	private int level;
	private ArrayList<Object> details;
	private String description;
	private int vendorValue;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public ArrayList<Object> getFlags() {
		return flags;
	}
	public void setFlags(ArrayList<Object> flags) {
		this.flags = flags;
	}
	public ArrayList<Object> getRestrictions() {
		return restrictions;
	}
	public void setRestrictions(ArrayList<Object> restrictions) {
		this.restrictions = restrictions;
	}
	public ArrayList<Object> getGameTypes() {
		return gameTypes;
	}
	public void setGameTypes(ArrayList<Object> gameTypes) {
		this.gameTypes = gameTypes;
	}
	public String getRarity() {
		return rarity;
	}
	public void setRarity(String rarity) {
		this.rarity = rarity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDefaultSkin() {
		return defaultSkin;
	}
	public void setDefaultSkin(int defaultSkin) {
		this.defaultSkin = defaultSkin;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public ArrayList<Object> getDetails() {
		return details;
	}
	public void setDetails(ArrayList<Object> details) {
		this.details = details;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getVendorValue() {
		return vendorValue;
	}
	public void setVendorValue(int vendorValue) {
		this.vendorValue = vendorValue;
	}
	
}
