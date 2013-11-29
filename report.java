/*
 * To change this template, choose Tools | 
 * and open the template in the editor.
 */
package reportcard;

/**
 *
 * @author zvibock
 */
public class Reportcard {

    public static int row = 45;
    public static int[] incoming = new int[row];
    public int pointer = 0;
    public static int[] grades = new int[150];

    public void createArray() {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = i;

        }
    }

    public void records(int[] args) {
        //int i=0;
        if (pointer + args.length <= incoming.length) {

            for (int i = 0; i < args.length; i++) {
                incoming[pointer] = args[i];
                pointer++;
            }
        } else {
            int[] temporary = new int[row * 2];
            for (int i = 0; i < incoming.length; i++) {
                temporary[i] = incoming[i];
            }
            row = row * 2;
            incoming = new int[row];
            for (int i = 0; i < temporary.length + pointer; i++) {
                incoming[i] = temporary[i];

            }
            records(grades);

        }
      }

    public static void main(String[] args) {


        Reportcard reportcard = new Reportcard();
        reportcard.createArray();
        reportcard.records(grades);
        System.out.println(incoming[145]);
    }
}
/**
 * @param args the command line arguments
 */
    /*if(pointer+args.length <=incoming.length){
            
            for( int i=0;i< (args.length);i++){
           incoming[pointer]=args[i]; pointer++;*/