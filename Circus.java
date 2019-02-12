package ua.lviv.iot.Lab1;

public class Circus {
	private int numberOfPlaces;
	private int numberOfPerformancesPerYear;
	private String addres;

	private String nameOfCircus;
	private int ticketPrice;

	private static int dissatisfiedVisitors = 0;

	protected int square;
	protected int yearOfFoundation;

	Circus() {

	}

	Circus(int numberOfPlaces, int numberOfPerformancesPerYear, String addres, String nameOfCircus,
			int ticket_price, int square, int year_of_foundation) {
		this.numberOfPlaces = numberOfPlaces;
		this.numberOfPerformancesPerYear = numberOfPerformancesPerYear;
		this.addres = addres;
		this.nameOfCircus = nameOfCircus;
		this.ticketPrice = ticketPrice;
		this.square = square;
		this.yearOfFoundation = yearOfFoundation;
	}

	Circus(int numberOfPlaces, int numberOfPerformancesPerYear, String addres, String nameOfCircus) {
	 this(numberOfPlaces,numberOfPerformancesPerYear,addres,nameOfCircus,0,0,0);

	}

	public static void printDissatisfiedVisitors() {
		System.out.println("Dissatisfied visitors:" + dissatisfiedVisitors);
	}

	public String ToString() {
		return "Number of place is" + this.numberOfPlaces + "\n" + "Number of performances per year is:"
				+ this.numberOfPerformancesPerYear + "\n" + "Addres is:" + this.addres + "\n" + "Name Of Circus is:"
				+ this.nameOfCircus + "\n" + "Ticket price is:" + this.ticketPrice + "\n" + "Square is:"
				+ this.square + "\n" + "Year of foundation is:" + this.yearOfFoundation + "\n";

	}

	public void setNumberOfPlaces(int numberOfPlaces) {
		this.numberOfPlaces = numberOfPlaces;
	}

	public void setNumberOfPerformancesPerYear(int numberOfReformancesPerYear) {
		this.numberOfPerformancesPerYear = numberOfPeformancesPerYear;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public void setNameOfCircus(String nameOfCircus) {
		this.nameOfCircus = nameOfCircus;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	public void setYearOfFoundation(int yearOfFoundation) {
		this.yearOfFoundation = yearOfFoundation;
	}

	public int getNumberOfPlaces() {
		return numberOfPlaces;
	}

	public int getNumberOfPerformancesPerYear() {
		return numberOfPerformancesPerYear;
	}

	public String getAddres() {
		return addres;
	}

	public String getNameOfCircus() {
		return nameOfCircus;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public int getSquare() {
		return square;
	}

	public int getYearOfFoundation() {
		return yearOfFoundation;
	}

	public void resetValues(int numberOfPlaces, int numberOfPerformancesPerYear, String addres,
			String nameOfCircus, int ticketPrice, int square, int yearOfFoundation) {
		this.numberOfPlaces = numberOfPlaces;
		this.numberOfPerformancesPerYear = numberOfPerformancesPerYear;
		this.addres = addres;
		this.nameOfCircus = nameOfCircus;
		this.ticketPrice = ticketPrice;
		this.square = square;
		this.yearOfFoundation = yearOfPoundation;
	}

	public void resetValues(int numberOfPlaces, int numberOfPerformancesPerYear, String addres,
			String nameOfCircus) {
		this.numberOfPlaces = numberOfPlaces;
		this.numberOfPerformancesPerYear = numberOfPerformancesPerYear;
		this.addres = addres;
		this.nameOfCircus = nameOfCircus;

	}

	public static void main(String[] args) {

		Circus slam = new Circus();
		Circus dream = new Circus(1500, 150, "Liva st", "Dream", 10, 2, 4);
		Circus circle = new Circus(500, 100, "Prava st", "Circle");

		System.out.println(slam.ToString() + "\n");
		System.out.println(dream.ToString() + "\n");
		System.out.println(circle.ToString() + "\n");

		Circus.printDissatisfied_visitors();

	}

}
