package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class EntryAddPage extends BasePage{

    @FindBy(xpath = "//div[@id='content']//h1")
    private WebElement titleEntryAddPage;

    @FindBy(id = "id_title")
    private WebElement fieldTitle;

    @FindBy(id = "id_slug")
    private WebElement fieldSlug;

    @FindBy(id = "id_text_markdown")
    private WebElement fieldTextMarkdown;

    @FindBy(id = "id_text")
    private WebElement fieldText;

    @FindBy(xpath = "//div[@class='submit-row']//input[@value='Сохранить']")
    private WebElement saveButton;

    private String titleValue;

    public String getTitleValue(){
        return titleValue;
    }

    public EntryAddPage(){
        super();
    }

    public void checkTitleTextEntryAddPage(String text){
        assertEquals(titleEntryAddPage.getText(), text,"Wrong text has been displayed!");
    }

    public void fillFieldTitle(){
        fieldTitle.click();
        titleValue = "Title" +randomGeneration();
        fieldTitle.sendKeys(titleValue);
    }

    public void fillFieldSlug(){
        fieldSlug.click();
        fieldSlug.clear();
        fieldSlug.sendKeys("Slug"+randomGeneration());
    }

    public void fillFieldTextMarkdown(){
        fieldTextMarkdown.click();
        fieldTextMarkdown.sendKeys("Slug"+randomGeneration());
    }

    public void fillFieldText(){
        fieldText.click();
        fieldText.sendKeys("Slug"+randomGeneration());
    }

    public void pressSaveButton(){
        saveButton.click();
    }
}