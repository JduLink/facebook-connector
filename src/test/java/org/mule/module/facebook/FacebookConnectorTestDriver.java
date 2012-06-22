/**
 * Mule Facebook Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.facebook;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test Driver for the connector
 */
public class FacebookConnectorTestDriver
{
    /**  */
    private static final String ACCESS_TOKEN = System.getenv("facebookAccessToken");
    private FacebookConnector connector;

    @Before
    public void setup()
    {
        connector = new FacebookConnector();
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testGetPhoto() throws Exception
    {
        final Map<String, Object> res = connector.getPhoto("347528201978388", "");
        assertNotNull((((List<Map<String, Object>>) res.get("images")).get(0)).get("source"));
    }
    
    @Test
    public void getUserPicture() throws Exception
    {
        final Byte[] res = connector.getUserPicture("chackn", "large");
        assertNotNull(res);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void getAlbum()
    {
        final Map<String, Object> res = connector.getAlbum("20531316728", "");
        assertNotNull(((Map<String, Object>) res.get("cover")).get("cover_id"));
    }

    @Test
    @Ignore
    public void testPublishMessage() throws Exception
    {
        final Map<String, Object> res = connector.publishMessage(ACCESS_TOKEN, "me", "testFacebookConnector6",
            "", "", "", "", "");
        assertNotNull(res);
    }
    
    @Test
    public void testLoggedUserDetails()
    {
    	assertNotNull(connector.loggedUserDetails( ACCESS_TOKEN));
    }
    
    @Test
    public void getStatus()
    {
        assertNotNull(connector.getStatus(ACCESS_TOKEN, "367501354973", "0"));
    }
    
    @Test
    public void getVideo()
    {
        assertNotNull(connector.getVideo(ACCESS_TOKEN, "817129783203", "0"));
    }
    
    @Test
    public void getNote()
    {
        assertNotNull(connector.getNote(ACCESS_TOKEN, "122788341354", "0"));
    }

}
