class Stocks
{
    int maximum_profit(int prices[], int n)
	{
	    int max_profit = 0;
        int min_price = 2147483647;
        for(int i = 0; i < n; i++){
            min_price = Math.min(min_price, prices[i]);
            max_profit = Math.max(max_profit, prices[i] - min_price);
        }
        return max_profit;
	}
	public static void main(String[] args)
	{
		Stocks s = new Stocks();
		int[] prices = {7,1,5,3,6,4};
		int n = prices.length;
		int profit = s.maximum_profit(prices, n);
		System.out.println(profit + " is the maximum possible profit");
	}
}
