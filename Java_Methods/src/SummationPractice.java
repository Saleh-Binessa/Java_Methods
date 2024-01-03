import java.util.ArrayList;

public class SummationPractice {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(12);
        numbers.add(15);

        System.out.println("Total Number is: " + sumOfArrayList(numbers));
    }
    public static Integer sumOfArrayList (ArrayList<Integer> SumOfNum)
    {
      Integer total = 0;
      for(int Numbers : SumOfNum) {
        total+=Numbers;
       
      } return total;
    } 
}