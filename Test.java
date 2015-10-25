class Test {
	public static void main (String[] args) {
		
		Sorting sort = new Sorting(3);
		sort.getValue(0,"Rhenzel", "Restor", 18, "Tacloban City");
		sort.getValue(1,"Jeff", "Pecana", 17, "Antipolo, Rizal");
		sort.getValue(2,"Rhussel", "Restor", 16, "Tacloban City");

		System.out.println("\n**** ORIGINAL ****");
		sort.display();

		System.out.println("\n **** Sorted By AGE ****");
		sort.bubbleSort();
		sort.display();
	}
}

