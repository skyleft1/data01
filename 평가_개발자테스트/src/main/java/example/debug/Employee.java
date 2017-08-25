package example.debug;

public class Employee {
    public final int id;
    public final String name;
    
    

    public Employee(int id, String name) {
        this.id  = id;
        this.name = name;
    }


    public boolean isValid(String password) {
         boolean result = false;
         int letterCnt = 0;
         int digitCnt = 0;

         for (int i = 0; i < password.length(); i++) {
              char c = password.charAt(i);
              if (Character.isLetter(c)) letterCnt++;
              else if (Character.isDigit(c)) digitCnt++;
         }

         // 8자리 이상이고(입력 때 체크되지만) 문자와 숫자가 적어도 한 개씩은 있어야 함
         if (password.length() >= 8 && letterCnt > 0 && digitCnt > 0)
              result = true;

         return result;
     }
}
