package net.bcarlso.tdd;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MicroBlogTest {
	@Test
	public void shouldBeAbleToPost() throws Exception {
		MicroBlog blog = new MicroBlog();
		User user = new User("bcarlso");
		
		Post post = blog.post(user, "Message");
		List<Post> expectedTimeline = Arrays.asList(post);
		
		assertEquals(user, post.user());
		assertEquals("Message", post.message());
		assertEquals(expectedTimeline, blog.postTimeline());
	}
}
