package dk.frv.ais.test.decode;

import org.junit.Assert;
import org.junit.Test;

import dk.frv.ais.message.NavigationalStatus;
import dk.frv.ais.message.ShipTypeCargo;

public class ShipTypeCargoNavStatusTest {

	/**
	 * Example of using the custom ShipTypeCargo class
	 * 
	 */
	@Test
	public void parseShips() {

		System.out.println("ShipTypeCargo testing:");

		int pilot = 50;
		int military = 35;
		int medical = 58;
		int wig = 20;
		int cargoD = 74;
		int tankerA = 81;

		// Prepare Ships
		ShipTypeCargo shipPilot = new ShipTypeCargo(pilot);
		ShipTypeCargo shipMilitary = new ShipTypeCargo(military);
		ShipTypeCargo shipMedical = new ShipTypeCargo(medical);
		ShipTypeCargo shipWig = new ShipTypeCargo(wig);
		ShipTypeCargo shipCargoD = new ShipTypeCargo(cargoD);
		ShipTypeCargo shipTankerA = new ShipTypeCargo(tankerA);

		System.out.println(shipPilot);
		Assert.assertEquals(shipPilot.prettyType(), "Pilot");

		System.out.println(shipMilitary);
		Assert.assertEquals(shipMilitary.prettyType(), "Military");

		System.out.println(shipMedical);
		Assert.assertEquals(shipMedical.prettyType(), "Medical");

		System.out.println(shipWig);
		Assert.assertEquals(shipWig.prettyType(), "WIG");

		System.out.println(shipCargoD);
		Assert.assertEquals(shipCargoD.prettyType(), "Cargo");

		System.out.println(shipTankerA);
		Assert.assertEquals(shipTankerA.prettyType(), "Tanker");

	}

	/**
	 * Example of using the custom NavigationalStatus class
	 * 
	 */
	@Test
	public void parseNavStatus() {
		System.out.println("NavigationalStatus testing:");
		int under_way_using_engine = 0;
		int moored = 5;
		int engaged_in_fishing = 7;
		int ais_sart = 14;

		// Prepare Ships
		NavigationalStatus underWayUsingengine = new NavigationalStatus(under_way_using_engine);
		NavigationalStatus moored2 = new NavigationalStatus(moored);
		NavigationalStatus engagedInFishing = new NavigationalStatus(engaged_in_fishing);
		NavigationalStatus aisSart = new NavigationalStatus(ais_sart);

		System.out.println(underWayUsingengine);
		Assert.assertEquals(underWayUsingengine.prettyStatus(), "Under way using engine");

		System.out.println(moored2);
		Assert.assertEquals(moored2.prettyStatus(), "Moored");

		System.out.println(engagedInFishing);
		Assert.assertEquals(engagedInFishing.prettyStatus(), "Engaged in fishing");

		System.out.println(aisSart);
		Assert.assertEquals(aisSart.prettyStatus(), "AIS-SART");

	}

}
