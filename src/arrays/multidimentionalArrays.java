package arrays;

public class multidimentionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{10,2,3},{4,5,6},{7,80,9}};
		int m=a[0][0];
//		Smallest num in array
		/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<m)
				{
					m=a[i][j];
				}
			}
		}System.out.println(m);*/
		
//		largest num in array
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]>m)
				{
					m=a[i][j];
				}
			}
		}System.out.println(m);
		

	}

}
