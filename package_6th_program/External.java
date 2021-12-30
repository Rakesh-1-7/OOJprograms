package SEE;
import CIE.*;


public class External extends Student1
{
    public int marks[] = new int[5];
    public External(String usn, String name, String sem,int marks[])
    { 
        super(usn,name,sem);
        for(int i = 0; i < 5; i++)
        {
            this.marks[i] = marks[i];
        }
    }
}