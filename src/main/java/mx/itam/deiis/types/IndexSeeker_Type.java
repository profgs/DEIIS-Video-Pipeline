
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
public class IndexSeeker_Type extends ConfigAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (IndexSeeker_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = IndexSeeker_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new IndexSeeker(addr, IndexSeeker_Type.this);
  			   IndexSeeker_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new IndexSeeker(addr, IndexSeeker_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = IndexSeeker.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("mx.itam.deiis.types.IndexSeeker");
 
  /** @generated */
  final Feature casFeat_sortType;
  /** @generated */
  final int     casFeatCode_sortType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSortType(int addr) {
        if (featOkTst && casFeat_sortType == null)
      jcas.throwFeatMissing("sortType", "mx.itam.deiis.types.IndexSeeker");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sortType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSortType(int addr, String v) {
        if (featOkTst && casFeat_sortType == null)
      jcas.throwFeatMissing("sortType", "mx.itam.deiis.types.IndexSeeker");
    ll_cas.ll_setStringValue(addr, casFeatCode_sortType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public IndexSeeker_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sortType = jcas.getRequiredFeatureDE(casType, "sortType", "uima.cas.String", featOkTst);
    casFeatCode_sortType  = (null == casFeat_sortType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sortType).getCode();

  }
}



    