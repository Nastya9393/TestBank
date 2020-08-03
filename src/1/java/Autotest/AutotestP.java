//package Autotest;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class AutotestP {
//    WebDriver driver;
//
//    @BeforeTest
//    public void setup() {
//        System.setProperty("webdriver.chrome.driver", "/home/nastya/IdeaProjects/automation_12_07/src/main/resources/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); /*ожидание*/
//        driver.get("https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2" +
//                "Fidemo.bspb.ru%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&" +
//                "force_new_session=true");
//    }
//
//
//    @Test /*Login+ Password+*/
//    public void validData() {
//
//        WebElement username = driver.findElement(By.name("username"));
//        username.clear();
//        username.sendKeys("demo");
//
//        WebElement password = driver.findElement(By.name("password"));
//        password.clear();
//        password.sendKeys("demo");
//
//        WebElement button = driver.findElement(By.id("login-button"));
//        button.click();
//    }
//
//    @Test /*Login- Password-*/
//    public void emptyFields() {
//
//        WebElement username = driver.findElement(By.name("username"));
//        username.clear();
//
//        WebElement password = driver.findElement(By.name("password"));
//        password.clear();
//
//        WebElement button = driver.findElement(By.id("login-button"));
//        button.click();
//    }
//
//    @Test /*Login+ Password-*/
//    public void filledLoginEmptyPassword() {
//
//        WebElement username = driver.findElement(By.name("username"));
//        username.clear();
//        username.sendKeys("demo");
//
//        WebElement password = driver.findElement(By.name("password"));
//        password.clear();
//
//        WebElement button = driver.findElement(By.id("login-button"));
//        button.click();
//    }
//
//    @Test /*Login- Password+*/
//    public void emptyLoginFilledPassword() {
//
//        WebElement username = driver.findElement(By.name("username"));
//        username.clear();
//
//        WebElement password = driver.findElement(By.name("password"));
//        password.clear();
//        password.sendKeys("demo");
//
//        WebElement button = driver.findElement(By.id("login-button"));
//        button.click();
//    }
//
//    @AfterTest /*После теста*/
//    public void main(String[] args) {
//        WebElement proverka = driver.findElement(By.id("opt-code-text"));
//        if (proverka == proverka) {
//            System.out.println("Авторизация прошла успешно!");
//        } else {
//            System.out.println("Авторизация не выполнена");
//        }
//        driver.quit();
//
//    }
//}
//
//
//
///*
//Сcылка если вошел
//https://idemo.bspb.ru/auth/otp?authOptionId=SMS%3A10005
//
//Ссылка если не вошел
//https://idemo.bspb.ru/auth/login
//*/
//
//
//
//
