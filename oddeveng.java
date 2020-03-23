import java.util.*;
class oddeveng
{
	public static void main(String arg[])
	{
		Scanner ob1=new Scanner(System.in);
		Scanner ob=new Scanner(System.in);
		System.out.println("choose odd or even");
		String ch=ob1.nextLine();
		int rc=0,rh=0,pl=0;
		int c=(int)(Math.random()*10);
		String b="";
		if(c%2==0)
		{
			if(ch.equals("even"))
			{
				System.out.println("you won");
				System.out.println("choose batting or balling\nto bat first type bat\nto ball first type ball");
				b=ob1.nextLine();
				if(b.equals("ball"))
				{
					System.out.println("you are balling game starts now");
					for(;;)
					{
						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
						c=(int)(Math.random()*10);
						if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("computer is out \n\nruns= "+rc);
							break;
						}
						rc=rc+c;
					}
						System.out.println("its your batting");
					for(;;)
					{

						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
							c=(int)(Math.random()*10);
						if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("you are out \n\nruns= "+rh);
							System.out.println("\n*****you lost*****");
							break;
						}
						rh=rh+pl;
						if(rh>rc)
						{
							System.out.println("you won\n\nyour runs="+rh+"\ncomputer made "+rc+" runs");
							break;
						}
					}
					if(rh==rc)
					System.out.println("*****its a tie*****");
				}
				if(b.equals("bat"))
				{
					System.out.println("you are batting game starts now");
					for(;;)
					{
						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
						c=(int)(Math.random()*10);
						if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("you are out \n\nruns= "+rh);
							break;
						}
						rh=rh+pl;
					}
					System.out.println("its your balling");
					for(;;)
					{

						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
							c=(int)(Math.random()*10);
							if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("you won");
							System.out.println("computer is out \n\nruns= "+rc);
							break;
							}
						rc=rc+c;
						if(rh<rc)
						{
							System.out.println("you lost\n\nyour runs="+rh+"\ncomputer made "+rc+" runs");
							break;
						}
					}
					if(rh==rc)
					System.out.println("*****its a tie*****");
					}
				}
			else
			{
				if(ch.equals("odd"))
				System.out.println("you lost");
				c=(int)Math.random()*10;
				if(c%2==0)
				b="ball";
				else
				b="bat";
				if(b.equals("ball"))
				{
					System.out.println("you are balling game starts now");
					for(;;)
					{
						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
						c=(int)(Math.random()*10);
						if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("computer is out \n\nruns= "+rc);
							break;
						}
						rc=rc+c;
					}
					System.out.println("its your batting");
					for(;;)
					{

						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
						c=(int)(Math.random()*10);
						if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("you are out \n\nruns= "+rh);
							System.out.println("\n*****you lost*****");
							break;
						}
						rh=rh+pl;
						if(rh>rc)
						{
							System.out.println("you won\n\nyour runs="+rh+"\ncomputer made "+rc+" runs");
							break;
						}
					}
					if(rh==rc)
					System.out.println("*****its a tie*****");
				}
				if(b.equals("bat"))
				{
					System.out.println("you are batting game starts now");
					for(;;)
					{
						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
						c=(int)(Math.random()*10);
						if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("you are out \n\nruns= "+rh);
							break;
						}
						rh=rh+pl;
					}
					System.out.println("its your balling");
					for(;;)
					{

						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
						c=(int)(Math.random()*10);
						if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("you won");
							System.out.println("computer is out \n\nruns= "+rc);
							break;
						}
						rc=rc+c;
						if(rh<rc)
						{
							System.out.println("you lost\n\nyour runs="+rh+"\ncomputer made "+rc+" runs");
							break;
						}
					}
					if(rh==rc)
					System.out.println("*****its a tie*****");
				}
			}
		}
		else if(c%2!=0)
		{
		    if(ch.equals("odd"))
			{
				System.out.println("you won");
				System.out.println("choose batting or balling\nto bat first type bat\nto ball first type ball");
				b=ob1.nextLine();
				if(b.equals("ball"))
				{
					System.out.println("you are balling game starts now");
					for(;;)
					{
						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
						c=(int)(Math.random()*10);
						if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("computer is out \n\nruns= "+rc);
							break;
						}
						rc=rc+c;
					}
					System.out.println("its your batting");
					for(;;)
					{

						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
							c=(int)(Math.random()*10);
						if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("you are out \n\nruns= "+rh);
							System.out.println("\n*****you lost*****");
							break;
						}
						rh=rh+pl;
						if(rh>rc)
						{
							System.out.println("you won\n\nyour runs="+rh+"\ncomputer made "+rc+" runs");
							break;
						}
					}
					if(rh==rc)
					System.out.println("*****its a tie*****");
				}
				if(b.equals("bat"))
				{
					System.out.println("you are batting game starts now");
					for(;;)
					{
						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
						c=(int)(Math.random()*10);
						if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("you are out \n\nruns= "+rh);
							break;
						}
						rh=rh+pl;
					}
					System.out.println("its your balling");
					for(;;)
					{

						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
							c=(int)(Math.random()*10);
							if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("you won");
							System.out.println("computer is out \n\nruns= "+rc);
							break;
							}
						rc=rc+c;
						if(rh<rc)
						{
							System.out.println("you lost\n\nyour runs="+rh+"\ncomputer made "+rc+" runs");
							break;
						}
					}
					if(rh==rc)
					System.out.println("*****its a tie*****");
					}
				}
			else
			{
				if(ch.equals("even"))
				System.out.println("you lost");
				c=(int)Math.random()*10;
				if(c%2==0)
				b="ball";
				else
				b="bat";
				if(b.equals("ball"))
				{
					System.out.println("you are balling game starts now");
					for(;;)
					{
						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
						c=(int)(Math.random()*10);
						if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("computer is out \n\nruns= "+rc);
							break;
						}
						rc=rc+c;
					}
					System.out.println("its your batting");
					for(;;)
					{

						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
						c=(int)(Math.random()*10);
						if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("you are out \n\nruns= "+rh);
							System.out.println("\n*****you lost*****");
							break;
						}
						rh=rh+pl;
						if(rh>rc)
						{
							System.out.println("you won\n\nyour runs="+rh+"\ncomputer made "+rc+" runs");
							break;
						}
					}
					if(rh==rc)
					System.out.println("*****its a tie*****");
				}
				if(b.equals("bat"))
				{
					System.out.println("you are batting game starts now");
					for(;;)
					{
						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
						c=(int)(Math.random()*10);
						if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("you are out \n\nruns= "+rh);
							break;
						}
						rh=rh+pl;
					}
					System.out.println("its your balling");
					for(;;)
					{

						pl=ob.nextInt();
						c=(int)(Math.random()*10);
						while(c>6 || c<=0)
						c=(int)(Math.random()*10);
						if(pl>6 || pl<=0)
						{
							System.out.println("out of range\n");
							continue;
						}
						System.out.println(c+"\n");
						if(pl==c)
						{
							System.out.println("you won");
							System.out.println("computer is out \n\nruns= "+rc);
							break;
						}
						rc=rc+c;
						if(rh<rc)
						{
							System.out.println("you lost\n\nyour runs="+rh+"\ncomputer made "+rc+" runs");
							break;
						}
					}
					if(rh==rc)
					System.out.println("*****its a tie*****");
				}
			}
		}

	}
}
/*
choose odd or even
odd
you lost
you are balling game starts now
4
6

5
4

3
4

5
6

6
4


9
out of range

82
out of range

1
1

computer is out

runs= 24
its your batting
5
1

6
1

4
4

you are out

runs= 11

*****you lost*****
Press any key to continue . . .
*/