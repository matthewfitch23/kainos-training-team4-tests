package api.com.kainos.training.api_selenium_test;

import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Random;
import javax.ws.rs.core.Response;
import org.junit.Test;
import com.kainos.training.blackbox.client.FriendClient;
import com.kainos.training.blackboxinterface.model.person.Person;

public class FriendServiceApiTest {

	@Test
	public void testAddFriendSuccessful() {
		Random r = new Random();
		FriendClient client = new FriendClient();
		Person friend = new Person();
		
		String randomName = "Chris" + r.nextInt();
		friend.setName(randomName);

		Response response = client.addFriend(friend);
		assertEquals(response.getStatus(), 200);
		
		List<Person> actualPeople = client.getFriendsList();
		
		int lastPersonIndex = actualPeople.size() - 1;
		assertEquals(friend.getName(), actualPeople.get(lastPersonIndex).getName());
	}

}
