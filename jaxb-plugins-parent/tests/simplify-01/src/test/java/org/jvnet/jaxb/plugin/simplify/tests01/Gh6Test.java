package org.jvnet.jaxb.plugin.simplify.tests01;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Gh6Test {

	private JAXBContext context;

	@Before
	public void setUp() throws Exception {
		context = JAXBContext.newInstance(getClass().getPackage().getName());
	}

	@Test
	public void compiles() {
		final SimplifyElementsPropertyAsElementPropertyType item = new SimplifyElementsPropertyAsElementPropertyType();
		item.getInts();
        item.isSetInts();
		item.getStrings();
        item.isSetStrings();
	}

	public void testElementsPropertyAsElementPropertyType() throws Exception {

		@SuppressWarnings("unchecked")
		SimplifyElementsPropertyAsElementPropertyType value = ((JAXBElement<SimplifyElementsPropertyAsElementPropertyType>) context
				.createUnmarshaller().unmarshal(
						getClass().getResourceAsStream("simplifyElementsPropertyAsElementProperty.xml")))
				.getValue();

		Assert.assertEquals(3, value.getStrings().size());
		Assert.assertEquals(3, value.getInts().size());
	}
}
