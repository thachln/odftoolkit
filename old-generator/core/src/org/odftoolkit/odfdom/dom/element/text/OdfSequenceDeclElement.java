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
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeInteger;


/**
 * ODF DOM Element implementation for element "<text:sequence-decl>".
 */
public abstract class OdfSequenceDeclElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "sequence-decl" );

    public OdfSequenceDeclElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aName, Integer _aDisplayOutlineLevel)
    {
        setName( _aName );
        setDisplayOutlineLevel( _aDisplayOutlineLevel );
    }

    /**
     * Get value of attribute "text:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "name" ) );
    }

    /**
     * Set value of attribute "text:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "name" ), _aName );
    }

    /**
     * Get value of attribute "text:display-outline-level".
     */
    public Integer getDisplayOutlineLevel()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "display-outline-level" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:display-outline-level".
     */
    public void setDisplayOutlineLevel( Integer _aDisplayOutlineLevel )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aDisplayOutlineLevel );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "display-outline-level" ), aStringVal );
    }

    /**
     * Get value of attribute "text:separation-character".
     */
    public String getSeparationCharacter()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "separation-character" ) );
    }

    /**
     * Set value of attribute "text:separation-character".
     */
    public void setSeparationCharacter( String _aSeparationCharacter )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "separation-character" ), _aSeparationCharacter );
    }

}
