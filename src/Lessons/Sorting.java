package Lessons;

public class Sorting {
    private int[] mass;
    Sorting(int[] mass){
        this.mass = mass;
    }

    public int[] getMass(){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mass.length-1; i++) {
                if(mass[i] > mass[i+1]){
                    isSorted = false;
                    buf = mass[i];
                    mass[i] = mass[i+1];
                    mass[i+1] = buf;
                }
            }
        }
        return this.mass;
    }

    public void printer(){
        for (int i = 0; i < mass.length-1; i++){
            System.out.print(mass[i] + " ");
            System.out.println("");
        }
        System.out.println("----Окончание вывода массива----");
    }
}
