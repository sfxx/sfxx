package com.xx.data;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


public class FSbomStructure  {

	// Fields

	private String id;
	private FSbomStructure FSbomStructure;
	private String note;
	private String unit;
	private BigDecimal isRoot;
	private BigDecimal isLeaves;
	private Integer quantity;
	private String sequence;
	private Set FSbomBrandStructureInfors = new HashSet(0);
	private Set FSbomStructures = new HashSet(0);

	// Constructors

	/** default constructor */
	public FSbomStructure() {
	}

	/** minimal constructor */
	public FSbomStructure(BigDecimal isRoot,
			BigDecimal isLeaves, Integer quantity) {
		this.isRoot = isRoot;
		this.isLeaves = isLeaves;
		this.quantity = quantity;
	}

	/** full constructor */
	public FSbomStructure(FSbomStructure FSbomStructure, String note,
			String unit, BigDecimal isRoot, BigDecimal isLeaves,
			Integer quantity, String sequence, Set FSbomBrandStructureInfors,
			Set FSbomStructures) {
		this.FSbomStructure = FSbomStructure;
		this.note = note;
		this.unit = unit;
		this.isRoot = isRoot;
		this.isLeaves = isLeaves;
		this.quantity = quantity;
		this.sequence = sequence;
		this.FSbomBrandStructureInfors = FSbomBrandStructureInfors;
		this.FSbomStructures = FSbomStructures;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public FSbomStructure getFSbomStructure() {
		return this.FSbomStructure;
	}

	public void setFSbomStructure(FSbomStructure FSbomStructure) {
		this.FSbomStructure = FSbomStructure;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public BigDecimal getIsRoot() {
		return this.isRoot;
	}

	public void setIsRoot(BigDecimal isRoot) {
		this.isRoot = isRoot;
	}

	public BigDecimal getIsLeaves() {
		return this.isLeaves;
	}

	public void setIsLeaves(BigDecimal isLeaves) {
		this.isLeaves = isLeaves;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getSequence() {
		return this.sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public Set getFSbomBrandStructureInfors() {
		return this.FSbomBrandStructureInfors;
	}

	public void setFSbomBrandStructureInfors(Set FSbomBrandStructureInfors) {
		this.FSbomBrandStructureInfors = FSbomBrandStructureInfors;
	}

	public Set getFSbomStructures() {
		return this.FSbomStructures;
	}

	public void setFSbomStructures(Set FSbomStructures) {
		this.FSbomStructures = FSbomStructures;
	}

}