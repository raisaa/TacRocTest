package com.ermira.raisa.tacrox.test;

/**This is a simple test for layout*/


import com.ermira.raisa.tacrox.EditQuote;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.ermira.raisa.tacrox.R;

public class LayoutTest extends ActivityInstrumentationTestCase2<EditQuote> {
	
	// The items that we want to test. They are some of the layout items in add_quote.xml
	
	private EditText textAuthor; 
	private TextView itemTextView;
	private TextView amountTextView;
	private Button saveButton;
			
	
	public LayoutTest() {
		super("com.ermira.raisa.tacrox", EditQuote.class);
		
	}

		protected void setUp() throws Exception {
		super.setUp();
        EditQuote startTest = getActivity();  
        itemTextView = (TextView) startTest.findViewById(R.id.itemTextView);
        amountTextView = (TextView) startTest.findViewById(R.id.amountTextView );
                textAuthor = (EditText) startTest.findViewById(R.id.textAuthor);
        saveButton = (Button) startTest.findViewById(R.id.saveButton);
			
		
	}
	

	
	//This method test if this items(button, TextFiled, TextView) are null or not
	public void testButton() { 
		
		    assertNotNull(getActivity());
	    	assertNotNull(itemTextView);
			assertNotNull(amountTextView);
			assertNotNull(textAuthor);
			assertNotNull(textAuthor);
			assertNotNull(saveButton);
			
			
		}  
	
		//This method test the value of TextField
	
	public void testText() {
		
	    assertEquals("",itemTextView.getText());
	    assertEquals("",amountTextView.getText());
	}
	
		
	}

