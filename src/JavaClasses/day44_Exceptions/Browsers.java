package JavaClasses.day44_Exceptions;

public class Browsers {

    public void openBrowser(){
        System.out.println("opens the default browser");
    }

    public void closeBrowser(){
        System.out.println("closes the default browser");
    }



}

class Chrome extends Browsers {
    @Override
    public void openBrowser(){
        System.out.println("opening the chrome browser");
    }

    public void closeBrowser(){
        System.out.println("closing the chrome browser");
    }

}

class Safari extends Browsers{
    @Override
    public void openBrowser(){
        System.out.println("opening the safari browser");
    }

    public void closeBrowser(){
        System.out.println("closing the safari browser");
    }
}

class Opera extends Browsers {
    @Override
    public void openBrowser(){
        System.out.println("opening the opera browser");
    }

    public void closeBrowser(){
        System.out.println("closing the opera browser");
    }

}

class Test {

    public static void main(String[] args) {

        Chrome chrome = new Chrome();

        chrome.openBrowser();
        chrome.closeBrowser();
        System.out.println("========================");

        Safari safari = new Safari();

        safari.openBrowser();
        safari.closeBrowser();
        System.out.println("===========================");

        Opera opera = new Opera();

        opera.openBrowser();
        opera.closeBrowser();


    }

}