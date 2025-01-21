// 5 building different hight opposite the sea 
public class DeltaAirlines {

	public static void main(String[] args) {
	int numb = 1221;
	
	int rem=0;
	//int numb = 0;
	int sum = 0;
	int tmp;
	
	tmp = numb;
	while(numb > 0) {
		rem = numb%10;
		sum = (sum*10)+rem;
		numb = numb/10; 
	}
	if(tmp == sum) {
		System.out.println("pal");
	}else {
		System.out.println("no pal");
	}

	}

}
