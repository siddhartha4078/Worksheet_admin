package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import library.Explicit_timeout;
import library.heighlight;

public class Landing {

	public WebDriver driver;
	public heighlight h;
	public Explicit_timeout e;

	public Landing(WebDriver dr) {
		this.driver = dr;
		h = new heighlight(driver);
		e = new Explicit_timeout(driver);
	}
/*-------------------------------- Worksheet process link -----------------------------------*/
	
	@FindBy(partialLinkText = "Worksheet Process")
	@CacheLookup
	WebElement worksheetprocess_link;

	@FindBy(xpath = "html/body/div[1]/nav/div/ul[1]/li[5]/ul")
	@CacheLookup
	WebElement process_menu;

	@FindBy(partialLinkText = "Dashboard")
	@CacheLookup
	WebElement p_dashboard;

	@FindBy(partialLinkText = "Worksheet Sequence")
	@CacheLookup
	WebElement p_WorksheetSequence;

	@FindBy(partialLinkText = "Question Generation")
	@CacheLookup
	WebElement p_QuestionGeneration;

	@FindBy(partialLinkText = "Default Publish")
	@CacheLookup
	WebElement p_DefaultPublish;

	public void click_on_processlink() {

		h.h(worksheetprocess_link);
		worksheetprocess_link.click();
		h.h(process_menu);
		e.visibility(process_menu);

	}

	public void worksheetprocess_Select_page(String pagename) {

		try {

			if (pagename.equalsIgnoreCase("Dashboard")) {
				h.h(p_dashboard);
				p_dashboard.click();
			}

			else if (pagename.equalsIgnoreCase("Worksheet Sequence")) {
				h.h(p_WorksheetSequence);
				p_WorksheetSequence.click();

			}

			else if (pagename.equalsIgnoreCase("Question Generation")) {
				h.h(p_QuestionGeneration);
				p_QuestionGeneration.click();

			}

			else if (pagename.equalsIgnoreCase("Default Publish")) {
				h.h(p_DefaultPublish);
				p_DefaultPublish.click();

			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
		/*-------------------------------- Worksheet creation  link -----------------------------------*/
		
		@FindBy(partialLinkText = "Creation")
		@CacheLookup
		WebElement WorksheetCreation_link;

		@FindBy(xpath = "html/body/div[1]/nav/div/ul[1]/li[4]/ul")
		@CacheLookup
		WebElement WorksheetCreation_menu;

		@FindBy(partialLinkText = "Template")
		@CacheLookup
		WebElement w_FormulaTemplate;

		@FindBy(partialLinkText = "Creation")
		@CacheLookup
		WebElement w_WorksheetCreation;

		@FindBy(partialLinkText = "Delete")
		@CacheLookup
		WebElement w_WorksheetDelete;



		public void click_on_WorksheetCreationlink() {

			h.h(WorksheetCreation_link);
			WorksheetCreation_link.click();
			h.h(WorksheetCreation_menu);
			e.visibility(WorksheetCreation_menu);

		}

		public void WorksheetCreation_Select_page(String pagename) {

			try {

				if (pagename.equalsIgnoreCase("Formula Template")) {
					h.h(w_FormulaTemplate);
					w_FormulaTemplate.click();
				}

				else if (pagename.equalsIgnoreCase("Worksheet Creation")) {
					h.h(w_WorksheetCreation);
					w_WorksheetCreation.click();

				}

				else if (pagename.equalsIgnoreCase("worksheetdelete")) {
					h.h(w_WorksheetDelete);
					w_WorksheetDelete.click();

				}


			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
	}

}
