package Lessons;

public class Main {

    public static void  main (String[] args)
    {
        firstTask();
        secondTask();
        thirdTask();
    }

    public static void firstTask(){
        int[] mass = {13,14,15,77,88,9,11,99,1,46,82,782,3456};
        Sorting sort = new Sorting(mass);
        sort.getMass();
        sort.printer();
    }

    public static void secondTask(){
        Shapes[] shapes = { new Rect(),
                            new Triangle(),
                            new Circle(),
                            new Square()

        };

        for(Shapes fig : shapes)
            System.out.println(fig.getName());
    }

    public static void thirdTask(){
        Temperature temp = new Temperature(123.3,"C");
        System.out.println(temp.getTemp());

    }

}
