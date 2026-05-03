package SEG11IFE_Entertainment.FourConnectTest;

import SEG11.IFE_Entertainment.FourConnect.FourConnectPlayer;
import SEG11.IFE_Entertainment.FourConnect.Player;
import SEG11.IFE_Entertainment.Infrastructure.BrandingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** wichtige Befehle
 * Alle Tests ausführen
 * mvn test
 *
 * Einzelne Testklasse
 * mvn test -Dtest=FourConnectPlayerTest
 *
 * # Einzelne Testmethode
 * mvn test -Dtest=FourConnectPlayerTest#getTypeTest
 */



class FourConnectPlayerTest {
    private BrandingService currentbranding;
    private FourConnectPlayer fcHumanPlayer;
    private FourConnectPlayer fcEasyPlayer;
    private FourConnectPlayer fcHardPlayer;

    @BeforeEach
    void setup(){
        currentbranding = BrandingService.getInstance();

        fcHumanPlayer = new FourConnectPlayer(Player.HUMAN,null, currentbranding.getPrimaryColor());
        fcEasyPlayer = new FourConnectPlayer(Player.EASYBOT,null, currentbranding.getSecondaryColor());
        fcHardPlayer = new FourConnectPlayer(Player.HARDBOT,null, currentbranding.getSecondaryColor());

    }

    @Test
    void getTypeTest(){
        Player testType = fcHumanPlayer.getType();
        assertEquals(Player.HUMAN, testType);
    }


}
