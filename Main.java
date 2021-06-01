import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Stream;

import jdk.javadoc.internal.doclets.toolkit.taglets.LiteralTaglet;

//import jdk.internal.org.jline.utils.InputStreamReader;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in)) ;
        int n = Integer.parseInt(read.readLine()) ;
        String[] str = read.readLine().trim().split(" ") ;
        int[] arr = new int[n] ;
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(str[i]) ;
        }

        ArrayList<Integer> list = new ArrayList<>() ;
        int streak = 0 ;
        for(int i=0; i<n-1; i++) {
            if(arr[i+1] > arr[i]) {
                if(streak == 0) {
                    list.add(i) ;
                    //System.out.print(i + " ");
                }
                streak++ ;
            }
            else{
                if(streak != 0) {
                    list.add(i) ;
                    //System.out.println(i);
                }
                streak = 0 ;
            }
        }

        if(arr[n-1] > arr[n-2]) {
            list.add(n-1) ;
        }

        if(list.isEmpty()){
            System.out.println("null");
            return ;
        }

        for(int i=0; i<list.size()-1; i+=2){
            System.out.println(list.get(i) + " " +list.get(i+1));
        }



    }
}