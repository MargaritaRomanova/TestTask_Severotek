package steps;

import pages.ModifyEntryPage;

public class StepModifyEntry {

    ModifyEntryPage modifyEntryPage = new ModifyEntryPage();

    public StepDeleteEntry pressDeleteButton(){
        modifyEntryPage.pressDeleteButton();
        return new StepDeleteEntry();
    }
}