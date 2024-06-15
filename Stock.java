/**
 * Name: Naylene Rondon
 * 
 * Florida Tech CIS 2503
 * 5.5 Programming Assignment
 * 
 * Date Last Modified: 02/11/24
 * 
 * Purpose: Define each instance of stock
 * 
 *
 */
public class Stock
{
	//Variables
	private String symbol;
	private String date;
	private Double open;
	private Double high;
	private Double low;
	private Double close;
	private Double volume;
	
	//set methods
	public void setSymbol (String stockSymbol)
	{
		symbol = stockSymbol;
	}
	
	public void setDate (String stockDate)
	{
		date = stockDate;
	}
	
	public void setOpen (double stockOpen)
	{
		open = stockOpen;
	}
	
	public void setHigh (double stockHigh)
	{
		high = stockHigh;
	}
	
	public void setLow (double stockLow)
	{
		low = stockLow;
	}
	
	public void setClose (double stockClose)
	{
		close = stockClose;
	}
	
	public void setVolume (double stockVolume)
	{
		volume = stockVolume;
	}
	
	//get methods
	public String getSymbol()
	{
		return symbol;
	}
	
	public String getDate()
	{
		//Variables to format date
		String month = date.substring(4, 6);
		String day = date.substring(6);
		String year= date.substring(0, 4);
		String formatDate = month +"-" + day +"-"+year ;
		
		return formatDate;
	}
	
	public double getOpen()
	{
		return open;
	}
	
	public double getHigh()
	{
		return high;
	}
	
	public double getLow()
	{
		return low;
	}
	
	public double getClose()
	{
		return close;
	}
	
	public double getVolume()
	{
		return volume;
	}
	
	//output method
	public void outputStock()
	{
		System.out.print("Stock Symbol: ");
		System.out.println(symbol);
		System.out.print("Reporting Date: ");
		System.out.println(getDate());
		System.out.print("Opening Value: ");
		System.out.println(open);
		System.out.print("Day's High: ");
		System.out.println(high);
		System.out.print("Day's Low: ");
		System.out.println(low);
		System.out.print("Day's Close: ");
		System.out.println(close);
		System.out.print("Day's Volume: ");
		System.out.println(volume);
	}
	
	//Allows declaration of stock
	public Stock (
			String symbol,
			String date,
			String open,
			String high,
			String low, 
			String close,
			String volume )
	{
		this.symbol = symbol;
		this.date = date;
		//The below parses the strings into doubles and ints to improve values
		this.open =  Double.parseDouble(open);
		this.high =  Double.parseDouble(high);
		this.low =  Double.parseDouble(low);
		this.close =  Double.parseDouble(close);
		this.volume =  Double.parseDouble(volume);		
	}

	

}
