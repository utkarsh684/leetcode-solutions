class leetcode121 {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }
            else{
                maxProfit=Math.max(maxProfit,price-minPrice);
            }
        }
        return maxProfit;
    }
}
