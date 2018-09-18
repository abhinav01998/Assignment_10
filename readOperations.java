import java.io.*;
class readOperations{
      public static void main(String args[]){
                 File f=new File("C:/Users/Abhinav Thakur/Desktop/abc.txt");
                 File g=new File("C:/Users/Abhinav Thakur/Desktop/xyz.txt");//assume, abc has some text in it.
                 char c[]=new char[100];
                      int i,k=0;
                 try{
                     FileInputStream fin=new FileInputStream(f);

                     i=fin.read();
                     while(i!=-1){
                      c[k]=(char)i;
                     k++;
                     i=fin.read();
                   }

                 }
                 catch(IOException e){
                   System.out.println(e);
                 }

                 try{
                   FileOutputStream fout=new FileOutputStream(g);
                   for(i=0;i<k;i++)
                    fout.write(c[i]);
                            System.out.println("File copied");
                 catch(IOException e){
                   System.out.println(e);

                 }
      }
}
