import java.util.*;

public class PrintThirdElement{
	static void printThird(List<Integer> list, int elementToPrint)
	{
		int thirdElement = elementToPrint + 2;  //print the third element

		//exit if the index to print is greater than the size of the lsit
		if(thirdElement > list.size())
		{
			return;
		}
		//the index printed becomes the begin index of the next print
		System.out.println(list.get(thirdElement));

		//the index passed is the third index, with the index just printed as the next begin index
		printThird(list, thirdElement);
	}


	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		int i = 1;
		while(i < 10)
		{
			list.add(i);
			i++;
		}
		//System.out.println(list);
		printThird(list, 0);


	}
}
