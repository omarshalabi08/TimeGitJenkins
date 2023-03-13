package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TimeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test 
	void testGetTotalSeconds() {
		fail("Not yet implemented");
	}
	
	@ParameterizedTest

	@ValueSource(strings = { "07:00:00", "07:30:30", "07:59:59" })

	void testGetTotalSeconds(String candidate) {

	int seconds = Time.getTotalSeconds(candidate);

	assertTrue("The seconds were not calculated properly", seconds ==25200 || seconds ==27030 || seconds ==28799 );

	}
	
	@Test
	public void testGetTotalSecondsGood()
	{
	int seconds =
	Time.getTotalSeconds("05:05:05");
	assertTrue("The seconds were not calculated properly", seconds==18305);
	}

	@Test
	public void testGetTotalSecondsBad()
	{
	assertThrows(
	StringIndexOutOfBoundsException.class,
	()-> {Time.getTotalSeconds("03:00");});
	}

	@Test
	void testGetSeconds() {
		fail("Not yet implemented");
	}
	
	@ParameterizedTest

	@ValueSource(strings = { "08:00:00", "08:08:05", "08:59:59" })

	void testGetSeconds(String candidate) {

	int seconds = Time.getSeconds(candidate);

	assertTrue("The seconds were not calculated properly", seconds ==00 || seconds ==05 || seconds ==59 );

	}
	
	@Test
	public void testGetSecondsGood()
	{
	int seconds =
	Time.getSeconds("05:05:05");
	assertTrue("The seconds were not calculated properly", seconds==5);
	}
	
	@Test
	public void testGetSecondsBad()
	{
	assertThrows(
	StringIndexOutOfBoundsException.class,
	()-> {Time.getSeconds("02:00");});
	}
	
	@Test
	void testGetTotalMinutes() {
		fail("Not yet implemented");
	}
	
	@ParameterizedTest

	@ValueSource(strings = { "02:00:00", "02:02:02", "02:59:59" })

	void testGetTotalMinutes(String candidate) {

	int minutes = Time.getTotalMinutes(candidate);

	assertTrue("The minutes were not calculated properly", minutes ==00 || minutes ==02 || minutes ==59 );

	}
	
	@Test
	public void testGetTotalMinutesGood()
	{
	int minutes =
	Time.getTotalMinutes("00:05:00");
	assertTrue("The minutes were not calculated properly", minutes==5);
	}
	
	@Test
	public void testGetTotalMinutesBad()
	{
	assertThrows(
	StringIndexOutOfBoundsException.class,
	()-> {Time.getTotalMinutes("10:0");});
	}
	
	@Test
	void testGetTotalHours() {
		fail("Not yet implemented");
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "05:00:00", "05:15:15",
	"05:59:59" })
	void testGetTotalHours(String candidate) {
	int hours = Time.getTotalHours(candidate);
	assertTrue("The hours were not calculated properly", hours ==5);
	}
	
	@Test
	public void testGetTotalHoursBad()
	{
	assertThrows(
	StringIndexOutOfBoundsException.class,
	()-> {Time.getTotalHours("1");});
	}
	
	@Test
	public void testGetMillisecondsGood()
	{
	int milliseconds =
	Time.getMilliseconds("12:05:05:005");
	assertTrue("The milliseconds were not calculated properly", milliseconds==5);
	}
	
	@Test
	public void testGetTotalMillisecondsGood()
	{
	int milliseconds =
	Time.getTotalMilliseconds("05:05:05:005");
	assertTrue("The milliseconds were ("+milliseconds+") not calculated properly", milliseconds==18305005);
	}
//

}
