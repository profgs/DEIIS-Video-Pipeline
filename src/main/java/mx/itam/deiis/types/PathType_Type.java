
/* First created by JCasGen Fri May 09 02:17:01 CDT 2014 */
package mx.itam.deiis.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri May 09 02:35:08 CDT 2014
 * @generated */
public class PathType_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PathType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PathType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PathType(addr, PathType_Type.this);
  			   PathType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PathType(addr, PathType_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PathType.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("mx.itam.deiis.types.PathType");



  /** @generated */
  final Feature casFeat_location;
  /** @generated */
  final int     casFeatCode_location;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLocation(int addr) {
        if (featOkTst && casFeat_location == null)
      jcas.throwFeatMissing("location", "mx.itam.deiis.types.PathType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_location);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLocation(int addr, String v) {
        if (featOkTst && casFeat_location == null)
      jcas.throwFeatMissing("location", "mx.itam.deiis.types.PathType");
    ll_cas.ll_setStringValue(addr, casFeatCode_location, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isFile;
  /** @generated */
  final int     casFeatCode_isFile;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsFile(int addr) {
        if (featOkTst && casFeat_isFile == null)
      jcas.throwFeatMissing("isFile", "mx.itam.deiis.types.PathType");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isFile);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsFile(int addr, boolean v) {
        if (featOkTst && casFeat_isFile == null)
      jcas.throwFeatMissing("isFile", "mx.itam.deiis.types.PathType");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isFile, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public PathType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_location = jcas.getRequiredFeatureDE(casType, "location", "uima.cas.String", featOkTst);
    casFeatCode_location  = (null == casFeat_location) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_location).getCode();

 
    casFeat_isFile = jcas.getRequiredFeatureDE(casType, "isFile", "uima.cas.Boolean", featOkTst);
    casFeatCode_isFile  = (null == casFeat_isFile) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isFile).getCode();

  }
}



    