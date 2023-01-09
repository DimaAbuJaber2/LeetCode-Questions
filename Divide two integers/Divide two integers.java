class Solution {
    public int divide(int dividend, int divisor) {   int count=0;
    boolean flag=true;
   
      if(dividend>2147483647)
      dividend=2147483647;

      if(dividend<-2147483648)
       dividend=-2147483648;
      if(divisor>2147483647)
      divisor=2147483647;

      if(divisor<-2147483648)
       divisor=-2147483648;

       long a=dividend;
       long b=divisor;

       if((b==1&&a==2147483647)||(b==-1&&a==-2147483648))
       {
         count=2147483647;
         return count;
       }

        if(b==1&&a==-2147483648)
       {
         count=-2147483648;
         return count;
       }
      if(b==-1&&a==2147483647)
      {
          count=-2147483647;
         return count;
      }
        if(b<0&&a>0)
        {
          flag=false;
          b=b*-1;
        }
        if((a<0)&&(b>0))
        {
            flag=false;
            a=a*-1;
        }
        if(a<0&&b<0)
        {
            b=b*-1;
           a=a*-1;
            flag=true;
        }
        
       
        while(a>=b)
        {
            a=a-b;
            count++;
        }
        if(flag==false)
        {
            count=count*-1;
        }
      
       return count;
    }
}