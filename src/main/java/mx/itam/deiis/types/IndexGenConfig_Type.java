
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
public class IndexGenConfig_Type extends ConfigAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (IndexGenConfig_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = IndexGenConfig_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new IndexGenConfig(addr, IndexGenConfig_Type.this);
  			   IndexGenConfig_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new IndexGenConfig(addr, IndexGenConfig_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = IndexGenConfig.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("mx.itam.deiis.types.IndexGenConfig");
 
  /** @generated */
  final Feature casFeat_indexMethod;
  /** @generated */
  final int     casFeatCode_indexMethod;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getIndexMethod(int addr) {
        if (featOkTst && casFeat_indexMethod == null)
      jcas.throwFeatMissing("indexMethod", "mx.itam.deiis.types.IndexGenConfig");
    return ll_cas.ll_getStringValue(addr, casFeatCode_indexMethod);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIndexMethod(int addr, String v) {
        if (featOkTst && casFeat_indexMethod == null)
      jcas.throwFeatMissing("indexMethod", "mx.itam.deiis.types.IndexGenConfig");
    ll_cas.ll_setStringValue(addr, casFeatCode_indexMethod, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public IndexGenConfig_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_indexMethod = jcas.getRequiredFeatureDE(casType, "indexMethod", "uima.cas.String", featOkTst);
    casFeatCode_indexMethod  = (null == casFeat_indexMethod) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_indexMethod).getCode();

  }
}



    