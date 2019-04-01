import org.junit.Test;

import java.lang.reflect.Method;

public class SortingApplicationCliTest {


    @Test
    public void execute_sorting_integration_test() throws Exception {
        Class<?> cls = Class.forName("com.sorting.SortingApplicationCli");
        Method method = cls.getMethod("main", String[].class);
        String[] params = new String[2];
        method.invoke(null, (Object) params);
    }


}
