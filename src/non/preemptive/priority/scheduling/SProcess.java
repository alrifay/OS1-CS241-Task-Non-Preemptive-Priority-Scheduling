/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package non.preemptive.priority.scheduling;


public class SProcess implements Comparable<SProcess>{
    public int number;
    public int brustTime;
    public int arrivalTime;
    public int priority;
    public int waitTime;
    public int turnaroundTime;
    public int responseTime;
    public int statue;

    @Override
    public String toString() {
        return "Process{" + "number=" + number + ", brustTime=" + brustTime + ", arrivalTime=" + arrivalTime + ", priority=" + priority + ", waitTime=" + waitTime + ", turnaroundTime=" + turnaroundTime + ", responseTime=" + responseTime + ", statue=" + statue + "}\n";
    }
    @Override
    public int compareTo(SProcess o) {
        if (o.arrivalTime > arrivalTime) {
            return -1;
        } else if (o.arrivalTime < arrivalTime) {
            return 1;
        } else if (o.priority > priority) {
            return -1;
        } else if (o.priority < priority) {
            return 1;
        }
        return 0;
    }
}
