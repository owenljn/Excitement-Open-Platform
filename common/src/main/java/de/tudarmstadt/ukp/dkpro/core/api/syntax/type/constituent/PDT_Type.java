
/* First created by JCasGen Fri Oct 05 20:16:25 CEST 2012 */
package de.tudarmstadt.ukp.dkpro.core.api.syntax.type.constituent;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Fri Oct 05 20:16:25 CEST 2012
 * @generated */
public class PDT_Type extends Constituent_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PDT_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PDT_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PDT(addr, PDT_Type.this);
  			   PDT_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PDT(addr, PDT_Type.this);
  	  }
    };
  /** @generated */
  //@SuppressWarnings ("hiding")
  public final static int typeIndexID = PDT.typeIndexID;
  /** @generated 
     @modifiable */
  //@SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.tudarmstadt.ukp.dkpro.core.api.syntax.type.constituent.PDT");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public PDT_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    