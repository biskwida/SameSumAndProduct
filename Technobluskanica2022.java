
public abstract class Technobluskanica2022 {

 public static void counter(int a){
	 String str;
	 for (long i = 1; i <= 2147483647; i++) {		 
		 str = String.valueOf(i);
		 int tempJ = 0;
		 int tempY = 1;
		 char[] charArr = str.toCharArray();
		 
		 for (int j = 0; j < charArr.length; j++) {
			 char digit = charArr[j];
			 int number = Character.getNumericValue(digit);
			 tempJ = number + tempJ;
			 tempY *= number;
			//  System.out.println(tempY);
			 if ((j ==(charArr.length-1))&&(tempY == a)&&(tempJ == a)) {
				System.out.println(i);
			}
		 } 
	 }	  
 }
	
	public static void main(String[] args) {
		counter(18);		
	}
}
