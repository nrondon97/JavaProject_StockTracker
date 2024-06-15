
//imports
import java.util.*;
import java.io.*;
public class StockTracker 
{
	public static void main(String[]args)
	{
		ArrayList <Stock> stockList = new ArrayList <Stock>();
		stockList = stockReader();
		highOpening(stockList);
		lowOpening(stockList);
		topFive(stockList);
		lowFive(stockList);
		
		//Specific Stocks
		System.out.println("\nHow well did Disney perform? \n");
		searchStocks(stockList,"DIS");
		System.out.println("\nHow well did General Electric perform? \n");
		searchStocks(stockList,"GE");
		System.out.println("\nHow well did Wal-Mart perform? \n");
		searchStocks(stockList,"WMT");
		System.out.println("\nHow well did Coca-Cola perform? \n");
		searchStocks(stockList,"KO");
		System.out.println("\nHow well did Time Warner perform?");
		System.out.println("\nTime Warner is no longer traded on the NYSE. Here is the information for AT&T, who acquired them: \n");
		searchStocks(stockList,"T");
		 //Volumes
		highVolume(stockList);
		lowVolume(stockList);
		//Florida Tech
		System.out.println("\nA report on Florida Tech Level3 Harris: \n");
		searchStocks(stockList,"LHX");
	}
	
	public static ArrayList <Stock> stockReader() //Reads the stock file and put them in arraylist
	{
		try (Scanner inputStocks = new Scanner(new FileReader("src/StockExchange.txt"))) 
	    {
			ArrayList <Stock> stockList = new ArrayList <Stock>();
	        while (inputStocks.hasNextLine()) 
	        {
	        	String[] splitLine = inputStocks.nextLine().split(","); //Splits the lines
	            Stock stockValue = new Stock(splitLine[0],splitLine[1],splitLine[2],splitLine[3],splitLine[4], splitLine[5],splitLine[6]); //Assigns value to Stock
	            stockList.add(stockValue);//Add stock to Arraylist
	        }
	        return stockList;

	    } 
	    catch (FileNotFoundException e) 
	    {
	        System.err.println("Error reading file: " + e.getMessage());
	        return null;
	    }
	}
	
	public static void highOpening(ArrayList <Stock> stockList) //Sorts by highest opening and pulls the first value
	{
		 Comparator<Stock> compareByOpening = (Stock o1, Stock o2) -> 
		 {
		        return Double.compare(o1.getOpen(), o2.getOpen()); };
		        
		 Collections.sort(stockList, compareByOpening.reversed());
		 
		 System.out.println("\nWhich stock had the highest opening price? \n");
		 stockList.get(0).outputStock();
		 
	}
	
	public static void lowOpening(ArrayList <Stock> stockList) //Sorts by lowest opening and pulls the first value
	{
		 Comparator<Stock> compareByOpening = (Stock o1, Stock o2) -> 
		 {
		        return Double.compare(o1.getOpen(), o2.getOpen()); };
		        
		 Collections.sort(stockList, compareByOpening);
		 
		 System.out.println("\nWhich stock had the lowest opening price? \n");
		 stockList.get(0).outputStock();
		 
	}
	
	public static void topFive(ArrayList <Stock> stockList) //Sorts by highest highs and pulls the first five values
	{
		 Comparator<Stock> compareByHigh = (Stock o1, Stock o2) -> 
		 {
		        return Double.compare(o1.getHigh(), o2.getHigh()); };
		        
		 Collections.sort(stockList, compareByHigh.reversed());
		 
		 System.out.println("\nThe top five stocks with the highest highs: \n");
		 stockList.get(0).outputStock();
		 System.out.println();
		 stockList.get(1).outputStock();
		 System.out.println();
		 stockList.get(2).outputStock();
		 System.out.println();
		 stockList.get(3).outputStock();
		 System.out.println();
		 stockList.get(4).outputStock();
	}
	
	public static void lowFive(ArrayList <Stock> stockList) //Sorts by lowest lows and pulls the first five values
	{
		 Comparator<Stock> compareByLow = (Stock o1, Stock o2) -> 
		 {
		        return Double.compare(o1.getLow(), o2.getLow()); };
		        
		 Collections.sort(stockList, compareByLow);
		 
		 System.out.println("\nThe top five stocks with the lowest lows: \n");
		 stockList.get(0).outputStock();
		 System.out.println();
		 stockList.get(1).outputStock();
		 System.out.println();
		 stockList.get(2).outputStock();
		 System.out.println();
		 stockList.get(3).outputStock();
		 System.out.println();
		 stockList.get(4).outputStock();
	}
	
	public static void searchStocks(ArrayList <Stock> stockList, String stockSymbol)  //Sort Stocks in alphabetical order and find the correct one
	{
		Comparator<Stock> compareBySymbol = (Stock o1, Stock o2) -> 
		        o1.getSymbol().compareTo(o2.getSymbol());
		 Collections.sort(stockList, compareBySymbol);
		 
		 for(int i = 0; i < stockList.size(); i++)
		 {
			 if(stockList.get(i).getSymbol().equals(stockSymbol))
			 {
				 stockList.get(i).outputStock();
			 }
		 }
	}
	
	public static void highVolume(ArrayList <Stock> stockList) //Sorts by highest opening and pulls the first value
	{
		 Comparator<Stock> compareByVolume = (Stock o1, Stock o2) -> 
		 {
		        return Double.compare(o1.getVolume(), o2.getVolume()); };
		        
		 Collections.sort(stockList, compareByVolume.reversed());
		 
		 System.out.println("\nWhich stock had the highest volume? \n");
		 stockList.get(0).outputStock();
		 
	}
	
	public static void lowVolume(ArrayList <Stock> stockList) //Sorts by lowest opening and pulls the first value
	{
		 Comparator<Stock> compareByVolume = (Stock o1, Stock o2) -> 
		 {
		        return Double.compare(o1.getVolume(), o2.getVolume()); };
		        
		 Collections.sort(stockList, compareByVolume);
		 
		 System.out.println("\nWhich stock had the lowest volume? \n");
		 stockList.get(0).outputStock();
		 
	}

}
