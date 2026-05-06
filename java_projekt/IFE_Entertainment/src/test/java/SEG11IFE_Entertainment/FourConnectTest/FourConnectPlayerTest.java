package SEG11IFE_Entertainment.FourConnectTest;

import SEG11.IFE_Entertainment.FourConnect.*;
import SEG11.IFE_Entertainment.GameCore.IMoveStrategy;
import SEG11.IFE_Entertainment.Infrastructure.BrandingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

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
    private FourConnectRules fcRules;
    private FourConnectGame fcGame;

    private FourConnectPlayer fcHumanPlayer;
    private FourConnectPlayer fcHardPlayer;

    @BeforeEach
    void setup(){
        currentbranding = BrandingService.getInstance();
        fcRules = new FourConnectRules();
        fcGame = FourConnectGame.getInstance();

        fcHumanPlayer = new FourConnectPlayer(Player.HUMAN,null, currentbranding.getPrimaryColor());
        fcHardPlayer = new FourConnectPlayer(Player.HARDBOT,null, currentbranding.getSecondaryColor());

    }

    @Test
    void getTypeTest(){
        Player testType = fcHumanPlayer.getType();
        assertEquals(Player.HUMAN, testType);
    }

    @Test
    void getStrategyTest(){
        FourConnectBotStrategy botStrategy = new FourConnectBotStrategy(fcGame, fcRules);
        IMoveStrategy easyStrat = botStrategy.new EasyBotStrategy();

        FourConnectPlayer player = new FourConnectPlayer(Player.EASYBOT, easyStrat, null);

        assertSame(easyStrat, player.getStrategy());
    }

    @Test
    void getColourTest(){
        String testColour = fcHardPlayer.getColour();
        assertEquals(currentbranding.getSecondaryColor(), testColour);
    }


}
