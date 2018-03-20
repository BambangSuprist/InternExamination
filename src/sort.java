//Problem 4
public class sort {
	   public static void main(String[] args) {

		    int array[] = {5, 3, 4, 4, 1, 1};
		    int list[][] = new int[4][1];
		    int temp1, temp2, index, max;

		    for(int i=0;i<array.length; i++){
		        list[i][0]=array[i];
		        list[i][4]=i;
		    }

		        for(int i=0; i <array.length-1; i++){
		            max = list[i][0];
		            index = i;

		            for(int j = i+1; j<array.length;j++){
		            if(max<list[j][0]){
		                max = list[j][0];
		                index = j;

		            }
		        }
		            temp1 = list[i][0];
		            temp2 = list[i][1];

		            list[i][0]=max;
		            list[i][1] = index;

		            list[index][0]=temp1;
		            list[index][1]=temp2;




		        }
		        for(int n=0; n<list.length;n++){
		                System.out.println(list[n][0] + " " + list[n][1]);

		        }

	   }
}
