public class Demo060{
        public static void main(String [] args){
            int n = 20;
            long first = 0;
            long second = 1;
            long next;
            System.out.println("fibonacci series of "+n+" numbers");
            for(int i=0;i<=n;i++){
                System.out.println(first + " " );
                next = first + second;
                first = second;
                second = next;
            }
        }
    }