

import java.util.ArrayList;
import java.util.Scanner;

public class TaxpayerAssignment{

	static Scanner sc = new Scanner(System.in);
	static ArrayList<TaxPayerAssignment1> taxpayerDetails = new ArrayList();
	static ArrayList<ArrayList<TaxPayerAssignment1>> taxpayerTaxDetails = new ArrayList();
	static int numberOfTaxPayers = 0;
		
	public static void main(String[] args) {
//		
		System.out.println("Menu: \n"
				+ "1. Read, validate and store data for taxpayers.\n"
				+ "2. Calculate and store tax and group number for all taxpayers.\n"
				+ "3. Display all taxpayers.\n"
				+ "4. Display the name and age of all taxpayers from tax group 1.\n"
				+ "5. Search a taxpayer by age.\n"
				+ "6. Sort and display taxpayers.\n"
				+ "7. Exit from the application.\n"
				+ "Enter yourt input between (1-7)!");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:{
			readValidateStoreData();
			main(args);
			break;
		}
		case 2:{
			storeTaxAndTaxgroup();
			main(args);
			break;
		}
		case 3:{
			displayAllTaxPayers();
			main(args);
			break;
		}
		case 4:{
			displayFromGroup1();
			main(args);
			break;
		}
		case 5:{
			searchByAge();
			main(args);
			break;
		}
		case 6:{
			sortAndDisplay();
			main(args);
			break;
		}
		case 7:{
			System.exit(0);
			break;
		}
		default:{
			System.out.println("Please enter a valid input!");
			main(args);
			break;
		}
		}
		
			
	}

	static void sortAndDisplay() {
		String[] namesArray = new String[numberOfTaxPayers];
		for(int i = 0;i < numberOfTaxPayers;i++) {
			namesArray[i] = taxpayerTaxDetails.get(i).get(0).taxPayerName;
			System.out.println("Names Array: " + namesArray[i]);
		}
		for(int i = 0;i < namesArray.length;i++) {
			for(int j = i+1;j < namesArray.length;j++) {
				if(namesArray[i].compareTo(namesArray[j]) < 0) {
					String temp = namesArray[i];
					namesArray[i] = namesArray[j];
					namesArray[j] = temp;
				}
			}
			System.out.println("Names Array Sorted: " + namesArray[i]);
		}
		for(int i = 0;i < numberOfTaxPayers;i++) {
			for(int j = 0;j < numberOfTaxPayers;j++) {
				if(namesArray[i].equalsIgnoreCase(taxpayerTaxDetails.get(j).get(0).taxPayerName)) {
					System.out.println("Name: " + taxpayerTaxDetails.get(j).get(0).taxPayerName
							+ " Age: " + taxpayerTaxDetails.get(j).get(0).taxPayerAge
							+ " Income: " + taxpayerTaxDetails.get(j).get(0).taxPayerTaxableIncome
							+ " Tax: " + taxpayerTaxDetails.get(j).get(0).taxPayerTax
							+ " Group: " + taxpayerTaxDetails.get(j).get(0).taxPayerGroup);
			}
			}
		}
		
	}

	static void searchByAge() {
		int searchAge = sc.nextInt();
		for(int i = 0;i < numberOfTaxPayers;i++) {
			int age = taxpayerTaxDetails.get(i).get(0).taxPayerAge;
			if(searchAge == age) {
				System.out.println("Name: " + taxpayerTaxDetails.get(i).get(0).taxPayerName
						+ " Age: " + taxpayerTaxDetails.get(i).get(0).taxPayerAge
						+ " Income: " + taxpayerTaxDetails.get(i).get(0).taxPayerTaxableIncome
						+ " Tax: " + taxpayerTaxDetails.get(i).get(0).taxPayerTax
						+ " Group: " + taxpayerTaxDetails.get(i).get(0).taxPayerGroup);
			}
		}
		
	}

	static void displayFromGroup1() {
		System.out.println("Tax payers from Group1: ");
		for(int i = 0;i < numberOfTaxPayers;i++) {
			String groupName = taxpayerTaxDetails.get(i).get(0).taxPayerGroup;
			if(groupName.equals("Group1")) {
				System.out.println("Name: " + taxpayerTaxDetails.get(i).get(0).taxPayerName
						+ " Age: " + taxpayerTaxDetails.get(i).get(0).taxPayerAge);
			}
		}
	}

	static void displayAllTaxPayers() {
		System.out.println("Op3: " + taxpayerTaxDetails);
		for(int i = 0;i < numberOfTaxPayers;i++) {
			System.out.println("Tax Payer Tax Details: \n"
					+ "Name: "+taxpayerTaxDetails.get(i).get(0).taxPayerName
					+ " Age: " + taxpayerTaxDetails.get(i).get(0).taxPayerAge
					+ " Income: " + taxpayerTaxDetails.get(i).get(0).taxPayerTaxableIncome
					+ " Tax: " + taxpayerTaxDetails.get(i).get(0).taxPayerTax
					+ " Group: " + taxpayerTaxDetails.get(i).get(0).taxPayerGroup);
		}

	}

	static void storeTaxAndTaxgroup() {
		if((taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome >= 0) && (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome <= 18200)) {
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerGroup("Group1");
			ArrayList<TaxPayerAssignment1> tempArrList = new ArrayList();
			tempArrList.add(taxpayerDetails.get(numberOfTaxPayers));
			taxpayerTaxDetails.add(tempArrList);
			numberOfTaxPayers++;
		}
		else if((taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome > 18201) && (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome < 37000)) {
			double extraAmount = (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome) - 18200;
			double extraTaxAmount = extraAmount * (0.19);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerTax(extraTaxAmount);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerGroup("Group2");
			ArrayList<TaxPayerAssignment1> tempArrList = new ArrayList();
			tempArrList.add(taxpayerDetails.get(numberOfTaxPayers));
			taxpayerTaxDetails.add(tempArrList);
			numberOfTaxPayers++;
		}
		else if((taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome > 37001) && (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome < 87000)) {
			double extraAmount = (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome) - 37000;
			double extraTaxAmount = extraAmount * (0.325);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerTax(extraTaxAmount);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerGroup("Group3");
			ArrayList<TaxPayerAssignment1> tempArrList = new ArrayList();
			tempArrList.add(taxpayerDetails.get(numberOfTaxPayers));
			taxpayerTaxDetails.add(tempArrList);
			numberOfTaxPayers++;
		}
		else if((taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome > 87001) && (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome < 180000)) {
			double extraAmount = (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome) - 87000;
			double extraTaxAmount = extraAmount * (0.37);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerTax(extraTaxAmount);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerGroup("Group4");
			ArrayList<TaxPayerAssignment1> tempArrList = new ArrayList();
			tempArrList.add(taxpayerDetails.get(numberOfTaxPayers));
			taxpayerTaxDetails.add(tempArrList);
			numberOfTaxPayers++;
		}
		else if(taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome > 180001) {
			double extraAmount = (taxpayerDetails.get(numberOfTaxPayers).taxPayerTaxableIncome) - 180000;
			double extraTaxAmount = extraAmount * (0.45);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerTax(extraTaxAmount);
			taxpayerDetails.get(numberOfTaxPayers).setTaxPayerGroup("Group5");
			ArrayList<TaxPayerAssignment1> tempArrList = new ArrayList();
			tempArrList.add(taxpayerDetails.get(numberOfTaxPayers));
			taxpayerTaxDetails.add(tempArrList);
			numberOfTaxPayers++;
		}
		
	}

	static void readValidateStoreData() {
		TaxPayerAssignment1 taxpayerRead = new TaxPayerAssignment1();
		System.out.println("Enter the Tax Payer Name: ");
		taxpayerRead.setTaxPayerName(sc.next());
		ageEntry(taxpayerRead);
		taxAmountEntry(taxpayerRead);
		taxpayerDetails.add(taxpayerRead);
		System.out.println(taxpayerDetails);
	}
	static void ageEntry(TaxPayerAssignment1 taxpayerRead) {
		System.out.println("Enter the Tax Payer Age: ");
		int inputAge = sc.nextInt();
		if((inputAge >= 18) && (inputAge <= 64)) {
			taxpayerRead.setTaxPayerAge(inputAge);
		}
		else {
			System.out.println("Taxpayers apart from the ages 18 and 64 are not allowed!\n"
					+ "Please enter the age in between 18 and 64!");
			ageEntry(taxpayerRead);
		}
	}
	static void taxAmountEntry(TaxPayerAssignment1 taxpayerRead){
		System.out.println("Enter the Tax Payer Income: ");
		double inputIncome = sc.nextDouble();
		if((inputIncome >= 1) && (inputIncome <= 999000)) {
			taxpayerRead.setTaxPayerTaxableIncome(inputIncome);
		}
		else {
			System.out.println("Income apart from $1 to $999000 are not allowed!\n"
					+ "Please enter the Income amount in between $1 and $999000!");
			taxAmountEntry(taxpayerRead);
		}
	}

}