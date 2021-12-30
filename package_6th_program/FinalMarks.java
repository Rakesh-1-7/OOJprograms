import CIE.*;
import SEE.*;



class FinalMarks
{
    public static void main(String[] args) 
    {
        int[] marks = {30,35,40,33,34};
        int[] marks2 = {90,80,95,85,100};
        Student1 s = new Student1("1BM20CS121", "Rakesh B N", "3rd");
        Internals i =  new Internals(marks);
        External e =  new External("1BM20CS121", "Rakesh B N", "3rd",marks2);

        System.out.println(s);
        System.out.println(i);
        System.out.println(e);
    }
}