

/* First created by JCasGen Fri May 09 02:35:07 CDT 2014 */
package mx.itam.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri May 09 02:35:09 CDT 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/video-pipeline/src/main/resources/vp-typeSystem.xml
 * @generated */
public class Result extends ConfigAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Result.class);
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
  protected Result() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Result(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Result(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Result(JCas jcas, int begin, int end) {
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
  //* Feature: N

  /** getter for N - gets 
   * @generated
   * @return value of the feature 
   */
  public int getN() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_N == null)
      jcasType.jcas.throwFeatMissing("N", "mx.itam.deiis.types.Result");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Result_Type)jcasType).casFeatCode_N);}
    
  /** setter for N - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setN(int v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_N == null)
      jcasType.jcas.throwFeatMissing("N", "mx.itam.deiis.types.Result");
    jcasType.ll_cas.ll_setIntValue(addr, ((Result_Type)jcasType).casFeatCode_N, v);}    
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets 
   * @generated
   * @return value of the feature 
   */
  public double getPrecision() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "mx.itam.deiis.types.Result");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Result_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrecision(double v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "mx.itam.deiis.types.Result");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Result_Type)jcasType).casFeatCode_precision, v);}    
  }

    