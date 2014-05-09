

/* First created by JCasGen Fri May 09 02:35:07 CDT 2014 */
package mx.itam.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri May 09 02:35:09 CDT 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/video-pipeline/src/main/resources/vp-typeSystem.xml
 * @generated */
public class QueryAnnotation extends ConfigAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QueryAnnotation.class);
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
  protected QueryAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public QueryAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public QueryAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public QueryAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: image

  /** getter for image - gets 
   * @generated
   * @return value of the feature 
   */
  public String getImage() {
    if (QueryAnnotation_Type.featOkTst && ((QueryAnnotation_Type)jcasType).casFeat_image == null)
      jcasType.jcas.throwFeatMissing("image", "mx.itam.deiis.types.QueryAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QueryAnnotation_Type)jcasType).casFeatCode_image);}
    
  /** setter for image - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setImage(String v) {
    if (QueryAnnotation_Type.featOkTst && ((QueryAnnotation_Type)jcasType).casFeat_image == null)
      jcasType.jcas.throwFeatMissing("image", "mx.itam.deiis.types.QueryAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((QueryAnnotation_Type)jcasType).casFeatCode_image, v);}    
   
    
  //*--------------*
  //* Feature: dictionary

  /** getter for dictionary - gets 
   * @generated
   * @return value of the feature 
   */
  public PathType getDictionary() {
    if (QueryAnnotation_Type.featOkTst && ((QueryAnnotation_Type)jcasType).casFeat_dictionary == null)
      jcasType.jcas.throwFeatMissing("dictionary", "mx.itam.deiis.types.QueryAnnotation");
    return (PathType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QueryAnnotation_Type)jcasType).casFeatCode_dictionary)));}
    
  /** setter for dictionary - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDictionary(PathType v) {
    if (QueryAnnotation_Type.featOkTst && ((QueryAnnotation_Type)jcasType).casFeat_dictionary == null)
      jcasType.jcas.throwFeatMissing("dictionary", "mx.itam.deiis.types.QueryAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((QueryAnnotation_Type)jcasType).casFeatCode_dictionary, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    