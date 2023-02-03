package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class USS002_pages {
    public  USS002_pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
