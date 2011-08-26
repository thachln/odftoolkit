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
import org.odftoolkit.odfdom.dom.type.OdfBoolean;


/**
 * ODF DOM Element implementation for element "<text:conditional-text>".
 */
public abstract class OdfConditionalTextElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "conditional-text" );

    public OdfConditionalTextElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aCondition, String _aStringValueIfTrue, String _aStringValueIfFalse)
    {
        setCondition( _aCondition );
        setStringValueIfTrue( _aStringValueIfTrue );
        setStringValueIfFalse( _aStringValueIfFalse );
    }

    /**
     * Get value of attribute "text:condition".
     */
    public String getCondition()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "condition" ) );
    }

    /**
     * Set value of attribute "text:condition".
     */
    public void setCondition( String _aCondition )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "condition" ), _aCondition );
    }

    /**
     * Get value of attribute "text:string-value-if-true".
     */
    public String getStringValueIfTrue()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "string-value-if-true" ) );
    }

    /**
     * Set value of attribute "text:string-value-if-true".
     */
    public void setStringValueIfTrue( String _aStringValueIfTrue )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "string-value-if-true" ), _aStringValueIfTrue );
    }

    /**
     * Get value of attribute "text:string-value-if-false".
     */
    public String getStringValueIfFalse()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "string-value-if-false" ) );
    }

    /**
     * Set value of attribute "text:string-value-if-false".
     */
    public void setStringValueIfFalse( String _aStringValueIfFalse )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "string-value-if-false" ), _aStringValueIfFalse );
    }

    /**
     * Get value of attribute "text:current-value".
     */
    public Boolean getCurrentValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "current-value" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:current-value".
     */
    public void setCurrentValue( Boolean _aCurrentValue )
    {                    
        String aStringVal = OdfBoolean.toString( _aCurrentValue );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "current-value" ), aStringVal );
    }

}
