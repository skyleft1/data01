package example.debug;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import example.debug.Employee;
import example.debug.EmployeeList;


public class Test유영기 {

    private static EmployeeList emplist = null; 
    
    @BeforeClass
    public static void setUpClass() {

        emplist = new EmployeeList();

        emplist.addEmployee(new Employee(0, "0"));
        emplist.addEmployee(new Employee(1, "1"));
        emplist.addEmployee(new Employee(2, "2"));
        emplist.addEmployee(new Employee(3, "3"));
        emplist.addEmployee(new Employee(4, "4"));        
        emplist.addEmployee(new Employee(3, "5"));
    }
    
    /* 
     * 문제1. JUnit을 이용하여 
     * emplist가 null 이 아님을 검증하는 테스트 코드들 작성하시오. 
     * 테스트 메서드명: test01
     */
    @Test
    public void test01() {
        assertNotNull(emplist.getList());
    }
    
    /* 
     * 문제2. JUnit을 이용하여 
     * emplist 의 갯수가 5인지를 검증하는 테스트 코드들 작성하시오. 
     * 테스트 메서드명: test02
     */
    @Test
    public void test02() {
        assertEquals(emplist.getList().size() , 5);
    }
    
    /* 문제3. JUnit을 이용하여 
     * emplist 에 targetId=10이 존재하지 않음을 검증하는 테스트 코드들 작성하시오. 
     * 테스트 메서드명: test03
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void test03() {
    //    assertTrue(emplist.getList().contains(emplist.getList().get(10)));
        assertNotNull(emplist.findEmployee(10));
        
    }
   
    
    
    /* 문제4. JUnit을 이용하여 
     * Employee.isValid() 메서드를 검증하는 테스트 코드들 작성하시오. 
     * boolean isValid = new Employee().isValid( "test" );  인 경우에    
     * isValid가 false 가 되면 테스트가 통과 되도록 코드를 작성하시오
     * 테스트 메서드명: test04
     */
    @Test
    public void test04() {
        boolean isValid = new Employee(2, "2").isValid( "test" );
        assertFalse(isValid);
    }
    
    /* 문제5. JUnit을 이용하여 
     * 두 배열이 같음을 검증하는 테스트 코드들 작성하시오. 
     * String names[] = {"y2kpooh","hwang"};
     * String names2[] = {"y2kpooh","hwang"};
     * 테스트 메서드명: test05
     */
    @Test
    public void test05() {
        String names[] = {"y2kpooh","hwang"};
        String names2[] = {"y2kpooh","hwang"};

        assertArrayEquals(names, names2);
    }
}
