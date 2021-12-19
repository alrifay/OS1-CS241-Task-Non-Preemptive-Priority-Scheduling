package non.preemptive.priority.scheduling;

import java.util.ArrayList;
import java.util.Scanner;

public class NonPreemptivePriorityScheduling {

    /**
     * Read input from user
     */
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<SProcess> p = new ArrayList<>();

    /**
     * Add new process
     *
     * @param obj the process will be added
     *
     * @deprecated
     *
     */
    public static void addProcess(SProcess obj) {
        int j;
        //int l[];

        int s = p.size();
        boolean bool = false;
        obj.number = s + 1;
        obj.statue = 0;
        p.add(obj);
        p.sort(null);
        /*for (j = 0; j < s; j++) {
            if (p.get(j).priority > obj.priority) {
                bool = true;
                p.add(j, obj);
                break;
            }
        }
        if (bool != true) {
            p.add(s, obj);
        }*/
    }

    public static void gamal() {
        int i, j;

        int number = p.size();
        int location = 0;
        int minimum = p.get(0).arrivalTime;

        for (i = 1; i < number; i++) {
            p.get(i).statue = 0;
            if (p.get(i).arrivalTime < minimum) {
                minimum = p.get(i).arrivalTime;
                location = i;
            }
        }
        //System.out.println(p.get(location).number);
        p.get(location).waitTime = 0;
        p.get(location).turnaroundTime = p.get(location).brustTime;
        p.get(location).responseTime = 0;
        p.get(location).statue = 1;
        //System.out.println(p.get(location).number);
        //System.out.println(p.get(location).waitTime);
        //System.out.println(p.get(location).turnaroundTime);

        int totalbrusttime = p.get(location).turnaroundTime;
        while (true) {
            boolean pool = true;
            for (i = 0; i < number; i++) {
                while (p.get(i).arrivalTime <= totalbrusttime && p.get(i).statue == 0) {
                    p.get(i).waitTime = p.get(location).turnaroundTime - p.get(i).arrivalTime;
                    p.get(i).waitTime = p.get(i).waitTime < 0 ? 0 : p.get(i).waitTime;

                    if (p.get(i).waitTime == 0) {
                        p.get(i).turnaroundTime = p.get(i).brustTime + p.get(i).arrivalTime;
                    } else {
                        p.get(i).turnaroundTime = p.get(location).turnaroundTime + p.get(i).brustTime;
                    }
                    //p.get(i).turnaroundTime = p.get(location).turnaroundTime + p.get(i).brustTime;
                    p.get(i).responseTime = p.get(i).waitTime;
                    p.get(i).statue = 1;
                    //System.out.println(p.get(i).number);
                    //System.out.println(p.get(i).waitTime);
                    //System.out.println(p.get(i).turnaroundTime);
                    location = i;
                    pool = false;
                    totalbrusttime = p.get(i).turnaroundTime;
                    break;
                }
            }
            if (pool == true) {
                boolean done = true;
                for (int l = 0; l < p.size(); l++) {
                    if (p.get(l).statue == 0) {
                        done = false;
                        break;
                    }
                }
                if (done) {
                    break;
                }
                j = 0;
                for (int t = 0; t < number; t++) {
                    if (p.get(t).statue == 0) {
                        minimum = p.get(t).arrivalTime;
                        totalbrusttime = minimum;
                        break;
                    }
                }
                while (j < number) {
                    if (p.get(j).statue == 0 && p.get(j).arrivalTime < minimum) {
                        minimum = p.get(j).arrivalTime;
                        totalbrusttime = minimum;
                    }
                    j++;
                }
            }
        }
        //System.out.println(p);
    }
}
