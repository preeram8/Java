import java.util.Arrays;
public class Activity1_4 {

	static void ascendingnumbers(int array[]){
		int size = array.length;
		int i,j;
		
		for(i=1;i<size;i++) {
			int key = array[i];
			j=i-1;
			
			while (j>=0 && key < array[j]) {
				
				array[j+1] = array [j];
				--j;
			}
			array[j + 1] = key;
		}
		}
	
	
	public static void main(String args[]) {
        int[] data = { 99, 5, 1, 4, 3, 90 };
        ascendingnumbers(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
	

}
