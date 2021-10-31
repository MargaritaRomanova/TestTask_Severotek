package steps;

import pages.BlogPage;

public class StepBlog {

    BlogPage blogPage = new BlogPage();

    public StepModifyEntry selectElement(String text){
        blogPage.findCurrentEntryAndPress(text);
        return new StepModifyEntry();
    }
}