package fizzbuzz;

public class xmas {

	public static void main(String[]args){
		
	for (int day = 1; day < 13; day++){
		System.out.print("On the " + day);
	
		switch (day){
		case 1:
			System.out.print("st");
			break;
		case 2:
			System.out.print("nd");
			break;
		case 3:
			System.out.print("rd");
			break;
		default:
			System.out.print("th");
			break;
		}
		System.out.print(" day of Xmas my true love gave to me\n ");
		
		switch (day) {
		case 12:
			System.out.println("\tTwelve drummers drumming");
			break;
		case 11:
			System.out.println("\tEleven pipers piping");
			break;
		case 10:
			System.out.println("\tTen lords a leaping");
			break;
		case 9:
			System.out.println("\tNine ladies dancing");
			break;
		case 8:
			System.out.println("\tEight maids a milking");
			break;
		case 7:
			System.out.println("\tSeven swans a swimming");
			break;
		case 6:
			System.out.println("\tSix Geese a laying");
			break;
		case 5:
			System.out.println("\tFive golden rings");
			break;
		case 4:
			System.out.println("\tFour calling birds");
			break;
		case 3: 
			System.out.println("\tThree french hens");
			break;
		case 2:
			System.out.println("\tTwo turtle doves");
			break;
		default:
			System.out.println("\tand a partridge in a pear tree");
			break;
		}
		}
	
	
			
	
	
	
}
}
