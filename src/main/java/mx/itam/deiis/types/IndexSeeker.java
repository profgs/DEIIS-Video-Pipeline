

/* First created by JCasGen Fri May 09 02:35:07 CDT 2014 */
package mx.itam.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri May 09 02:35:09 CDT 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/video-pipeline/src/main/resources/vp-typeSystem.xml
 * @generated */
public class IndexSeeker extends ConfigAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(IndexSeeker.class);
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
  protected IndexSeeker() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public IndexSeeker(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public IndexSeeker(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public IndexSeeker(JCas jcas, int begin, int end) {
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
  //* Feature: sortType

  /** getter for sortType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSortType() {
    if (IndexSeeker_Type.featOkTst && ((IndexSeeker_Type)jcasType).casFeat_sortType == null)
      jcasType.jcas.throwFeatMissing("sortType", "mx.itam.deiis.types.IndexSeeker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndexSeeker_Type)jcasType).casFeatCode_sortType);}
    
  /** setter for sortType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSortType(String v) {
    if (IndexSeeker_Type.featOkTst && ((IndexSeeker_Type)jcasType).casFeat_sortType == null)
      jcasType.jcas.throwFeatMissing("sortType", "mx.itam.deiis.types.IndexSeeker");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndexSeeker_Type)jcasType).casFeatCode_sortType, v);}    
  }

    