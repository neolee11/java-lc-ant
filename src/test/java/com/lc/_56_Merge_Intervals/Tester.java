/**
 * Leetcode - _56_Merge_Intervals
 */
package com.lc._56_Merge_Intervals;

import java.util.*;
import com.ciaoshen.leetcode.util.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(Parameterized.class)
public class Tester {

    /**=========================== static for every test cases ============================== */

    // Solution instance to test
    private static Solution solution;
    // use this Object to print the log (call from slf4j facade)
    private static final Logger LOGGER = LoggerFactory.getLogger(TesterRunner.class);

    /** Execute once before any of the test methods in this class. */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        /* uncomment to switch solutions */
        solution = new Solution1();
        // solution = new Solution2();
    }

    /** Execute once after all of the test methods are executed in this class. */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {}

    /** Initialize test cases */
    @Parameters
    public static Collection<Object[]> testcases() {

        List<Interval> case1 = new ArrayList<>();
        Interval case1Int1 = new Interval(1, 3);
        Interval case1Int2 = new Interval(2, 6);
        Interval case1Int3 = new Interval(8, 10);
        Interval case1Int4 = new Interval(15, 18);
        case1.add(case1Int1);
        case1.add(case1Int2);
        case1.add(case1Int3);
        case1.add(case1Int4);

        String resultCase1 = "";
        Interval resultCase1Int1 = new Interval(1, 6);
        Interval resultCase1Int2 = new Interval(8, 10);
        Interval resultCase1Int3 = new Interval(15, 18);
        resultCase1 += resultCase1Int1.toString();
        resultCase1 += resultCase1Int2.toString();
        resultCase1 += resultCase1Int3.toString();

        return Arrays.asList(new Object[][]{
             {case1, resultCase1},     // test case 1 (init parameters below: {para1, para2, expected})
            // {},     // test case 2 (init parameters below: {para1, para2, expected})
            // {}      // test case 3 (init parameters below: {para1, para2, expected})
        });
    }

    /**=========================== for each test case ============================== */

    /** 
     * Parameters for each test (initialized in testcases() method) 
     * You can change the type of parameters
     */
     private List<Interval> para1;                       // parameter 1
    // private Object para2;                       // parameter 2
     private String expected;                    // parameter 3 (expected answer)

    /** This constructor must be provided to run parameterized test. */
    public Tester(List<Interval> para1, String expected) {
           // initialize test parameters
         this.para1 = para1;
    //     this.para2 = para2;
         this.expected = expected;
    }

    /** Execute before each test method in this class is executed. */
    @Before
    public void setUp() throws Exception {}

    /** Executed as a test case. */
    @Test
    public void test() {

         List<Interval> result = solution.merge(para1);
         String actual = "";
         for(Interval res: result){
             actual += res.toString();
         }

         assertThat(actual, is(equalTo(expected)));

         if (LOGGER.isDebugEnabled()) {
             LOGGER.debug("your-method() pass unit test!");
         }
    }

    /** Execute after each test method in this class is executed. */
    @After
    public void tearDown() throws Exception {}

}
