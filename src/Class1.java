import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Class1 {

    public static void main(String[] args ) throws Exception {
        String poth = "C:\\Users\\Andrushka\\Desktop\\mass.txt";//путь до файла
        try(FileReader reader = new FileReader(poth)) //открытие файла
        {
            List<Integer> ArrInt = new ArrayList<>();
            Scanner scan = new Scanner(reader);
            int len = 0,i,j,c;
            while(scan.hasNextInt()){
                int s = scan.nextInt();
                ArrInt.add(s);
            }
            for( i = 0; i < ArrInt.size();i++)
            {
                for( j = 0; j <ArrInt.size() - i - 1; j++ )
                {
                    if(ArrInt.get(j) < ArrInt.get(j + 1))//if(ArrInt[i]>ArrInt[i+1])
                    {
                        c= ArrInt.get(j + 1);
                        ArrInt.set(j + 1, ArrInt.get(j));//ArrInt[j+1]=ArrInt[j]
                        ArrInt.set(j, c);
                    }
                }
            }
            for( i = 0; i < ArrInt.size();i++)
            {
                System.out.println(ArrInt.get(i));//Console.WriteLine(...)
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }

}
