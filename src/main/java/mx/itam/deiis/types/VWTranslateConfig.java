

/* First created by JCasGen Fri May 09 02:35:07 CDT 2014 */
package mx.itam.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri May 09 02:35:09 CDT 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/video-pipeline/src/main/resources/vp-typeSystem.xml
 * @generated */
public class VWTranslateConfig extends ConfigAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(VWTranslateConfig.class);
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
  protected VWTranslateConfig() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public VWTranslateConfig(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public VWTranslateConfig(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public VWTranslateConfig(JCas jcas, int begin, int end) {
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
  //* Feature: classifierMethod

  /** getter for classifierMethod - gets 
   * @generated
   * @return value of the feature 
   */
  public String getClassifierMethod() {
    if (VWTranslateConfig_Type.featOkTst && ((VWTranslateConfig_Type)jcasType).casFeat_classifierMethod == null)
      jcasType.jcas.throwFeatMissing("classifierMethod", "mx.itam.deiis.types.VWTranslateConfig");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VWTranslateConfig_Type)jcasType).casFeatCode_classifierMethod);}
    
  /** setter for classifierMethod - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setClassifierMethod(String v) {
    if (VWTranslateConfig_Type.featOkTst && ((VWTranslateConfig_Type)jcasType).casFeat_classifierMethod == null)
      jcasType.jcas.throwFeatMissing("classifierMethod", "mx.itam.deiis.types.VWTranslateConfig");
    jcasType.ll_cas.ll_setStringValue(addr, ((VWTranslateConfig_Type)jcasType).casFeatCode_classifierMethod, v);}    
   
    
  //*--------------*
  //* Feature: dictionary

  /** getter for dictionary - gets 
   * @generated
   * @return value of the feature 
   */
  public PathType getDictionary() {
    if (VWTranslateConfig_Type.featOkTst && ((VWTranslateConfig_Type)jcasType).casFeat_dictionary == null)
      jcasType.jcas.throwFeatMissing("dictionary", "mx.itam.deiis.types.VWTranslateConfig");
    return (PathType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((VWTranslateConfig_Type)jcasType).casFeatCode_dictionary)));}
    
  /** setter for dictionary - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDictionary(PathType v) {
    if (VWTranslateConfig_Type.featOkTst && ((VWTranslateConfig_Type)jcasType).casFeat_dictionary == null)
      jcasType.jcas.throwFeatMissing("dictionary", "mx.itam.deiis.types.VWTranslateConfig");
    jcasType.ll_cas.ll_setRefValue(addr, ((VWTranslateConfig_Type)jcasType).casFeatCode_dictionary, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    