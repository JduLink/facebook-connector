
package org.mule.module.facebook.processors;

import java.util.regex.Pattern;
import javax.annotation.Generated;
import org.mule.module.facebook.oauth.FacebookConnectorOAuthManager;
import org.mule.security.oauth.processor.BaseOAuth2AuthorizeMessageProcessor;

@Generated(value = "Mule DevKit Version 3.5.0-SNAPSHOT", date = "2014-03-05T01:25:22-06:00", comments = "Build UNKNOWN_BUILDNUMBER")
public class AuthorizeMessageProcessor
    extends BaseOAuth2AuthorizeMessageProcessor<FacebookConnectorOAuthManager>
{

    private final static Pattern AUTH_CODE_PATTERN = Pattern.compile("code=([^&]+)");

    @Override
    protected String getAuthCodeRegex() {
        return AUTH_CODE_PATTERN.pattern();
    }

    @Override
    protected Class<FacebookConnectorOAuthManager> getOAuthManagerClass() {
        return FacebookConnectorOAuthManager.class;
    }

}