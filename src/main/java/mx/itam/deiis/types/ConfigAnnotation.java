

/* First created by JCasGen Fri May 09 02:35:07 CDT 2014 */
package mx.itam.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri May 09 02:35:08 CDT 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/video-pipeline/src/main/resources/vp-typeSystem.xml
 * @generated */
public class ConfigAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ConfigAnnotation.class);
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
  protected ConfigAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ConfigAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ConfigAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ConfigAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: experimentId

  /** getter for experimentId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getExperimentId() {
    if (ConfigAnnotation_Type.featOkTst && ((ConfigAnnotation_Type)jcasType).casFeat_experimentId == null)
      jcasType.jcas.throwFeatMissing("experimentId", "mx.itam.deiis.types.ConfigAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ConfigAnnotation_Type)jcasType).casFeatCode_experimentId);}
    
  /** setter for experimentId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setExperimentId(String v) {
    if (ConfigAnnotation_Type.featOkTst && ((ConfigAnnotation_Type)jcasType).casFeat_experimentId == null)
      jcasType.jcas.throwFeatMissing("experimentId", "mx.itam.deiis.types.ConfigAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((ConfigAnnotation_Type)jcasType).casFeatCode_experimentId, v);}    
   
    
  //*--------------*
  //* Feature: origin

  /** getter for origin - gets 
   * @generated
   * @return value of the feature 
   */
  public PathType getOrigin() {
    if (ConfigAnnotation_Type.featOkTst && ((ConfigAnnotation_Type)jcasType).casFeat_origin == null)
      jcasType.jcas.throwFeatMissing("origin", "mx.itam.deiis.types.ConfigAnnotation");
    return (PathType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ConfigAnnotation_Type)jcasType).casFeatCode_origin)));}
    
  /** setter for origin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrigin(PathType v) {
    if (ConfigAnnotation_Type.featOkTst && ((ConfigAnnotation_Type)jcasType).casFeat_origin == null)
      jcasType.jcas.throwFeatMissing("origin", "mx.itam.deiis.types.ConfigAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((ConfigAnnotation_Type)jcasType).casFeatCode_origin, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: target

  /** getter for target - gets 
   * @generated
   * @return value of the feature 
   */
  public PathType getTarget() {
    if (ConfigAnnotation_Type.featOkTst && ((ConfigAnnotation_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "mx.itam.deiis.types.ConfigAnnotation");
    return (PathType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ConfigAnnotation_Type)jcasType).casFeatCode_target)));}
    
  /** setter for target - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(PathType v) {
    if (ConfigAnnotation_Type.featOkTst && ((ConfigAnnotation_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "mx.itam.deiis.types.ConfigAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((ConfigAnnotation_Type)jcasType).casFeatCode_target, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    