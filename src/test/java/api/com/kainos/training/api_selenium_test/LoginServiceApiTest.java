package api.com.kainos.training.api_selenium_test;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Response;

import org.junit.Ignore;
import org.junit.Test;

import com.kainos.training.jersey.client.BaseClient;

public class LoginServiceApiTest {

	@Test
	public void testLoginMethodSuccess() {
		BaseClient client = new BaseClient();
		Response clientResponse = client.getLogin("admin", "password");
		assertEquals(clientResponse.getStatus(), 200);
	}

	@Test
	public void testLoginMethodNullUsername() {
		BaseClient client = new BaseClient();
		Response clientResponse = client.getLogin(null, "password");
		assertEquals(clientResponse.getStatus(), 400);
	}

	@Test
	public void testLoginMethodIncorrectPassword() {
		BaseClient client = new BaseClient();
		Response clientResponse = client.getLogin("admin", "incorrect");
		assertEquals(clientResponse.getStatus(), 401);
	}
}
