class pallin
{
  Public Static void Main(String args[])
  {
    int n=121,r=0,rev=0,t=0;
    t=n;
    while(n>=0)
    {
      r=n%10;
      rev=(10*rev)+r;
      n=n%10;
    }
    if(t==rev)
    System.out.println("pallindrome");
    else
    System.out.println("not pallindrome");
  }
}
