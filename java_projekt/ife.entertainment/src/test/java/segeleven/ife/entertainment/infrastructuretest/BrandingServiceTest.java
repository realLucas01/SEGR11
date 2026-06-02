package segeleven.ife.entertainment.infrastructuretest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import segeleven.ife.entertainment.infrastructure.BrandingService;

class BrandingServiceTest {

  private BrandingService service;

  @BeforeEach
  void setUp() {
    service = BrandingService.getInstance();
    service.setPrimaryColor("#1a1a2e");
    service.setSecondaryColor("#e94560");
    service.setLogoPath("/segeleven/ife/entertainment/images/logo_default.png");
    service.setAirlineName("Default Airline");
  }

  @Test
  void testGetPrimaryColor() {
    assertEquals("#1a1a2e", service.getPrimaryColor());
  }

  @Test
  void testGetSecondaryColor() {
    assertEquals("#e94560", service.getSecondaryColor());
  }

  @Test
  void testGetLogoPath() {
    assertEquals("/segeleven/ife/entertainment/images/logo_default.png", service.getLogoPath());
  }

  @Test
  void testGetAirlineName() {
    assertEquals("Default Airline", service.getAirlineName());
  }

  @Test
  void testSetPrimaryColor() {
    service.setPrimaryColor("#ffffff");
    assertEquals("#ffffff", service.getPrimaryColor());
  }

  @Test
  void testSetSecondaryColor() {
    service.setSecondaryColor("#000000");
    assertEquals("#000000", service.getSecondaryColor());
  }

  @Test
  void testSetLogoPath() {
    service.setLogoPath("/new/path/logo.png");
    assertEquals("/new/path/logo.png", service.getLogoPath());
  }

  @Test
  void testSetAirlineName() {
    service.setAirlineName("Test Airline");
    assertEquals("Test Airline", service.getAirlineName());
  }

  @Test
  void testSingleton() {
    BrandingService service2 = BrandingService.getInstance();
    assertSame(service, service2);
  }
}
