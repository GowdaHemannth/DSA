package Queue;

public class Implementation {
    static class Queue{
       static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        // 1st function is finding the empty Function
        public static boolean isEmpty(){
            return rear==-1;
        }
        //2nd Function is ADD Function in satck its it will noticed as Push
        public static void ADD(int data){
           if(rear==size-1){
            System.out.println("The Queue is Full");
            return;
           }
           rear=rear+1;
           arr[rear]=data;
        }
        // 3rd Function is Remove Function 
        public static int Remove(){
            if(isEmpty()){
                System.out.println("The Queue is Empty");
                return -1;
            }
            int Front =arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];

            }
            rear--;
            return Front;

        }
        // 4th Function is Peek Function
        public static int peek(){
            if(isEmpty()){
                System.out.println("The Queue is Empty");
                return -1;
            }
            return arr[0];

        }

    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.ADD(1);
        q.ADD(2);
        q.ADD(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.Remove();
            
        }
       
    }
    
}
