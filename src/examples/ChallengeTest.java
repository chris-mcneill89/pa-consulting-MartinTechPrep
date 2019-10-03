package examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChallengeTest {

	@Test
	  public void shouldReturn0Pairs() {
	    Integer expected0 = 0;
	    Integer actual0 = Challenge.numberOfBracePairs("");
	    assertEquals(expected0, actual0);
	  }
	  @Test
	  public void shouldReturnInvalidBecauseUnclosedBrace() {
	    Integer expected0 = -1;
	    Integer actual0 = Challenge.numberOfBracePairs("{[}");
	    assertEquals(expected0, actual0);
	  }
	  @Test
	  public void shouldReturn2Pairs() {
	    Integer expected0 = 2;
	    Integer actual0 = Challenge.numberOfBracePairs("{}[]");
	    assertEquals(expected0, actual0);
	  }
	  
	  @Test
	  public void shouldReturnInvalid() {
	    Integer expected0 = -1;
	    Integer actual0 = Challenge.numberOfBracePairs("{}[](}");
	    assertEquals(expected0, actual0);
	  }
	}
