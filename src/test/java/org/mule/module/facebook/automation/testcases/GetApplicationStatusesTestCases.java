/**
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.module.facebook.automation.testcases;

import com.restfb.types.StatusMessage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.tests.ConnectorTestUtils;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GetApplicationStatusesTestCases extends FacebookTestParent {

    @SuppressWarnings("unchecked")
    @Before
    public void setUp() throws Exception {
        initializeTestRunMessage("getApplicationStatusesTestData");

        String profileId = getProfileId();
        upsertOnTestRunMessage("profileId", profileId);
    }

    @SuppressWarnings("unchecked")
    @Category({RegressionTests.class})
    @Test
    public void testGetApplicationStatuses() {
        try {
            List<StatusMessage> statusMessages = runFlowAndGetPayload("get-application-statuses");
            assertTrue(statusMessages.isEmpty());
        } catch (Exception e) {
            fail(ConnectorTestUtils.getStackTrace(e));
        }
    }

    @After
    public void tearDown() throws Exception {

    }
}
