

/* First created by JCasGen Fri May 09 02:35:07 CDT 2014 */
package mx.itam.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri May 09 02:35:09 CDT 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/video-pipeline/src/main/resources/vp-typeSystem.xml
 * @generated */
public class ScoreAnnotation extends ConfigAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ScoreAnnotation.class);
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
  protected ScoreAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ScoreAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ScoreAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ScoreAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: scoreMetric

  /** getter for scoreMetric - gets 
   * @generated
   * @return value of the feature 
   */
  public String getScoreMetric() {
    if (ScoreAnnotation_Type.featOkTst && ((ScoreAnnotation_Type)jcasType).casFeat_scoreMetric == null)
      jcasType.jcas.throwFeatMissing("scoreMetric", "mx.itam.deiis.types.ScoreAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ScoreAnnotation_Type)jcasType).casFeatCode_scoreMetric);}
    
  /** setter for scoreMetric - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScoreMetric(String v) {
    if (ScoreAnnotation_Type.featOkTst && ((ScoreAnnotation_Type)jcasType).casFeat_scoreMetric == null)
      jcasType.jcas.throwFeatMissing("scoreMetric", "mx.itam.deiis.types.ScoreAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((ScoreAnnotation_Type)jcasType).casFeatCode_scoreMetric, v);}    
  }

    