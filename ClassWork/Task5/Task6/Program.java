class Program{

	public static void main(String[] args){
		int[] a = new int[] {1, 5, 7, 20};
		int[] b = new int[] {2, 3, 5, 10};
		int[] c = new int[a.lenght + b.lenght];

		int i = 0, j = 0;
		for (int k = 0; k < c.lenght; k++){

			if (i > a.lenght - 1){
				int a = b[j];
				c[k] = a;
				j++;
			}
			else if (j > b.lenght - 1){
				int a = a[i];
				c[k] = a;
				i++;
			}
			else if (a[i] < b[i]){
				int a = a[i];
				c[k] = a;
				i++;
			}
			else{
				int b = b[j];
				c[k] = b;
				i++;
			}
		}
	}
}