package GroupProject2;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakeScreenShot{
    void getScreenShot();
}
interface RemoteWebDriver extends WebDriver,TakeScreenShot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open(){
        System.out.println("ChromeDriver opens");
    }
    @Override
    public void close(){
        System.out.println("ChromeDriver closes");
    }
    @Override
    public String getTitle(){
        return "ChromeDriver";
    }
    @Override
    public void getScreenShot(){
        System.out.println("ChromeDriver Screenshot");
    }
    @Override
    public void navigate(){
        System.out.println("Navigate to ChromeDriver");
    }
}
class FireFoxDriver implements RemoteWebDriver{
    @Override
    public void open(){
        System.out.println("FireFoxDriver opens");
    }
    @Override
    public void close(){
        System.out.println("FireFoxDriver closes");
    }
    @Override
    public String getTitle(){
        return "FireFoxDriver";
    }
    @Override
    public void getScreenShot(){
        System.out.println("FireFoxDriver Screenshot");
    }
    @Override
    public void navigate(){
        System.out.println("Navigate to FireFoxDriver");
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open(){
        System.out.println("SafariDriver opens");
    }
    @Override
    public void close(){
        System.out.println("SafariDriver closes");
    }
    @Override
    public String getTitle(){
        return "SafariDriver";
    }
    @Override
    public void getScreenShot(){
        System.out.println("SafariDriver Screenshot");
    }
    @Override
    public void navigate(){
        System.out.println("Navigate to SafariDriver");
    }
}
class WebDriverTester{
    public static void main(String[] args) {

        RemoteWebDriver r1 []={new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};
        for(RemoteWebDriver r2:r1){
            r2.open();
            r2.close();
            r2.getScreenShot();
            r2.navigate();
            String result=r2.getTitle();
            System.out.println(result);
        }
    }
}

/*
Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and
SafariDriver classes and see which methods available to them.
 */