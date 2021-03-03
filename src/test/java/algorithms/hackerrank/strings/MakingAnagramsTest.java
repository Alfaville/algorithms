package algorithms.hackerrank.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakingAnagramsTest {

    @Test
    public void scenario1() {
        long actual = MakingAnagrams.execute("bacdc", "dcbac");
        assertEquals(0, actual);
    }

    @Test
    public void scenario2() {
        long actual = MakingAnagrams.execute("bacdc", "dcbad");
        assertEquals(2, actual);
    }

    @Test
    public void scenario3() {
        long actual = MakingAnagrams.execute("abc", "amnop");
        assertEquals(6, actual);
    }

    @Test
    public void scenario4() {
        long actual = MakingAnagrams.execute("cde", "abc");
        assertEquals(4, actual);
    }

    @Test
    public void scenario5() {
        long actual = MakingAnagrams.execute("absdjkvuahdakejfnfauhdsaavasdlkj", "djfladfhiawasdkjvalskufhafablsdkashlahdfa");
        assertEquals(19, actual);
    }

}
