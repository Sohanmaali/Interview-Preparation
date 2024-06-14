import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraySorter {

    public static void main(String[] args) {
        
        String[] array = {"x^1", "x^2", "x^3", "y^1", "y^2"};

		List<String> xList = new ArrayList<>();
		List<String> yList = new ArrayList<>();
		
		for(String s : array){
			if(s.startsWith("x^")) xList.add(s);
			else if(s.startsWith("y^")) yList.add(s);
		}
		
		Comparator<String> com = Comparator.comparingInt(s->Integer.parseInt(s.substring(2)));
		
		Collections.sort(xList,com);
		Collections.sort(yList,com);
		
		int size = Math.max(xList.size(),yList.size());
		
		List<String> compi = new ArrayList<>();
		
		for(int i =0;i<size; i++){
			if(i<xList.size()) compi.add(xList.get(i));
			if(i<yList.size()) compi.add(yList.get(i));
		}
		
		String []sortedArray = compi.toArray(new String[0]);

	   for (String s : sortedArray)System.out.print(s + " ");
        
    }
}
