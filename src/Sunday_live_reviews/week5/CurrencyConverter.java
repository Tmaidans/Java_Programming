package Sunday_live_reviews.week5;

/*

Currency Converter [methods, conditional, operators]

	create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type. return the converted number

	Use the following sample rates for currency conversions
		1 dollar = 0.91 euro
		1 dollar = 121.03 yen
		1 dollar = 14.85 lira
		1 dollar = 1,217.52 won
		1 dollar = 181.45 rupee

	Note: Don't worry about decimal formats, focus on the code to create these conversions

		Ex:
			Input: euro, 100
			Output: 91

		Ex:
			Input: yen, 50
			Output: 6051.5

 */

public class CurrencyConverter {

    public static void main(String[] args) {

        System.out.println(converter("yen",50));

    }

    public static double converter (String type, double amount){

      switch (type.toLowerCase().trim()){

          case "euro":
              amount*=0.91;
              break;

          case "yen":
              amount*=121.03;
              break;

          case "lira":
              amount*=14.85;
              break;

          case "won":
              amount*=1217.52;
              break;

          case "rupee":
              amount*=181.45;
              break;

        }

        return amount;

    }

}


