package wukai1;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int temp;
		int []a={34,56,12,54,67,89,65,33,22,11};
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
