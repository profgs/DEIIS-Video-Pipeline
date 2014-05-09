
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
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri May 09 02:35:08 CDT 2014
 * @generated */
public class ConfigAnnotation_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ConfigAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ConfigAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ConfigAnnotation(addr, ConfigAnnotation_Type.this);
  			   ConfigAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ConfigAnnotation(addr, ConfigAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ConfigAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("mx.itam.deiis.types.ConfigAnnotation");
 
  /** @generated */
  final Feature casFeat_experimentId;
  /** @generated */
  final int     casFeatCode_experimentId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getExperimentId(int addr) {
        if (featOkTst && casFeat_experimentId == null)
      jcas.throwFeatMissing("experimentId", "mx.itam.deiis.types.ConfigAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_experimentId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setExperimentId(int addr, String v) {
        if (featOkTst && casFeat_experimentId == null)
      jcas.throwFeatMissing("experimentId", "mx.itam.deiis.types.ConfigAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_experimentId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_origin;
  /** @generated */
  final int     casFeatCode_origin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOrigin(int addr) {
        if (featOkTst && casFeat_origin == null)
      jcas.throwFeatMissing("origin", "mx.itam.deiis.types.ConfigAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_origin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOrigin(int addr, int v) {
        if (featOkTst && casFeat_origin == null)
      jcas.throwFeatMissing("origin", "mx.itam.deiis.types.ConfigAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_origin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_target;
  /** @generated */
  final int     casFeatCode_target;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTarget(int addr) {
        if (featOkTst && casFeat_target == null)
      jcas.throwFeatMissing("target", "mx.itam.deiis.types.ConfigAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_target);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTarget(int addr, int v) {
        if (featOkTst && casFeat_target == null)
      jcas.throwFeatMissing("target", "mx.itam.deiis.types.ConfigAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_target, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ConfigAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_experimentId = jcas.getRequiredFeatureDE(casType, "experimentId", "uima.cas.String", featOkTst);
    casFeatCode_experimentId  = (null == casFeat_experimentId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_experimentId).getCode();

 
    casFeat_origin = jcas.getRequiredFeatureDE(casType, "origin", "mx.itam.deiis.types.PathType", featOkTst);
    casFeatCode_origin  = (null == casFeat_origin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_origin).getCode();

 
    casFeat_target = jcas.getRequiredFeatureDE(casType, "target", "mx.itam.deiis.types.PathType", featOkTst);
    casFeatCode_target  = (null == casFeat_target) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_target).getCode();

  }
}



    