
/* First created by JCasGen Fri May 09 02:35:07 CDT 2014 */
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

/** 
 * Updated by JCasGen Fri May 09 02:35:08 CDT 2014
 * @generated */
public class FeatExtractConfig_Type extends ConfigAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (FeatExtractConfig_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = FeatExtractConfig_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new FeatExtractConfig(addr, FeatExtractConfig_Type.this);
  			   FeatExtractConfig_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new FeatExtractConfig(addr, FeatExtractConfig_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = FeatExtractConfig.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("mx.itam.deiis.types.FeatExtractConfig");
 
  /** @generated */
  final Feature casFeat_imgExt;
  /** @generated */
  final int     casFeatCode_imgExt;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getImgExt(int addr) {
        if (featOkTst && casFeat_imgExt == null)
      jcas.throwFeatMissing("imgExt", "mx.itam.deiis.types.FeatExtractConfig");
    return ll_cas.ll_getStringValue(addr, casFeatCode_imgExt);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setImgExt(int addr, String v) {
        if (featOkTst && casFeat_imgExt == null)
      jcas.throwFeatMissing("imgExt", "mx.itam.deiis.types.FeatExtractConfig");
    ll_cas.ll_setStringValue(addr, casFeatCode_imgExt, v);}
    
  
 
  /** @generated */
  final Feature casFeat_featMethod;
  /** @generated */
  final int     casFeatCode_featMethod;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFeatMethod(int addr) {
        if (featOkTst && casFeat_featMethod == null)
      jcas.throwFeatMissing("featMethod", "mx.itam.deiis.types.FeatExtractConfig");
    return ll_cas.ll_getStringValue(addr, casFeatCode_featMethod);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFeatMethod(int addr, String v) {
        if (featOkTst && casFeat_featMethod == null)
      jcas.throwFeatMissing("featMethod", "mx.itam.deiis.types.FeatExtractConfig");
    ll_cas.ll_setStringValue(addr, casFeatCode_featMethod, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public FeatExtractConfig_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_imgExt = jcas.getRequiredFeatureDE(casType, "imgExt", "uima.cas.String", featOkTst);
    casFeatCode_imgExt  = (null == casFeat_imgExt) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_imgExt).getCode();

 
    casFeat_featMethod = jcas.getRequiredFeatureDE(casType, "featMethod", "uima.cas.String", featOkTst);
    casFeatCode_featMethod  = (null == casFeat_featMethod) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_featMethod).getCode();

  }
}



    