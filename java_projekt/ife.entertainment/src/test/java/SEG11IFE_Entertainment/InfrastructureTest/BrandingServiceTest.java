package SEG11IFE_Entertainment.InfrastructureTest;

import SEG11.IFE_Entertainment.Infrastructure.BrandingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BrandingServiceTest {

    private BrandingService service;

    @BeforeEach
    public void setUp() {
        service = BrandingService.getInstance();
        service.setPrimaryColor("#1a1a2e");
        service.setSecondaryColor("#e94560");
        service.setLogoPath("/SEG11/IFE_Entertainment/images/logo_default.png");
        service.setAirlineName("Default Airline");
    }

    @Test
    public void testGetPrimaryColor() {
        assertEquals("#1a1a2e", service.getPrimaryColor());
    }

    @Test
    public void testGetSecondaryColor() {
        assertEquals("#e94560", service.getSecondaryColor());
    }

    @Test
    public void testGetLogoPath() {
        assertEquals("/SEG11/IFE_Entertainment/images/logo_default.png", service.getLogoPath());
    }

    @Test
    public void testGetAirlineName() {
        assertEquals("Default Airline", service.getAirlineName());
    }

    @Test
    public void testSetPrimaryColor() {
        service.setPrimaryColor("#ffffff");
        assertEquals("#ffffff", service.getPrimaryColor());
    }

    @Test
    public void testSetSecondaryColor() {
        service.setSecondaryColor("#000000");
        assertEquals("#000000", service.getSecondaryColor());
    }

    @Test
    public void testSetLogoPath() {
        service.setLogoPath("/new/path/logo.png");
        assertEquals("/new/path/logo.png", service.getLogoPath());
    }

    @Test
    public void testSetAirlineName() {
        service.setAirlineName("Test Airline");
        assertEquals("Test Airline", service.getAirlineName());
    }

    @Test
    public void testSingleton() {
        BrandingService service2 = BrandingService.getInstance();
        assertSame(service, service2);
    }
}