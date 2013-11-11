/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.module.facebook.automation.testcases;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.tests.ConnectorTestUtils;

import com.restfb.types.User;

public class LoggedUserDetailsTestCases extends FacebookTestParent {
	
	@Category({SmokeTests.class, RegressionTests.class})
	@Test
	public void testLoggedUserDetails() {
		try {
			User loggedIn = runFlowAndGetPayload("logged-user-details");
			assertNotNull(loggedIn);
			assertTrue(StringUtils.isNotBlank(loggedIn.getId()));
		}
		catch (Exception e) {
			fail(ConnectorTestUtils.getStackTrace(e));
		}
	}
	
}
