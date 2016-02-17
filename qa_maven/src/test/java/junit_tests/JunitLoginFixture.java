//package junit_tests;
//
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import pages.HomePage;
//import pages.LoginPage;
//
//public class JunitLoginFixture extends JunitBrowserFixture {
//
//    protected static HomePage homePage;
//    protected static LoginPage loginPage;
//
//    @BeforeClass
//    public static void setUp() {
//
//        driver.get(URL);
//        log.info(String.format("\nstart test.\n"));
//
//        homePage = new HomePage(driver);
//        loginPage = new LoginPage(driver);
//
//    }
//
//    @AfterClass
//    public static void tearDown() {
//        log.info(String.format("end test."));
//    }
//
//}
