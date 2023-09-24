package org.jvnet.jaxb2_commons.tests.one;

import java.io.File;

import org.junit.Assert;
import org.jvnet.jaxb.lang.JAXBCopyStrategy;
import org.jvnet.jaxb.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb.test.AbstractSamplesTest;

public class CopyableTest extends AbstractSamplesTest {

	@Override
	protected void checkSample(File sample) throws Exception {

		final Object original = createContext().createUnmarshaller().unmarshal(
				sample);
		final Object copy = JAXBCopyStrategy.getInstance().copy(null, original);
		Assert.assertTrue("Source and copy must be equal.",
				JAXBEqualsStrategy.INSTANCE.equals(null, null, original, copy));
	}

}
