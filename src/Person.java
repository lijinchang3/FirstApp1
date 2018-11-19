import com.entity.*;
import java.util.*;
public class Person {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int i = 0;
        for (; i < 10; i++) {
            System.out.println("当前i=" + i);
        }
        ArrayList<Student> listS=new ArrayList<Student>();
        for(i=0;i<10;i++)
        {
            Student s=new Student();
            s.setAge(i*3);
            s.setName("name"+i);
            int sex=i%2;
            s.setSex(new Boolean(""+sex));
            listS.add(s);
        }
        for(Student p:listS)
        {

            System.out.println(p.getName()+"的年龄是："+p.getAge());
        }
        System.out.println("ok");
    }
}
