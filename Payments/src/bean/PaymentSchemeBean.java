package bean;

/**
 * 
 * @author Ishanka
 * java bean class of payment schemes
 *
 */

public class PaymentSchemeBean {
	
	private int id;
	private int doc_id;
	private int hospital_id;
	private double doc_charge ;
	private double hospital_charge;
	private double tax;
	
	//getter and setter of id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//getter and setter of doctor's id
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	
	//getter and setter of hospital id
	public int getHospital_id() {
		return hospital_id;
	}
	public void setHospital_id(int hospital_id) {
		this.hospital_id = hospital_id;
	}
	
	//getter and setter of doctor's charge
	public double getDoc_charge() {
		return doc_charge;
	}
	public void setDoc_charge(double doc_charge) {
		this.doc_charge = doc_charge;
	}
	
	//getter and setter of hospital's charge
	public double getHospital_charge() {
		return hospital_charge;
	}
	public void setHospital_charge(double hospital_charge) {
		this.hospital_charge = hospital_charge;
	}
	
	//getter and setter of tax
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	

}
