# Stock Tracker Application

## Overview

This Java application, developed by Naylene Rondon for the Florida Tech CIS 2503 course (5.5 Programming Assignment), facilitates the tracking and analysis of stock data read from a file (`StockExchange.txt`). It defines a `Stock` class to represent individual stock instances and a `StockTracker` class to perform various operations on a list of stocks.

## Stock Class

The `Stock` class defines attributes and methods to manage stock data:

- **Attributes**:
  - `symbol`: Stock symbol.
  - `date`: Date of the stock data.
  - `open`, `high`, `low`, `close`: Stock prices for opening, daily high, daily low, and closing.
  - `volume`: Volume of stocks traded.

- **Methods**:
  - Setters (`setSymbol`, `setDate`, `setOpen`, `setHigh`, `setLow`, `setClose`, `setVolume`): Set values for stock attributes.
  - Getters (`getSymbol`, `getDate`, `getOpen`, `getHigh`, `getLow`, `getClose`, `getVolume`): Retrieve values of stock attributes.
  - `outputStock()`: Print all stock details.

## StockTracker Class

The `StockTracker` class manages a list of `Stock` objects read from a file and performs various analytical operations:

- **Methods**:
  - `stockReader()`: Reads stock data from `StockExchange.txt` file into an `ArrayList` of `Stock` objects.
  - `highOpening(stockList)`, `lowOpening(stockList)`: Identify stocks with highest and lowest opening prices.
  - `topFive(stockList)`, `lowFive(stockList)`: List top five stocks with highest and lowest daily highs.
  - `searchStocks(stockList, stockSymbol)`: Search and display stock data for a specific stock symbol.
  - `highVolume(stockList)`, `lowVolume(stockList)`: Identify stocks with highest and lowest trading volumes.
