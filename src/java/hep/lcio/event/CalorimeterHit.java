// AID-GENERATED
// =========================================================================
// This class was generated by AID - Abstract Interface Definition          
// DO NOT MODIFY, but use the org.freehep.aid.Aid utility to regenerate it. 
// =========================================================================

package hep.lcio.event;


/** The generic calorimeter hit - created from SimCalorimeterHit or
 *  RawCalorimeterHit. The difference to RawCalorimeterHit is that amplitude
 *  ( energy) and time are now float and an optional position (x,y,z) can be stored
 *  with the hit.
 *  In order to suppress a (32-bit) pointer tag stored with every hit set
 *  flag(LCIO::RCHBIT_NO_PTR)==1. 
 *  
 * @author gaede
 * @version $Id: CalorimeterHit.aid,v 1.16 2008-06-04 17:37:15 engels Exp $
 */

public interface CalorimeterHit extends LCObject {

    /** Returns the detector specific (geometrical) cell id.
     */
    public int getCellID0();

    /** Returns the second detector specific (geometrical) cell id. Optional, check/set 
     *  flag(LCIO::RCHBIT_ID1)==1.
     */
    public int getCellID1();

    /** Returns the energy of the hit in [GeV].
     */
    public float getEnergy();

    /** Returns the error of the hit energy in [GeV]. Optional, check/set
     *  flag(LCIO::RCHBIT_ENERGY_ERROR)==1.
     */
    public float getEnergyError();

    /** Returns the time of the hit in [ns]. Optional, check/set 
     *  flag(LCIO::RCHBIT_TIME)==1.
     */
    public float getTime();

    /** Returns the position of the hit in world coordinates.
     *  NULL if information is not stored - check 
     *  flag(LCIO::RCHBIT_LONG)==1.
     */
    public float[] getPosition();

    /** Type of hit. Mapping of integer types to type names
     * through collection parameters "CalorimeterHitTypeNames"
     * and "CalorimeterHitTypeValues".
     */
    public int getType();

    /** The RawCalorimeterHit. As in the future there might be other types of 
     *  raw calorimeter hits the return type is LCObject.
     */
    public LCObject getRawHit();
} // class or interface

