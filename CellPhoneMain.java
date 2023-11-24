package CellPhone;

import java.util.*;

public class CellPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CellPhone inventory[] = new CellPhone[10];
		CellPhone c1 = new CellPhone("Samsung", 200.00);
		CellPhone c2 = new CellPhone("Apple", 1000.00);
		CellPhone c3 = new CellPhone("Nokia", 800.00);
		CellPhone c4 = new CellPhone("Nokia 2.0", 700.00);
		CellPhone c5 = new CellPhone("Blackberry", 500.00);
		CellPhone c6 = new CellPhone("Poco", 300.00);
		CellPhone c7 = new CellPhone(c3);
		CellPhone c8 = new CellPhone(c4);
		CellPhone c9 = new CellPhone(c5);
		CellPhone c10 = new CellPhone(c6);

		inventory[0] = c1;
		inventory[1] = c2;
		inventory[2] = c3;
		inventory[3] = c4;
		inventory[4] = c5;
		inventory[5] = c6;
		inventory[6] = c7;
		inventory[7] = c8;
		inventory[8] = c9;
		inventory[9] = c10;

		Arrays.toString(inventory);

		System.out.println("Enter the cellphone brand and price that you want to search");
		String br = sc.next();
		double pr = sc.nextDouble();
		System.out.println("Please enter either Yes or No");
		String choice = sc.next();
		CellPhoneSearch(inventory, br, pr, choice);
	}

	public static void CellPhoneSearch(CellPhone inventory[], String br, double pr, String choice) {
		int count = 0;
		if (choice.equalsIgnoreCase("Yes")) {
			System.out.println("Cellphones matching the given brand and price are");
			for (int i = 0; i < inventory.length; i++) {

				if (inventory[i].getBrand().equalsIgnoreCase(br) && inventory[i].getPrice() == pr) {
					inventory[i].toString();
					count++;
				}
			}
		} else {
			System.out.println("Cellphones matching the given brand or price are");
			for (int i = 0; i < inventory.length; i++) {
				if (inventory[i].getBrand().equalsIgnoreCase(br) || inventory[i].getPrice() == pr) {
					inventory[i].toString();
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("There are no cellphones matching your search");
		}
	}

}
