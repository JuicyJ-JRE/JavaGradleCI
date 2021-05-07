package GradleDemo;

import static org.testng.Assert.*;
import org.testng.annotations.*;

public class tester{
    @Test public void appHasAGreeting(){
        App myApp = new App();
        assertNotNull(myApp.getGreeting(),"app should have a greeting");
    }
}