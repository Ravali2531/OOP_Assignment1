package CellPhone;

import java.util.Arrays;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class ModifyCellPhones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CellPhone inventory[][] = new CellPhone[10][10];
		Random r = new Random();
		int high = 300;
		int low = 100;
		DecimalFormat df = new DecimalFormat("#,###.00");
		df.setRoundingMode(RoundingMode.CEILING);
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

		inventory[0][0] = c1;
		inventory[0][1] = c2;
		inventory[0][2] = c3;
		inventory[0][3] = c4;
		inventory[0][4] = c5;
		inventory[0][5] = c6;
		inventory[0][6] = c7;
		inventory[0][7] = c8;
		inventory[0][8] = c9;
		inventory[0][9] = c10;

		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				inventory[i][j] = new CellPhone(inventory[i - 1][j]);
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
//				System.out.println(i+" "+j);
//				inventory[0][0].displayInventory(inventory[i][j]);
				inventory[i][j].setPrice(r.nextInt(high - low) + low);
				System.out.printf(df.format(inventory[i][j].getPrice()) + "\t");

			}
			System.out.println();
		}

		double newValue = r.nextInt(high - low) + low;
		double oldValue = r.nextInt(high - low) + low;
		System.out.println(oldValue + " "+ newValue);
		int changed = modifyPhoneprices(inventory, oldValue, newValue);

	}

	public static int modifyPhoneprices(CellPhone inventory[][], double old, double updated) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		df.setRoundingMode(RoundingMode.CEILING);
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (inventory[i][j].getPrice() == old) {
					System.out.println("\nA change of phone price has taken at index: [" + i + "][" + j + "]");
					inventory[i][j].setPrice(updated);
					count++;
				}
			}
		}

		System.out.println("\nTotal number of price changes made was: " + count);

		System.out.println("\nCurrent contents of the array after price modifications:\n ");
		for (int l = 0; l < 10; l++) {
			for (int m = 0; m < 10; m++) {
				System.out.printf(df.format(inventory[l][m].getPrice()) + "\t");
			}
			System.out.println();
		}

		return count;

	}

}
