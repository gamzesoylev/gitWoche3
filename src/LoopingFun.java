
public class LoopingFun {
	public static void main(String[] args) {
		int count=0;
		int a=0;
		int b=0;
		int c=0
		int d=0;
		for(int i=1 ; i <= 100 ; i++)
		{
			if(i%3 == 0 && i%5 == 0)
			{
				System.out.println(i);
			}else if(i%3 == 0){
				System.out.println("foo");
			}else if(i%5 == 0)
			{
				System.out.println("bar");
			}else
			System.out.println(i);
		}
	}
}
