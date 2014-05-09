
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
 * Updated by JCasGen Fri May 09 02:35:09 CDT 2014
 * @generated */
public class InitConfig_Type extends ConfigAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (InitConfig_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = InitConfig_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new InitConfig(addr, InitConfig_Type.this);
  			   InitConfig_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new InitConfig(addr, InitConfig_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = InitConfig.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("mx.itam.deiis.types.InitConfig");
 
  /** @generated */
  final Feature casFeat_experimentID;
  /** @generated */
  final int     casFeatCode_experimentID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getExperimentID(int addr) {
        if (featOkTst && casFeat_experimentID == null)
      jcas.throwFeatMissing("experimentID", "mx.itam.deiis.types.InitConfig");
    return ll_cas.ll_getStringValue(addr, casFeatCode_experimentID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setExperimentID(int addr, String v) {
        if (featOkTst && casFeat_experimentID == null)
      jcas.throwFeatMissing("experimentID", "mx.itam.deiis.types.InitConfig");
    ll_cas.ll_setStringValue(addr, casFeatCode_experimentID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public InitConfig_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_experimentID = jcas.getRequiredFeatureDE(casType, "experimentID", "uima.cas.String", featOkTst);
    casFeatCode_experimentID  = (null == casFeat_experimentID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_experimentID).getCode();

  }
}



    