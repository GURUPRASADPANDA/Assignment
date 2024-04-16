
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char arr[]= {'c','a','r','b','o','n'};
		
		for(int i = 0 ; i<arr.length ; i++) {
			for(int j = 0 ; j<arr.length ; j++){
				for(int k = 0 ; k<arr.length ; k++) {
					for(int l = 0 ; l<arr.length ; l++) {
						for(int m = 0 ; m<arr.length ; m++){
							for(int n = 0 ; n<arr.length ; n++) {
								for(int o = 0 ; o<arr.length ; o++) {
									if(i!=j && j!=k && k!=l && l!=m && m!=n && n!=o && i!=k &&
											i!=l && i!=m && i!=n && i!=o && j!=m && j!=n && j!=o 
											&& k!=m && k!=n && k!=o && l!=n && l!=o && m!=o) {
										
									System.out.print(arr[i]);
									System.out.print(arr[j]);
									System.out.print(arr[k]);
									System.out.print(arr[l]);
									System.out.print(arr[m]);
									System.out.println(arr[n]);
									
									}
								}
							
							}
						}
					}
				}
			}
		}
		
	}

}
