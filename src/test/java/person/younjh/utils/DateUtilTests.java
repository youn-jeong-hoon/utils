package person.younjh.utils;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes=DateUtilTests.class)
public class DateUtilTests {

	@Test
	public void getToday() {
		assertEquals(DateUtil.getToday().length(), 10);
		assertEquals(DateUtil.getToday("").length(), 8);
		assertEquals(DateUtil.getToday(null).length(), 10);
	}

	@Test
	public void getCurrentDatetime() {
		assertEquals(DateUtil.getCurrentDatetime().length(), 19);
		assertEquals(DateUtil.getCurrentDatetime("").length(), 17);
		assertEquals(DateUtil.getCurrentDatetime(null).length(), 19);
	}
}
