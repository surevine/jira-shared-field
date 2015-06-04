package com.surevine.jira;

import com.atlassian.sal.api.ApplicationProperties;

public class SharedFieldPluginImpl implements SharedFieldPlugin
{
    private final ApplicationProperties applicationProperties;

    public SharedFieldPluginImpl(ApplicationProperties applicationProperties)
    {
        this.applicationProperties = applicationProperties;
    }

    public String getName()
    {
        if(null != applicationProperties)
        {
            return "sharedFieldPlugin:" + applicationProperties.getDisplayName();
        }
        
        return "sharedFieldPlugin";
    }
}