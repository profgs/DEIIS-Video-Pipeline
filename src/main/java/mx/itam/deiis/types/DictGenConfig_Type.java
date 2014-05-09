
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
public class DictGenConfig_Type extends ConfigAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DictGenConfig_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DictGenConfig_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DictGenConfig(addr, DictGenConfig_Type.this);
  			   DictGenConfig_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DictGenConfig(addr, DictGenConfig_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DictGenConfig.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("mx.itam.deiis.types.DictGenConfig");
 
  /** @generated */
  final Feature casFeat_clusterMethod;
  /** @generated */
  final int     casFeatCode_clusterMethod;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getClusterMethod(int addr) {
        if (featOkTst && casFeat_clusterMethod == null)
      jcas.throwFeatMissing("clusterMethod", "mx.itam.deiis.types.DictGenConfig");
    return ll_cas.ll_getStringValue(addr, casFeatCode_clusterMethod);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setClusterMethod(int addr, String v) {
        if (featOkTst && casFeat_clusterMethod == null)
      jcas.throwFeatMissing("clusterMethod", "mx.itam.deiis.types.DictGenConfig");
    ll_cas.ll_setStringValue(addr, casFeatCode_clusterMethod, v);}
    
  
 
  /** @generated */
  final Feature casFeat_dictionarySize;
  /** @generated */
  final int     casFeatCode_dictionarySize;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDictionarySize(int addr) {
        if (featOkTst && casFeat_dictionarySize == null)
      jcas.throwFeatMissing("dictionarySize", "mx.itam.deiis.types.DictGenConfig");
    return ll_cas.ll_getIntValue(addr, casFeatCode_dictionarySize);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDictionarySize(int addr, int v) {
        if (featOkTst && casFeat_dictionarySize == null)
      jcas.throwFeatMissing("dictionarySize", "mx.itam.deiis.types.DictGenConfig");
    ll_cas.ll_setIntValue(addr, casFeatCode_dictionarySize, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DictGenConfig_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_clusterMethod = jcas.getRequiredFeatureDE(casType, "clusterMethod", "uima.cas.String", featOkTst);
    casFeatCode_clusterMethod  = (null == casFeat_clusterMethod) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_clusterMethod).getCode();

 
    casFeat_dictionarySize = jcas.getRequiredFeatureDE(casType, "dictionarySize", "uima.cas.Integer", featOkTst);
    casFeatCode_dictionarySize  = (null == casFeat_dictionarySize) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dictionarySize).getCode();

  }
}



    