package io.yelp.util;
import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.Token;
/**
 * Created by mikailaakeredolu on 6/20/16.
 */
public class TwoStepOAuth extends DefaultApi10a{
    public String getRequestTokenEndpoint() {
        return null;
    }

    public String getAccessTokenEndpoint() {
        return null;
    }

    public String getAuthorizationUrl(Token token) {
        return null;
    }
}
