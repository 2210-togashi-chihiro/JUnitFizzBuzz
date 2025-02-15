package sumple;

public class FizzBuzz {

	  public static void main(String[] args) {
	        // 挙動の確認用に1〜100までの整数を引数にして「checkFizzBuzz」を呼び出す
	        for(int i = 1; i <= 100; i++) {
	            System.out.println(checkFizzBuzz(i));
	        }
	    }

	    /*
	     * 引数numが3の倍数なら「Fizz」
	     * 5の倍数なら「Buzz」
	     * 3と5両方の倍数なら「FizzBuzz」
	     * それ以外ならそのまま数字を戻り値として返す
	     *
	     * 引数 int
	     * 戻り値 String
	     */
	    public static String checkFizzBuzz(int num) {
	    	String judge = "";
			int numi = num;

			if (numi % 3 == 0 && numi % 5 == 0) {
				judge = "FizzBuzz";
			} else if (numi % 3 == 0) {
				judge = "Fizz";
			} else if (numi % 5 == 0) {
				judge = "Buzz";
			} else {
				judge = String.valueOf(numi);
			}
	        return judge;
	    }

}



/*
https://digital-literacy88.com/junit-assertequals/
*/