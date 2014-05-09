

/* First created by JCasGen Fri May 09 02:35:07 CDT 2014 */
package mx.itam.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri May 09 02:35:08 CDT 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/video-pipeline/src/main/resources/vp-typeSystem.xml
 * @generated */
public class DictGenConfig extends ConfigAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DictGenConfig.class);
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
  protected DictGenConfig() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DictGenConfig(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DictGenConfig(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DictGenConfig(JCas jcas, int begin, int end) {
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
  //* Feature: clusterMethod

  /** getter for clusterMethod - gets 
   * @generated
   * @return value of the feature 
   */
  public String getClusterMethod() {
    if (DictGenConfig_Type.featOkTst && ((DictGenConfig_Type)jcasType).casFeat_clusterMethod == null)
      jcasType.jcas.throwFeatMissing("clusterMethod", "mx.itam.deiis.types.DictGenConfig");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DictGenConfig_Type)jcasType).casFeatCode_clusterMethod);}
    
  /** setter for clusterMethod - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setClusterMethod(String v) {
    if (DictGenConfig_Type.featOkTst && ((DictGenConfig_Type)jcasType).casFeat_clusterMethod == null)
      jcasType.jcas.throwFeatMissing("clusterMethod", "mx.itam.deiis.types.DictGenConfig");
    jcasType.ll_cas.ll_setStringValue(addr, ((DictGenConfig_Type)jcasType).casFeatCode_clusterMethod, v);}    
   
    
  //*--------------*
  //* Feature: dictionarySize

  /** getter for dictionarySize - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDictionarySize() {
    if (DictGenConfig_Type.featOkTst && ((DictGenConfig_Type)jcasType).casFeat_dictionarySize == null)
      jcasType.jcas.throwFeatMissing("dictionarySize", "mx.itam.deiis.types.DictGenConfig");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DictGenConfig_Type)jcasType).casFeatCode_dictionarySize);}
    
  /** setter for dictionarySize - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDictionarySize(int v) {
    if (DictGenConfig_Type.featOkTst && ((DictGenConfig_Type)jcasType).casFeat_dictionarySize == null)
      jcasType.jcas.throwFeatMissing("dictionarySize", "mx.itam.deiis.types.DictGenConfig");
    jcasType.ll_cas.ll_setIntValue(addr, ((DictGenConfig_Type)jcasType).casFeatCode_dictionarySize, v);}    
  }

    