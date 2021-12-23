package SEE;
import CIE.Student1;


public class External extends CIE.Student1
{
    int marks[] = new int[5];
    External(String usn, String name, String sem,int marks[])
    { 
        super(usn,name,sem);
        for(int i = 0; i < 5; i++)
        {
            this.marks[i] = marks[i];
        }
    }
}