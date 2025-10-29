package corejava;



import java.util.*;
public class CoreJava {

    int a = 10, b = 5, s = 0;

    void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 number");
        a = sc.nextInt();
        System.out.println("enter 2 number");
        b = sc.nextInt();
        s = a - b;
        System.out.println("sub is:" + s);

    }

    void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr 1st number:");
        a = sc.nextInt();
        System.out.println("enter 2nd number:");
        b = sc.nextInt();
        s = a + b;
        System.out.println("additon is:" + s);
    }

    void mul() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number:");
        a = sc.nextInt();
        System.out.println("enter 2nd number:");
        b = sc.nextInt();
        s = a * b;
        System.out.println("multiplication is:" + s);
    }

    void div() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        a = sc.nextInt();
        System.out.println("enter second number:");
        b = sc.nextInt();
        s = a / b;
        System.out.println("division is:" + s);
    }

    void mod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        s = a % b;
        System.out.println("modulus is:" + s);
    }

    void checkeven() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("number is even.");
        } else {
            System.out.println("number is odd.");
        }
    }

    void eventill20() {
        System.out.println("Even numbers till 20");
        int n = 20;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }

    void oddandeven() {

        int n = 20;
        System.out.println("Even numbers till 20");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Odd numbers till 20 ");

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    void whileLoop() {
        int n = 20;
        System.out.println("Even numbers till 20");

        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i = i + 1;
        }

    }

    void doWhileLoop() {
        int n = 20;
        System.out.println("Even numbers till 20");

        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i = i + 1;
        } while (i <= n);
    }
    
    void forLoop() {
        int n = 20;
        System.out.println("Even numbers till 20");

        
       for(int i=1;i<=n;i+=5)
       {
                 System.out.println(i);
             
        }  
    }

    void forEachLoop() {
         
        int data[]={12,22,33,23,45,87,67};
       for(int i : data)
       {
                 System.out.println(i);
             
        }
        System.out.println("----------------");
             
       for(int i =0;i< data.length;i++)
       {
                 System.out.println(data[i]);
             
        } 
    }
    
    
    void foreven() 
    {
        int n = 20;
        System.out.println("Even numbers from 20");

        
       for(int i=n;i>=1;i--)
       {
           if(i%2==0)
           {
                 System.out.println(i);
           } 
        }  
    }
    
    void whileeven() 
    {
        int n = 20;
        System.out.println("Even numbers from 20");

        int i=n;
       while(i>=1)
       {
           if(i%2==0)
           {
                 System.out.println(i);
           }
           i=i-1;
        }  
    }
    
    
    void dowhileeven() 
    {
        int n = 20;
        System.out.println("Even numbers from 20");

        int i=n;
        do
       {
           if(i%2==0)
           {
                 System.out.println(i);
           }
           i=i-1;
        }  
       while(i>=1);
    }
    
    
    void forEachreverse() 
    {
         
        int data[]={12,22,33,23,45,87,67};
          
        for(int i =data.length-1;i>=0;i--)
        {
                 System.out.println(data[i]);     
        } 
    }
    
    
    void array()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of elements:");
        int n=sc.nextInt();
         int data[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            data[i]=sc.nextInt();
        }
        System.out.println("Elements in reverse:");
        for(int i =data.length-1;i>=0;i--)
        {
            System.out.println(data[i]);
        }
    }
    
    
    void foreachreverse()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of elements:");
        int n=sc.nextInt();
         int data[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            data[i]=sc.nextInt();
        }
        System.out.println("Elements in reverse:");
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(data[i]);
        }
    }
    
    
    void Foreachreverse() 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements:");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }
        Collections.reverse(list);
        System.out.println("Elements in reverse:");
        
        for (int val : list) {
            System.out.println(val);
        }
    }

    void largest()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements:");
        int n = sc.nextInt();
        int[] data=new int[n];
         System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            data[i]=sc.nextInt();
        }
        int max=data[0];
        for (int val:data)
        {
            if (val > max )
            {
                max=val;
            }
        }
       System.out.println("Largest element:" +max );
    }
    
    
    void oddeveninarray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements:");
        int n = sc.nextInt();
        int[] data=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            data[i]=sc.nextInt();
        }
        System.out.println("Even numbers in the array:");
        for (int i=0;i<n;i++)
        {
            if (data[i]%2==0) 
            {
                System.out.println(data[i]);
            }
        }
        System.out.println("Odd numbers in the array:");
        for (int i=0;i<n;i++)
        {
            if (data[i]%2!=0) 
            {
                System.out.println(data[i]);
            }
        }
        
    }
    
    
    void example()
    {
        Scanner sc = new Scanner(System.in);
        String data[]={"12","palakkad","kannur","kaloor","kakkanad","99"};
        System.out.println("Enter an alphabet");
        String d = sc.next();
        System.out.println("strings starting with "+d);
        int f=0;
        for (int i=0;i<data.length;i++)
        {
            if (data[i].startsWith(d))
            {
                System.out.println(data[i]);
                f=1;
            }
        }
        if (f==0)
        {
            System.out.println("Not found");
        }
        
        }
    
    
    void startingvalues()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of values");
        int n=sc.nextInt();
        sc.nextLine();
        String[]data=new String[n];
        System.out.println("Enter the values:");
        for (int i=0;i<n;i++)
        {        
            data[i]=sc.nextLine();
        }
        System.out.println("Enter the starting letter/number");
        String d=sc.nextLine();
        System.out.println("values starting with "+d);
        boolean found=false;
        for (String item : data)
        {
            if (item.startsWith(d))
            {
                System.out.println(item);
                found=true;
            }
        }
            if (!found)
            {
                System.out.println("Not found");
            }
            sc.close();
    }
    
    
    void endingvalues()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of values");
        int n=sc.nextInt();
        sc.nextLine();
        String[]data=new String[n];
        System.out.println("Enter the values:");
        for (int i=0;i<n;i++)
        {        
            data[i]=sc.nextLine();
        }
        System.out.println("Enter the ending letter/number");
        String d=sc.nextLine();
        System.out.println("values ending with "+d);
        boolean found=false;
        for (String item : data)
        {
            if (item.endsWith(d))
            {
                System.out.println(item);
                found=true;
            }
        }
            if (!found)
            {
                System.out.println("Not found");
            }
            sc.close();
    }
    
    
   

    void presentvalues() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of values");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] data = new String[n];
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) 
        {
            data[i] = sc.nextLine();
        }

        System.out.println("Enter the letter/number to search:");
        String d = sc.nextLine();
        System.out.println("Values containing:"+d);
        boolean found = false;
        for (String item : data) 
        {
            if (item.contains(d)) 
            {   
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
        sc.close();
    }
    
    
    
    void extension()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the file name");
      String s = sc.nextLine(); 
      int Index=s.indexOf(".");
      if(Index>0 && !s.endsWith("."))
      {
        String extension=s.substring(Index);
        System.out.println("file extension is:"+extension);
      }
      else
      {
        System.out.println("no file extension");
      }
      sc.close();
    }
    
    
    
    void count() 
    {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter the no.of values:");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] data = new String[n];
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) 
        {
            data[i] = sc.nextLine();
        }

        System.out.println("Enter the letter/number to search:");
        String d = sc.nextLine();
        System.out.println("Values containing:"+d);        
        for (String item : data) 
        {
            if (item.contains(d)) 
            {   
                System.out.println(item);
                count++;
            }
        }
        if (count==0) 
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("no.of values:"+count);
        }
        sc.close();
    }
    
    
    
    void length()
    {
        String name = "Java"; 
        System.out.println(name.length()); 
    }
    
    
    void position()
    {
        String name = "Java"; 
        System.out.println(name.charAt(2));  
    }
    
    void upperandlower()
    {
        String name = "Java"; 
        System.out.println(name.toUpperCase());  
        System.out.println(name.toLowerCase());
    }
    
    
    void extract()
    {
        String text = "HelloWorld"; 
        System.out.println(text.substring(0, 5)); 
    }
    
    void contains()
    {
        String msg = "Welcome to Java"; 
        System.out.println(msg.contains("Java"));
    }
    
    
    void equals()
    {
        String a = "java"; 
        String b = "Java"; 
        System.out.println(a.equals(b));             
        System.out.println(a.equalsIgnoreCase(b)); 
    }
    
    
    void replace()
        {
            String text = "apple"; 
            System.out.println(text.replace("a", "A")); 
        }
    
    void trim()
    {
        String input = "  Hello  "; 
        System.out.println(input.trim());
    }
    
    void split()
    {
        String line = "apple,banana,grape"; 
        String[] fruits = line.split(","); 
        for (String fruit : fruits) 
        { 
            System.out.println(fruit); 
        }
    }
    
    void index()
    {
        String name = "Developer"; 
        System.out.println(name.indexOf('e')); 
    }

    public static void main(String[] args) 
    {
        CoreJava obj = new CoreJava();
        obj.index();
    }
}