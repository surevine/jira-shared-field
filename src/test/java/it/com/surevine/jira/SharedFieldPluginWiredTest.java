package it.com.surevine.jira;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.atlassian.plugins.osgi.test.AtlassianPluginsTestRunner;
import com.surevine.jira.SharedFieldPlugin;
import com.atlassian.sal.api.ApplicationProperties;

import static org.junit.Assert.assertEquals;

@RunWith(AtlassianPluginsTestRunner.class)
public class SharedFieldPluginWiredTest {
	private final ApplicationProperties applicationProperties;
	private final SharedFieldPlugin plugin;

	public SharedFieldPluginWiredTest(ApplicationProperties applicationProperties,
			SharedFieldPlugin plugin) {
		this.applicationProperties = applicationProperties;
		this.plugin = plugin;
	}

	@Test
	public void testMyName() {
		assertEquals("names do not match!", "sharedFieldPlugin:"
				+ applicationProperties.getDisplayName(), plugin.getName());
	}
}