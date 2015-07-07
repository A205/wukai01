package wukai1;

import java.util.Random;

public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a=new int[20][5];
		String[] courseName={"coreC++","coreJava","Servlet","JSP","EJB"};
		for(int i=0;i<20;i++){
			for(int j=0;j<5;j++){
				a[i][j]=(int)(Math.random()*100);
			}
		}
		String Index=new String();
		for(int j=0;j<5;j++){
			Index=courseName[j]+" ";
			System.out.print(Index);
		}
		System.out.println("\n");
		for(int i=0;i<20;i++){
			for(int j=0;j<5;j++){
				System.out.print(a[i][j]+"     ");
			}
			System.out.println('\t');
			System.out.println('\n');
		}
//求总分平均分
		int[] studentTotalScore=new int[20];
		int[] studentAverageScore=new int[20];
		for(int i=0;i<20;i++){
			for(int j=0;j<5;j++)
			{
				studentTotalScore[i]=studentTotalScore[i]+a[i][j];
				
			}
			studentAverageScore[i]=(int)(studentTotalScore[i]/5);
		}
		for(int i=0;i<20;i++){
			System.out.println(" 学号  "+i+"  总分  "+studentTotalScore[i]+"  平均分  "+studentAverageScore[i]+"\n");
		}
	}

}
