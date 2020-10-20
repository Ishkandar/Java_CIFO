package provaPractica7;

/** Part 1: create a method largerThan(Apartment compared) that
 * returns true if the object whose method is called has a larger
 * total area than the apartment object that is being compared.
 *
 * Part 2: create a method priceDifference(Apartment compared) that
 * returns the price difference of the apartment object whose method
 * was called and the apartment object received as a parameter.
 *
 * Part 3: write a method moreExpensiveThan(Apartment compared) that
 * returns true if the apartment whose method is called is more expensive
 * than the apartment object being compared.
 */
public class Apartment {
	// class attributes
    private int rooms;
    private int squares;
    private int pricePerSquare;
 
    // public custom constructor
    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.setRooms(rooms);
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
 
    // public methods
    public int getPricePerApartment() {
        return this.squares * this.pricePerSquare;
    }
 
    public boolean largerThan(Apartment compared) {
        return (this.squares > compared.squares) ? true : false;
    }
 
    public int priceDifference(Apartment compared) {
        int priceDifference = this.getPricePerApartment() - compared.getPricePerApartment();
        return Math.abs(priceDifference);
    }
 
    public boolean moreExpensiveThan(Apartment compared) {
        return (this.getPricePerApartment() > compared.getPricePerApartment()) ? true : false;
    }

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
}