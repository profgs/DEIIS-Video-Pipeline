

/* First created by JCasGen Fri May 09 02:35:07 CDT 2014 */
package mx.itam.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri May 09 02:35:09 CDT 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/video-pipeline/src/main/resources/vp-typeSystem.xml
 * @generated */
public class InitConfig extends ConfigAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(InitConfig.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected InitConfig() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public InitConfig(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public InitConfig(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public InitConfig(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: experimentID

  /** getter for experimentID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getExperimentID() {
    if (InitConfig_Type.featOkTst && ((InitConfig_Type)jcasType).casFeat_experimentID == null)
      jcasType.jcas.throwFeatMissing("experimentID", "mx.itam.deiis.types.InitConfig");
    return jcasType.ll_cas.ll_getStringValue(addr, ((InitConfig_Type)jcasType).casFeatCode_experimentID);}
    
  /** setter for experimentID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setExperimentID(String v) {
    if (InitConfig_Type.featOkTst && ((InitConfig_Type)jcasType).casFeat_experimentID == null)
      jcasType.jcas.throwFeatMissing("experimentID", "mx.itam.deiis.types.InitConfig");
    jcasType.ll_cas.ll_setStringValue(addr, ((InitConfig_Type)jcasType).casFeatCode_experimentID, v);}    
  }

    