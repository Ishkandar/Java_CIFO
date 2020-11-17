package customersh2.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CreditCard {
	//------------ ID COLUMN ------------------//
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	//-------------- END ID ------------------//
	private String typeCreditCard;
	private String numberCreditCard;
	private int loan;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CUSTOMER_ID_FK")
	private Customer customer;
	
	protected CreditCard() {}
	
	public CreditCard(Long id, String typeCreditCard, String numberCreditCard, int loan) {
		super();
		this.id = id;
		this.typeCreditCard = typeCreditCard;
		this.numberCreditCard = numberCreditCard;
		this.loan = loan;
	}


	public String getTypeCreditCard() {
		return typeCreditCard;
	}


	public void setTypeCreditCard(String typeCreditCard) {
		this.typeCreditCard = typeCreditCard;
	}


	public String getNumberCreditCard() {
		return numberCreditCard;
	}


	public void setNumberCreditCard(String numberCreditCard) {
		this.numberCreditCard = numberCreditCard;
	}


	public int getLoan() {
		return loan;
	}


	public void setLoan(int loan) {
		this.loan = loan;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", typeCreditCard=" + typeCreditCard + ", numberCreditCard=" + numberCreditCard
				+ ", loan=" + loan + "]";
	}
}
