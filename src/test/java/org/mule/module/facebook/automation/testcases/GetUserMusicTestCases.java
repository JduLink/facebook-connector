package org.mule.module.facebook.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.tests.ConnectorTestUtils;

import com.restfb.types.PageConnection;

public class GetUserMusicTestCases extends FacebookTestParent {

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		initializeTestRunMessage("getUserMusicTestData");
			
		String profileId = getProfileId();
		upsertOnTestRunMessage("user", profileId);
		
		List<String> expectedIds = getExpectedMusic();
		upsertOnTestRunMessage("expected", expectedIds);
	}
	
	@SuppressWarnings("unchecked")
	@Category({RegressionTests.class})
	@Test
	public void testGetUserMusic() {
		try {
			List<String> expectedIds = getTestRunMessageValue("expected");

			assertTrue("Please make sure that you have liked a music page on your Facebook account before running this test.", !expectedIds.isEmpty());
			
			List<PageConnection> result = runFlowAndGetPayload("get-user-music");
			for (PageConnection pageConnection : result) {
				assertTrue(expectedIds.contains(pageConnection.getId()));
			}

			assertEquals(expectedIds.size(), result.size());
		}
		catch (Exception e) {
			fail(ConnectorTestUtils.getStackTrace(e));
		}
	}
	
}
