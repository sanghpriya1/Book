


public class Unicorn {
	public static void main(String[] args) {
		
		int[] distance = {7,10,1,12,11,14,5,0};
		int[] duplicate_distance = new int[2*distance.length];
		for(int i = 0; i < 2*distance.length; i++) {
			duplicate_distance[i] = distance[i%distance.length];
		}
		int start = 7;
		int destination = 2;
		int path_length = 0;
		for(int i = start; i< destination; ++i) {
			path_length += distance[i];
		}
		int another_path_length = 0; 
		for(int j = destination; j < distance.length + start ; j++ ) {
			another_path_length += duplicate_distance[j];
		}
		
		path_length = Math.min(path_length, another_path_length);
		System.out.println(path_length);
	}
}
