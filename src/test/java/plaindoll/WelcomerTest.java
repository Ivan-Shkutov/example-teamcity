package plaindoll;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class WelcomerTest {

    private final Welcomer welcomer = new Welcomer();

    // Проверка стандартных реплик
    @Test
    public void welcomerSaysWelcome() {
        assertThat(welcomer.sayWelcome(), containsString("Welcome"));
    }

    @Test
    public void welcomerSaysFarewell() {
        assertThat(welcomer.sayFarewell(), containsString("Farewell"));
    }

    @Test
    public void welcomerSaysHunterInWelcomeAndFarewell() {
        assertThat(welcomer.sayWelcome(), containsString("hunter"));
        assertThat(welcomer.sayFarewell(), containsString("hunter"));
    }

    @Test
    public void welcomerSaysNeedGold() {
        assertThat(welcomer.sayNeedGold(), containsString("gold"));
    }

    @Test
    public void welcomerSaysSomething() {
        assertThat(welcomer.saySome(), containsString("something"));
    }

    // Проверка нового метода sayHunterReply()
    @Test
    public void sayHunterReplyContainsHunter() {
        String reply = welcomer.sayHunterReply();
        assertTrue("Reply should contain 'hunter'", reply.toLowerCase().contains("hunter"));
    }
}
