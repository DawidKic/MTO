package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		System.out.println("Jak¹ operacjê chcesz wykonaæ?");
		System.out.println("1 -- Dodawanie");
		System.out.println("2 -- Dzielenie");
		System.out.println("3 -- Pierwiastkowanie");
		System.out.println("4 -- Losowanie liczby");
		
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int licz1 = 0;
		int licz2 = 0;
		int wynik = 0;
		switch(n)
		{
		case 1:
			System.out.println("Podaj pierwsz¹ liczbê.");
			licz1 = reader.nextInt();
			System.out.println("Podaj drug¹ liczbê.");
			licz2 = reader.nextInt();
			wynik = calc.add(licz1,licz2);
			System.out.println("Wynik dodawania to: " + wynik);
			break;
		case 2:
			System.out.println("Podaj pierwsz¹ liczbê.");
			licz1 = reader.nextInt();
			System.out.println("Podaj drug¹ liczbê.");
			licz2 = reader.nextInt();
			wynik = calc.div(licz1,licz2);
			System.out.println("Wynik dzielenia to: " + wynik);
			break;
		case 3:
			System.out.println("Podaj liczbê.");
			licz1 = reader.nextInt();
			wynik = calc.sqrt(licz1);
			System.out.println("Wynik pierwiastkowania to: " + wynik);
			break;
		case 4:
			System.out.println("Podaj pierwsz¹ liczbê.");
			licz1 = reader.nextInt();
			System.out.println("Podaj drug¹ liczbê.");
			licz2 = reader.nextInt();
			if(licz1 > licz2)
			{
				wynik = calc.rand(licz2,licz1);	
			}
			else
			{
				wynik = calc.rand(licz1,licz2);
			}

			System.out.println("Losowa liczba miêdzy tymi wartoœciami to: " + wynik);
			break;
		default:
			System.err.println("Podana zosta³a nieprawid³owa liczba!");
			break;
			
		}
		reader.close();

	}

}
