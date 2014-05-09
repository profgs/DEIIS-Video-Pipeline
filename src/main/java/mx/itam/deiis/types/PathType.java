

/* First created by JCasGen Fri May 09 02:17:01 CDT 2014 */
package mx.itam.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri May 09 02:35:08 CDT 2014
 * XML source: /Users/IBAGNOG/Documents/workspace/video-pipeline/src/main/resources/vp-typeSystem.xml
 * @generated */
public class PathType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PathType.class);
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
  protected PathType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public PathType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public PathType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public PathType(JCas jcas, int begin, int end) {
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
  //* Feature: location

  /** getter for location - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLocation() {
    if (PathType_Type.featOkTst && ((PathType_Type)jcasType).casFeat_location == null)
      jcasType.jcas.throwFeatMissing("location", "mx.itam.deiis.types.PathType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PathType_Type)jcasType).casFeatCode_location);}
    
  /** setter for location - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLocation(String v) {
    if (PathType_Type.featOkTst && ((PathType_Type)jcasType).casFeat_location == null)
      jcasType.jcas.throwFeatMissing("location", "mx.itam.deiis.types.PathType");
    jcasType.ll_cas.ll_setStringValue(addr, ((PathType_Type)jcasType).casFeatCode_location, v);}    
   
    
  //*--------------*
  //* Feature: isFile

  /** getter for isFile - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsFile() {
    if (PathType_Type.featOkTst && ((PathType_Type)jcasType).casFeat_isFile == null)
      jcasType.jcas.throwFeatMissing("isFile", "mx.itam.deiis.types.PathType");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((PathType_Type)jcasType).casFeatCode_isFile);}
    
  /** setter for isFile - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsFile(boolean v) {
    if (PathType_Type.featOkTst && ((PathType_Type)jcasType).casFeat_isFile == null)
      jcasType.jcas.throwFeatMissing("isFile", "mx.itam.deiis.types.PathType");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((PathType_Type)jcasType).casFeatCode_isFile, v);}    
  }

    