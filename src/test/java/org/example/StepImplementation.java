package org.example;
import Drivers.Driver;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation {

    /*WebDriver driver= new ChromeDriver();
    public static void main(String[] args){
        String dd="Chrome";

        Driver.main(dd);

    }*/

    enum AllWebElements{
        Isube("#header_internet"),
        Kampanyalar("//div[@id='kampanyaLink0']"),
        DetayliBilgi("(//a[contains(.,'Eminevim’in Elbirliği Sistemi ile içiniz rahat olsun.')])[1]");
        /*txtPassword("#txtPassword"),
        SignIn("#btnLogin"),
        TextSearchBox("div.storefront-app.desktop-app div.containerFullWidth:nth-child(9) div.sf-voltran-body.voltran-body.full.oldHeader:nth-child(2) div.sf-OldHeader-5sPZX div.sf-OldHeader-vf8w1 div.sf-OldHeader-3gtAm div:nth-child(1) div.SearchBoxOld-root div.SearchBoxOld-inputContainer div.desktopOldAutosuggestTheme-container > input.desktopOldAutosuggestTheme-input:nth-child(1)"),
        Search("div.storefront-app.desktop-app div.containerFullWidth:nth-child(9) div.sf-voltran-body.voltran-body.full.oldHeader:nth-child(2) div.sf-OldHeader-5sPZX div.sf-OldHeader-vf8w1 div.sf-OldHeader-3gtAm div:nth-child(1) div:nth-child(2) div:nth-child(1) div.SearchBoxOld-root > div.SearchBoxOld-buttonContainer"),
        ClickProduct("body.desktop.voltran-container.complete:nth-child(2) div.wrapper:nth-child(7) main.content-wrapper:nth-child(3) div.search-results-module:nth-child(2) div.results-wrapper.search-page div.container div.row.padding div.contain-lg-5.contain-md-4.contain-sm-3.fluid div.col.lg-4.md-3.sm-3:nth-child(2) section.page-content.ajaxContainer.loader:nth-child(2) div.results-container:nth-child(1) div.with-hover.big-box:nth-child(4) div.desktop.widget.SearchListing div.box-container.loader:nth-child(1) div.contain-lg-3.contain-md-3.contain-sm-3.fluid.with-bottom-border div.pagination:nth-child(2) ul:nth-child(1) li:nth-child(2) > a.page-2")
       /* SelectProduct("body.desktop.voltran-container.complete:nth-child(2) div.wrapper:nth-child(6) main.content-wrapper:nth-child(3) div.product-detail-module:nth-child(3) section.detail-main:nth-child(2) div.container.contain-lg-4.contain-md-4.contain-sm-1.fluid:nth-child(4) div.productDetailContent div.productDetailRight.col.lg-2.md-2.sm-1.grid-demo-fluid:nth-child(4) div.product-information.col.lg-5.sm-1 div.product-variants-content.variants-select-content:nth-child(7) div.product-variants-wrapper:nth-child(5) div.variant-container-with-prices div.variants-content:nth-child(3) label.price-label.label.white.checked div.variant-info > span.variant-property-price"),
        AddBasket("#addToCart")*/;
        //private String cssSelector;
        private String XPath;

        AllWebElements(String xPath) {
            this.XPath = xPath;
        }
        public String getXPath() {
            return XPath;
        }
       /* AllWebElements(String cssSelector) {
            this.cssSelector = cssSelector;
        }

        public String getCssSelector() {
            return cssSelector;
        }*/
    }


     private Actions actions= new Actions(Driver.webDriver);
     private String Text1;

    @Step("Click to <WebElement> element.")
    public void clickToElement(AllWebElements webElements) {

        WebElement item = Driver.webDriver.findElement(By.xpath(webElements.getXPath()));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        item.click();


    }

    @Step("Select to <WebElement> element.")
    public void selectToElement(AllWebElements webElements) {

        WebElement item = Driver.webDriver.findElement(By.xpath(webElements.getXPath()));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        item.click();


    }
    @Step("Send <String> String to <WebElement> element.")
    public void SendStringToElement(String Coming,AllWebElements webElements) {

        WebElement item = Driver.webDriver.findElement(By.cssSelector(webElements.getXPath()));
        if(Coming.equals("Email"))
            item.sendKeys("sibelldgnn@hotmail.com");

        if(Coming.equals("Password"))
            item.sendKeys("colourful96.");
        if(Coming.equals("Text"))
            item.sendKeys("samsung");

      try {
          Thread.sleep(2000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }



    }


  /*  @Step("The word <word> has <expectedCount> vowels.")
    public void verifyVowelsCountInWord(String word, int expectedCount) {
        int actualCount = countVowels(word);
        assertThat(expectedCount).isEqualTo(actualCount);
    }

    @Step("Almost all words have vowels <wordsTable>")
    public void verifyVowelsCountInMultipleWords(Table wordsTable) {
        for (TableRow row : wordsTable.getTableRows()) {
            String word = row.getCell("Word");
            int expectedCount = Integer.parseInt(row.getCell("Vowel Count"));
            int actualCount = countVowels(word);

            assertThat(expectedCount).isEqualTo(actualCount);
        }
    }

    private int countVowels(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (vowels.contains(ch)) {
                count++;
            }
        }
        return count;
    }*/
}
