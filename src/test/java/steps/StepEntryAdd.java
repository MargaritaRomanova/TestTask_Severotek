package steps;

import pages.EntryAddPage;

public class StepEntryAdd {

    EntryAddPage entryAddPage = new EntryAddPage();

    public void checkTitleTextEntryAddPage(String text){
        entryAddPage.checkTitleTextEntryAddPage(text);
    }

    public void addTextAndPressSave(){
        entryAddPage.fillFieldTitle();
        entryAddPage.fillFieldSlug();
        entryAddPage.fillFieldTextMarkdown();
        entryAddPage.fillFieldText();
        entryAddPage.pressSaveButton();
    }

    public StepBlog goBlogPage(){
        entryAddPage.goBlogPage();
        return new StepBlog();
    }

    public String getTitleValue(){
        return entryAddPage.getTitleValue();
    }
}