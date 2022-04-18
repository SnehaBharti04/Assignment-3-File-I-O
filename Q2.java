import java.io.*;

class F1
{  public static void main(String args[])   {

    try

        {

        FileReader f1 = new FileReader("src.txt");

        BufferedReader br = new BufferedReader(f1);

        FileWriter f2 = new FileWriter("dest.txt");

        

        String word1,word2;
m  BufferedReader b2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter word 1:");

        word1 = b2.readLine();

        

        System.out.println("Enter word 2:");

        word2 = b2.readLine();

        

        String x="",msg=" ";

        

        

        while((x=br.readLine())!=null)

        {

            msg+=x+"";

        }

       f1.close();

      msg = msg.replace(word1,word2);

      f2.write(msg);
        f2.close();
        }

        catch(Exception e1)

        {

            System.out.println(e1);

        }
    }
 
}
