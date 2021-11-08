import java.util.ArrayList;
import java.util.Collections;

public class Arrays
{
    String [] arrayA= {
            "dog","cat","rat","fox","frog",
            "dinosaur","cow","bull", "dog"
    };

    String [] arrayB= {
            "dog", "dog", "cat","dog","frog","rat","turtle",
            "fox","fox","man","man","frog","man"
    };

    public void compare()
    {
        for (int indexA =0; indexA<arrayA.length;indexA++) {
            int counter = 0;
            for (int indexB = 0; indexB < arrayB.length; indexB++) {
                if (arrayA[indexA] == arrayB[indexB]) {
                    counter++;
                }
            }
            if (counter > 0) {
                System.out.println(arrayA[indexA] + "  " + counter);
            }
        }
    }
    public void toiuu()
    {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,arrayA);
        int n = list.size();
        for(int i = 0 ; i < n - 1 ; i++)
        {
            for(int j = i + 1 ; j < n ; j++)
            {
                if(list.get(i) == list.get(j)){
                    list.remove(j);
                    --n;
                    --j;
                }
            }
        }
        String [] arrayC = new String[list.size()];
        arrayC = list.toArray(arrayC);
        arrayA=arrayC;
        for(int i = 0 ; i < arrayA.length ; i++)
        {
            System.out.print(arrayA[i] + " ");
        }
    }

    public static void main(String args[]){
        Arrays a = new Arrays();
        System.out.print("Mảng A sau khi tối ưu: ");
        a.toiuu();
        System.out.println("\n");
        a.compare();
    }
}
