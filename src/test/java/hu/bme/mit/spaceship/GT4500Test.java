package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GT4500Test {

  private TorpedoStore mockDA1 = new TorpedoStore(10);
  private TorpedoStore mockDA2 = new TorpedoStore(10);


  private GT4500 ship;

  @BeforeEach
  public void init(){

    mockDA1 = mock(TorpedoStore.class);
    mockDA2 =mock(TorpedoStore.class);
    this.ship = new GT4500(mockDA1,mockDA2);

  }

  @Test
  public void fireTorpedo_Single_Success(){
    // Arrange
    this.ship = ship;
    // Act


    boolean result = ship.fireTorpedo(FiringMode.SINGLE);

    // Assert
    assertEquals(true, result);
  }

  @Test
  public void fireTorpedo_All_Success(){
    // Arrange

    // Act
    boolean result = ship.fireTorpedo(FiringMode.ALL);

    // Assert
    assertEquals(true, result);
  }

}
