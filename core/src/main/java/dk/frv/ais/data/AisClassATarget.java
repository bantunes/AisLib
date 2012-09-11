/* Copyright (c) 2012 Danish Maritime Authority
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this library.  If not, see <http://www.gnu.org/licenses/>.
 */
package dk.frv.ais.data;

import dk.frv.ais.message.AisMessage;

/**
 * Class to represent a class A vessel target
 */
public class AisClassATarget extends AisVesselTarget {
	
	private static final long serialVersionUID = 1L;
	
	public AisClassATarget() {
		super();
	}
	
	@Override
	public void update(AisMessage aisMessage) {
		super.update(aisMessage);
	}
	
	public AisClassAPosition getClassAPosition() {
		return (AisClassAPosition)this.vesselPosition;
	}
	
	public AisClassAStatic getClassAStatic() {
		return (AisClassAStatic)this.vesselStatic;
	}

}
