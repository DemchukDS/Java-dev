package Lecture_006;

import java.util.Arrays;
import java.util.HashSet;

public class task_001 {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Ivan";
        w1.lastName = "Bulahov";
        w1.salery = 1000;
        w1.id = 00000001;

        Worker w2 = new Worker();
        w2.firstName = "Boris";
        w2.lastName = "Johnson";
        w2.salery = 1125;
        w2.id = 00000012;

        Worker w4 = new Worker();
        w4.firstName = "Anatoliy";
        w4.lastName = "Presnyakov";
        w4.salery = 812;
        w4.id = 00000002;

        Worker w3 = new Worker();
        w4.firstName = "Bogdan";
        w4.lastName = "Savcuk";
        w4.salery = 1617;
        w4.id = 000000051;

        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3, w4));
        System.out.println(workers.contains(w4));
    }
}
