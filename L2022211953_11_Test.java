import com.itheima.Solution;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class L2022211953_11_Test {

    private final Solution solution = new Solution();

    /**
     * 测试目的：验证正常情况下的三数之和
     * 用到的测试用例：
     * 输入：[-1, 0, 1, 2, -1, -4]
     * 预期输出：[[-1, -1, 2], [-1, 0, 1]]
     */
    @Test
    public void testThreeSumNormalCase() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        List<List<Integer>> actual = solution.threeSum(nums);
        assertEquals(expected.size(), actual.size());
        assertEquals(new HashSet<>(expected), new HashSet<>(actual)); // 使用 HashSet 去重比较
    }

    /**
     * 测试目的：验证无解情况
     * 用到的测试用例：
     * 输入：[0, 1, 1]
     * 预期输出：[]
     */
    @Test
    public void testThreeSumNoSolution() {
        int[] nums = {0, 1, 1};
        List<List<Integer>> expected = Arrays.asList();
        List<List<Integer>> actual = solution.threeSum(nums);
        assertEquals(expected, actual);
    }

    /**
     * 测试目的：验证所有元素相同的数组
     * 用到的测试用例：
     * 输入：[0, 0, 0]
     * 预期输出：[[0, 0, 0]]
     */
    @Test
    public void testThreeSumAllZeros() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));
        List<List<Integer>> actual = solution.threeSum(nums);
        assertEquals(expected, actual);
    }

    /**
     * 测试目的：验证空数组情况
     * 用到的测试用例：
     * 输入：[]
     * 预期输出：[]
     */
    @Test
    public void testThreeSumEmptyArray() {
        int[] nums = {};
        List<List<Integer>> expected = Arrays.asList();
        List<List<Integer>> actual = solution.threeSum(nums);
        assertEquals(expected, actual);
    }

    /**
     * 测试目的：验证只有两个元素的数组
     * 用到的测试用例：
     * 输入：[1, -1]
     * 预期输出：[]
     */
    @Test
    public void testThreeSumTwoElements() {
        int[] nums = {1, -1};
        List<List<Integer>> expected = Arrays.asList();
        List<List<Integer>> actual = solution.threeSum(nums);
        assertEquals(expected, actual);
    }
}
