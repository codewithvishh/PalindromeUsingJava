class palindrome{
public static void main(String []args)
{
 int n=121,temp,rev=0;
 temp=n;
 while(n!=0){
int digit=n%10;
rev=rev*10+dgit;
n/=10;
}
if(temp==rev)
{
 System.out.println("Palindrome Number");
}
else
{
 System.out.println("Palindrome Number");
}

