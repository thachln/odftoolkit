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
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;
import org.odftoolkit.odfdom.dom.type.style.OdfIndexTabStopType;


/**
 * ODF DOM Element implementation for element "<text:index-entry-tab-stop>".
 */
public abstract class OdfIndexEntryTabStopElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "index-entry-tab-stop" );

    public OdfIndexEntryTabStopElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME, OdfStyleFamily.Text, OdfName.get( OdfNamespace.TEXT, "style-name" ) );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "text:style-name".
     */
    public String getStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:style-name".
     */
    public void setStyleName( String _aStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "style:leader-char".
     */
    public String getLeaderChar()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "leader-char" ) );
    }

    /**
     * Set value of attribute "style:leader-char".
     */
    public void setLeaderChar( String _aLeaderChar )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "leader-char" ), _aLeaderChar );
    }

    /**
     * Get value of attribute "style:type".
     */
    public OdfIndexTabStopType getType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "type" ) );
        return OdfIndexTabStopType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:type".
     */
    public void setType( OdfIndexTabStopType _aType )
    {                    
        String aStringVal = OdfIndexTabStopType.toString( _aType );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "type" ), aStringVal );
    }

    /**
     * Get value of attribute "style:position".
     */
    public String getPosition()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "position" ) );
    }

    /**
     * Set value of attribute "style:position".
     */
    public void setPosition( String _aPosition )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "position" ), _aPosition );
    }

}
