import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrancyConverter {

	public static void main(String[] args) {
		List<List<String>> given= new ArrayList<>();
		List<List<String>> input= new ArrayList<>();
		List<String> innerList1 = new ArrayList<>();
		List<String> innerList2 = new ArrayList<>();
		List<String> innerList3 = new ArrayList<>();
		List<String> inner1 = new ArrayList<>();
		List<String> inner2 = new ArrayList<>();
		List<String> inner3 = new ArrayList<>();
		innerList1.add("USD");
		innerList1.add("GBP");
		innerList1.add("0.74");
		given.add(innerList1);
		innerList2.add("USD");
		innerList2.add("JPY");
		innerList2.add("103.83");
		given.add(innerList2);

		innerList3.add("Euro");
		innerList3.add("JPY");
		innerList3.add("126.02");
		given.add(innerList3);
		
		inner1.add("Euro");
		inner1.add("USD");
		input.add(inner1);
		inner2.add("JPY");
		inner2.add("GBP");
		input.add(inner2);
		inner3.add("GBP");
		inner3.add("USD");
		input.add(inner3);
		//conversion(given,input);
		System.out.println(conversion(given,input));
		System.out.println(given.toString());
		System.out.println(input.toString());
	}
	private static List<String> conversion(List<List<String>> given,List<List<String>> input) {

		List<String> out = new ArrayList<>();
		for (int i = 0;i<input.size();i++)
		{
			if (input.get(i).get(0).equals(input.get(i).get(1)))
			{
				out.add("1");
			}else if (given.indexOf(input.get(i).get(0))==given.indexOf(input.get(i).get(1))){
				int ind = given.indexOf(input.get(i).get(0));
				System.out.println(input.get(i).get(0));
				System.out.println(given.get(i).get(0));
				//out.add(given.get(ind).get(2));
				//Convert(input.get(i).get(0),input.get(i).get(1));
			}else {
				
			}
		}
		
		Map <String,Double> toUSD= new HashMap<String,Double>();
		
		for (int i = 0; i<given.size();i++)
		{
			if (given.get(i).get(0).equals("USD"))
			{
				String st=given.get(i).get(2);
				double rate=Double.parseDouble(st);
				rate=1/rate;
				toUSD.put(given.get(i).get(1),rate);
			}else if(given.get(i).get(1).equals("USD"))
			{
				String st=given.get(i).get(2);
				double rate=Double.parseDouble(st);
				toUSD.put(given.get(i).get(0),rate);
			}
			else {
				
			}
		}

		return out;
	}
	private static void Convert(String cur1, String cur2) {
		// TODO Auto-generated method stub

	}
}
