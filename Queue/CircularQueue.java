package Queue;

public class CircularQueue {
    static class circularQueue{
      static   int arr[];
        static int Size;
        static int rear;
        static int front;
        circularQueue(int n){
            arr=new int[n];
            Size=n;
            rear=-1;
            front=-1;
        }

        // 1st Function is checking whether its empty or not
        public static boolean isEmpty(){
            return rear==-1&&front==-1;

        }
        // 2nd Function is Full or not
        public static boolean isFull(){
            return (rear+1)% Size==front;
        }
        // 3rd Function is Adding the Element 
        public static void Add(int data){
            if(isFull()){
                System.out.println("The queue is Full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%Size;
            arr[rear]=data;
        }
        // 4th Function is Removing thr Element 
        public static int Remove(){
            if(isEmpty()){
                System.out.println("The queue is Empty");
                return -1;
            }
            int result=arr[front];
            if(rear==front){
                rear=front=-1;

            }
            else{
                front=(front+1)%Size;
            }
          
            return result;
        }
        public static int  Peek(){
            if(isEmpty()){
                System.out.println("The queue is Empty");
            
            }
           return arr[front];
        }



    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        circularQueue c=new circularQueue(5);
        c.Add(1);
        c.Add(2);
        c.Add(3);
        c.Add(4);
        c.Remove();
        c.Add(9);
        c.Add(5);
        while (!c.isEmpty()) {
            System.out.println(c.Peek());
            c.Remove();
            
        }
        
    }



    
}
