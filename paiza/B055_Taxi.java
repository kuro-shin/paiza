package paiza;
import java.util.Scanner;

public class B055_Taxi {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();//タクシーの種類
		int X = sc.nextInt();//目的地までの距離

		int fare[] =new int[N];
		for (int x : fare)
			fare[x] = 0;

		for (int i = 0; i < N; i++) {
			int starting_distance = sc.nextInt(); //初乗り距離
			int starting_fare = sc.nextInt(); //初乗り運賃
			int additional_distance = sc.nextInt(); //加算距離
			int additional_fare = sc.nextInt(); //加算運賃
			int sum_distance = X ;

			if (sum_distance >= starting_distance) {
				sum_distance -= starting_distance;
				fare[i] += starting_fare;
			}else{
				sum_distance = 0 ;
				fare[i] += starting_fare;
				continue ;
			}


			fare[i] += additional_fare*((sum_distance/additional_distance)+1);

		}


		int max = fare[0] ;
		int min = fare[0] ;
	for (int j = 1; j < N; j++) {
		if(max<fare[j])max=fare[j];
		if(min>fare[j])min=fare[j];
	}

		System.out.println(min+" "+max);

	}

}
