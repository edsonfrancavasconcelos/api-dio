package apirest.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

	@Test
	public void testTask() {
		Task task = new Task();
		task.setId(1L);
		task.setDescription("Test Task");
		task.setCompleted(true);

		assertEquals(1L, task.getId());
		assertEquals("Test Task", task.getDescription());
		assertTrue(task.isCompleted());
	}
}
