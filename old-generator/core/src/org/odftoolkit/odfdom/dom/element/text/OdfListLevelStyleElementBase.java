/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    
package org.odftoolkit.odfdom.dom.element.text;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.type.OdfPositiveInteger;


/**
 * ODF DOM base element implementation.
 */
public abstract class OdfListLevelStyleElementBase extends OdfStyleBase
{
    public OdfListLevelStyleElementBase( OdfFileDom _aOwnerDoc, OdfName element_name )
    {
        super( _aOwnerDoc, element_name );
    }
    /**
     * Initialize mandatory attributes.
     */
    public void init(Integer _aLevel)
    {
        setLevel( _aLevel );
    }
      
    /**
     * Get value of attribute "text:level".
     */
    public Integer getLevel()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "level" ) );
        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:level".
     */
    public void setLevel( Integer _aLevel )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aLevel );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "level" ), aStringVal );
    }

}
      