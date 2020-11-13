// AID-GENERATED
// =========================================================================
// This class was generated by AID - Abstract Interface Definition          
// DO NOT MODIFY, but use the org.freehep.aid.Aid utility to regenerate it. 
// =========================================================================

package hep.lcio.event;


/** Global constants used in LCIO.
 *
 * @author gaede
 * @version $Id: LCIO.aid,v 1.77 2010-10-29 10:26:09 gaede Exp $
 * @see LCObject
 * @see LCIO
 */
public interface LCIO {

    // it seems to be impossible to have one declaration for
    // static constants in Java and C++ - so we need to define
    // the same constants twice !!
    // current version number of lcio
    public final static int MAJORVERSION = 2;

    public final static int MINORVERSION = 7;

  // bits in flag words
  // SimCalorimeterHit (CH)
    public final static int CHBIT_LONG = 31;

  // long(1) - short(0) , incl./excl. position
    public final static int CHBIT_BARREL = 30;

  // barrel(1) - endcap(0)
    public final static int CHBIT_ID1 = 29;

  // cellid1 stored
    public final static int CHBIT_PDG = 28;

  // PDG(1) - no PDG(0) (detailed shower contributions) // DEPRECATED use: CHBIT_STEP
    public final static int CHBIT_STEP = 28;

   // detailed shower contributions 
    // (raw) calorimeter hit
    public final static int RCHBIT_LONG = 31;

  // long(1) - short(0) , incl./excl. position
    public final static int RCHBIT_BARREL = 30;

  // barrel(1) - endcap(0)
    public final static int RCHBIT_ID1 = 29;

  // cellid1 stored
    public final static int RCHBIT_NO_PTR = 28;

 // 1: pointer tag not added
    public final static int RCHBIT_TIME = 27;

 // 1: time information stored
    public final static int RCHBIT_ENERGY_ERROR = 26;

  // 1: store energy error
  // raw tracker data (pulses)
    public final static int TRAWBIT_ID1 = 31;

  //  cellid1 stored
    public final static int TRAWBIT_CM = 30;

  //  cov matrix stored(1) - not stored(0)
  // raw tracker hit
    public final static int RTHBIT_ID1 = 31;

  //  cellid1 stored
  // TrackerHitPlane
    public final static int RTHPBIT_ID1 = 31;

  //  cellid1 stored
  // TrackerHitZCylinder
    public final static int RTHZBIT_ID1 = 31;

  //  cellid1 stored
  // SimTrackerHit
    public final static int THBIT_BARREL = 31;

 // barrel(1) - endcap(0)
    public final static int THBIT_MOMENTUM = 30;

 // momentum of particle stored(1) - not stored(0)
    public final static int THBIT_ID1 = 29;

 // cellid1 stored
  // Tracks
    public final static int TRBIT_HITS = 31;

 // hits stored(1) - not stored(0)
  // Cluster
    public final static int CLBIT_HITS = 31;

 // hits stored(1) - not stored(0)
  // TPCHit
    public final static int TPCBIT_RAW = 31;

 // raw data stored(1) - not stored(0)
    public final static int TPCBIT_NO_PTR = 30;

 // 1: pointer tag not added (needed for TrackerHit)
    // LCRelation
    //  public static const int LCREL_ONE2MANY = 31 ; // relation is one to many
    public final static int LCREL_WEIGHTED = 31;

 // relations has weights
  // LCGenericObject
    public final static int GOBIT_FIXED = 31;

 // is fixed size
    public final static int READ_ONLY = 0;

    public final static int UPDATE = 1;

    public final static int ERROR = 0;

    public final static int SUCCESS = 1;

  //write modes
    public final static int WRITE_NEW = 0;

    public final static int WRITE_APPEND = 1;

    // type names:
    public final static String LCEVENT = "LCEvent";

    public final static String LCRUNHEADER = "LCRunHeader";

    public final static String LCCOLLECTION = "LCCollection";

    public final static String MCPARTICLE = "MCParticle";

    public final static String SIMCALORIMETERHIT = "SimCalorimeterHit";

    public final static String RAWCALORIMETERHIT = "RawCalorimeterHit";

    public final static String CALORIMETERHIT = "CalorimeterHit";

    public final static String SIMTRACKERHIT = "SimTrackerHit";

    public final static String TPCHIT = "TPCHit";

    public final static String TRACKERRAWDATA = "TrackerRawData";

    public final static String TRACKERDATA = "TrackerData";

    public final static String TRACKERPULSE = "TrackerPulse";

    public final static String TRACKERHIT = "TrackerHit";

    public final static String TRACKERHITPLANE = "TrackerHitPlane";

    public final static String TRACKERHITZCYLINDER = "TrackerHitZCylinder";

    public final static String LCSTRVEC = "LCStrVec";

    public final static String LCFLOATVEC = "LCFloatVec";

    public final static String LCINTVEC = "LCIntVec";

    public final static String TRACK = "Track";

    public final static String TRACKSTATE = "TrackState";

    public final static String CLUSTER = "Cluster";

    public final static String RECONSTRUCTEDPARTICLE = "ReconstructedParticle";

    public final static String LCRELATION = "LCRelation";

    public final static String LCGENERICOBJECT = "LCGenericObject";

    public final static String PARTICLEID = "ParticleID";

    public final static String VERTEX = "Vertex";

  // reserved names, e.g. name of event/collections paramaters
    public final static String CellIDEncoding = "CellIDEncoding";
} // class or interface
