import java.util.*;

public class Theater
{
	static Scanner kb = new Scanner(System.in);
	static String pick;

	static int[][] thea = {
			{10,10,10,10,10,10,10,10,10,10},
			{10,10,10,10,10,10,10,10,10,10},
			{10,10,10,10,10,10,10,10,10,10},
			{10,10,20,20,20,20,20,20,10,10},
			{10,10,20,20,20,20,20,20,10,10},
			{10,10,20,20,20,20,20,20,10,10},
			{20,20,30,30,40,40,30,30,20,20},
			{20,30,30,40,50,50,40,30,30,20},
			{30,40,50,50,50,50,50,50,40,30}};

	public static void main(String[] args)
	{
		int i = 0;
		do{
			printChart();
			selectSeat();
			System.out.print("Press 1 to continue, or 0 to quit");
			i = kb.nextInt();
		} while (i != 0);
	}


	public static void selectSeat()
	{

		System.out.println("Would you like to get a ticket by \n(p)rice or \n(s)eat number?");
		pick = kb.nextLine();

		if(pick.equals("p") || pick.equals("P"))
			priceSelect();
		else if(pick.equals("s") || pick.equals("S"))
			locationSelect();

	}



	public static void priceSelect()
	{
		System.out.print("What price would you like? : ");
		int price = kb.nextInt();
		checkAvailPrice(price);

	}

	public static void checkAvailPrice(int a)
	{
		for(int i = 0; i < thea.length; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if(thea[i][j] == a)
				{
					System.out.println("Congratulations on getting your seat!");
					thea[i][j] = 0;
					a = 1;
				}

			}
		}

	}

	public static void locationSelect()
	{
			System.out.print("What aisle would you like? : ");
			int aisle = kb.nextInt();
			System.out.println("What seat number would you like? : ");
			int seat = kb.nextInt();

	}

	public static void printChart()
	{

		for(int i = 0; i < thea.length; i++){
				for(int j = 0; j < 10; j++){
					System.out.print(thea[i][j] + " ");
				}
				System.out.println(" ");
		}

	}


}