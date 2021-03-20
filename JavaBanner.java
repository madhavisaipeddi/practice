public class JavaBanner
{
    public static void spaces(int a)
    {
        for (int j=0;j<a;j++)
        {
            System.out.print(" ");
        }
    };
    public static void J(int i,int n)
    {
        int a=(n/2)-1;
        if (i>0){
            if (i<4)
            {
                spaces(a);
            }
            else if (i==4)
            {
                spaces(1);
                System.out.print("JJ");
                spaces(2);
            }
            else if (i==5)
            {
                spaces(1);
                System.out.print("JJJJ");
            }
            System.out.print("JJ");
            spaces(a);
        }
        else
        {
            for (int j=0;j<n/2;j++)
            {
                System.out.print("JJ");
            }
        }
    }
    public static void V(int i,int n)
    {
        int a=n/2-1;
        if (i<a)
        {
            spaces(i);
            System.out.print("VV");
            spaces(n-2*i-4);
            System.out.print("VV");
            spaces(i);
        }
        else
        {
            spaces(i);
            System.out.print("VVV");
            spaces(i);
        }
        
    }
    public static void A(int i,int n)
    {
        int a=n/2-1;
        if (i>0)
        {
            a=a-i;
            spaces(a);
            System.out.print("AA");
            if (i==n/4)
            {
                for (int j=0;j<a+i;j++)
                {
                    System.out.print("A");
                }
            }
            else{
                spaces(2*i-1);
            }
            System.out.print("AA");
            spaces(a);
        }
        else
        {
            spaces(a);
            System.out.print("AAA");
            spaces(a);
        }
    };
    
    public static void main(String[] args) 
    {
        int n=6;
        for (int i=0;i<n;i++)
        {
            J(i,2*n);
            System.out.print("  ");
            A(i,2*n+1);
            System.out.print("  ");
            V(i,2*n+1);
            System.out.print("  ");
            A(i,2*n+1);
            System.out.println("");
        }
    }
}
