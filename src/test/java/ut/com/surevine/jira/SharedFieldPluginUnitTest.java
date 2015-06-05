package ut.com.surevine.jira;

import org.junit.Test;
import com.surevine.jira.SharedFieldPlugin;
import com.surevine.jira.SharedFieldPluginImpl;

import static org.junit.Assert.assertEquals;

public class SharedFieldPluginUnitTest {
	@Test
	public void testMyName() {
		SharedFieldPlugin component = new SharedFieldPluginImpl(null);
		assertEquals("names do not match!", "sharedFieldPlugin",
				component.getName());
	}
}