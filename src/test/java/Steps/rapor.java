package Steps;

import cucumber.api.java.tr.Ve;

public class rapor extends Hooks{
    @Ve("deneme yapalimmi")
    public void denemeYapalimmi() throws Throwable{
        setUp();
        setUpTest();
        test1();
        tearDown();
    }
}
