
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
public class Result_Type extends ConfigAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Result_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Result_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Result(addr, Result_Type.this);
  			   Result_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Result(addr, Result_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Result.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("mx.itam.deiis.types.Result");
 
  /** @generated */
  final Feature casFeat_N;
  /** @generated */
  final int     casFeatCode_N;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getN(int addr) {
        if (featOkTst && casFeat_N == null)
      jcas.throwFeatMissing("N", "mx.itam.deiis.types.Result");
    return ll_cas.ll_getIntValue(addr, casFeatCode_N);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setN(int addr, int v) {
        if (featOkTst && casFeat_N == null)
      jcas.throwFeatMissing("N", "mx.itam.deiis.types.Result");
    ll_cas.ll_setIntValue(addr, casFeatCode_N, v);}
    
  
 
  /** @generated */
  final Feature casFeat_precision;
  /** @generated */
  final int     casFeatCode_precision;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPrecision(int addr) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "mx.itam.deiis.types.Result");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_precision);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrecision(int addr, double v) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "mx.itam.deiis.types.Result");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_precision, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Result_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_N = jcas.getRequiredFeatureDE(casType, "N", "uima.cas.Integer", featOkTst);
    casFeatCode_N  = (null == casFeat_N) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_N).getCode();

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Double", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

  }
}



    